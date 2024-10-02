package com.inditex.api.ecomerce.ecomerceapi.repository.Entity;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Prices {

    @Column(name = "BRAND_ID")
    @Id
    private  Integer brandId;

    @Column(name = "START_DATE")
    private  Date startDate;

    @Column(name = "END_DATE")
    private  Date endDate;

    @Column(name = "PRICE_LIST")
    private  int priceList;

    @Column(name = "PRODUCT_ID")
    private  int productId;

    @Column(name = "PRIORITY")
    private  int priority;

    @Column(name = "PRICE")
    private  double price;

    @Column(name = "CURR")
    private  String currency;
}