package com.inditex.api.ecomerce.ecomerceapi.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.inditex.api.ecomerce.ecomerceapi.model.PricesResponse;
import com.inditex.api.ecomerce.ecomerceapi.repository.Entity.Prices;
@Component
@Mapper (componentModel = "spring")
public interface PricesMapper {
    PricesMapper INSTANCE = Mappers.getMapper(PricesMapper.class);

    @Mapping(source = "productId", target = "productId")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "startDate", target = "startDate")
    @Mapping(source = "endDate", target = "endDate")
    PricesResponse toPricesResponse(Prices prices);

}

