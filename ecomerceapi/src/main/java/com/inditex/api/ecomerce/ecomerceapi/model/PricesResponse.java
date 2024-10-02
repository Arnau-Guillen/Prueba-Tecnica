package com.inditex.api.ecomerce.ecomerceapi.model;

import lombok.Data;

@Data
public class PricesResponse {
    
    String productId;
    String brandId;
    String priceList;
    String startDate;
    String endDate;
    String price;
}
