package com.inditex.api.ecomerce.ecomerceapi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.api.ecomerce.ecomerceapi.model.PricesResponse;
import com.inditex.api.ecomerce.ecomerceapi.service.PricesService;

@RestController
@RequestMapping("api") 
public class PricesController {
    @Autowired
    PricesService pricesService;

    @GetMapping ("getPrices")
    public PricesResponse getPrices(
            @RequestParam String startDate,
            @RequestParam int productId,
            @RequestParam int brandId){
    
     return pricesService.findPrices(startDate, productId, brandId);
    }
}

