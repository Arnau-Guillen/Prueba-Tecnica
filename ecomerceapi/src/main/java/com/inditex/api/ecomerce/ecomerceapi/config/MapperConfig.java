package com.inditex.api.ecomerce.ecomerceapi.config;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.inditex.api.ecomerce.ecomerceapi.service.mapper.PricesMapper;

@Configuration
public class MapperConfig {
    
    @Bean
    public PricesMapper pricesMapper() {
        return Mappers.getMapper(PricesMapper.class);
    }
}