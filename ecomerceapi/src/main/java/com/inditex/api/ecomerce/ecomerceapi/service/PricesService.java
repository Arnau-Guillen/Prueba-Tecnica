package com.inditex.api.ecomerce.ecomerceapi.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inditex.api.ecomerce.ecomerceapi.model.PricesResponse;
import com.inditex.api.ecomerce.ecomerceapi.repository.PricesRepository;
import com.inditex.api.ecomerce.ecomerceapi.repository.Entity.Prices;
import com.inditex.api.ecomerce.ecomerceapi.service.mapper.PricesMapper;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class PricesService {

  @Autowired
  private PricesRepository pricesRepository;
  @Autowired
  private PricesMapper pricesMapper;

/**
 * Get information from preces data base by product id
 * @return
 * @throws ParseException 
 */
   public PricesResponse findPrices(final String start,final int productId, final int brandId){
    String timestamp = start;
    List<Prices> pricesList = null;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");   
    try {
      pricesList = pricesRepository.findByStartDateAndProductIdAndBrandId(formatter.parse(timestamp), productId, brandId);
    } catch (Exception e) {
      log.error("ecomerceapi - PricesRepository.findPrices() - ERROR: " + e.getMessage());
    }
    return pricesList.isEmpty() ?  new PricesResponse() : pricesMapper.toPricesResponse(pricesList.get(0));
   }

}
