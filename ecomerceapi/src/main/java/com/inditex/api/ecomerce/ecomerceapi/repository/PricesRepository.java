package com.inditex.api.ecomerce.ecomerceapi.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inditex.api.ecomerce.ecomerceapi.repository.Entity.Prices;

public interface PricesRepository extends JpaRepository<Prices, Integer> {
    List<Prices> findByStartDateAndProductIdAndBrandId (final Date startDate, final int productId, final int brandId);
}
