package com.inditex.api.ecomerce.ecomerceapi.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inditex.api.ecomerce.ecomerceapi.model.PricesResponse;
import com.inditex.api.ecomerce.ecomerceapi.util.BrandEnum;


@SpringBootTest(classes = com.inditex.api.ecomerce.ecomerceapi.Application.class)
@AutoConfigureMockMvc
public class PricesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private ObjectMapper objectMapper;
    
    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    public void testCallPrices(final int numTest,final String startDate, final String productId,
     final String brandId ) throws Exception {
        String  result = mockMvc.perform(get("/api/getPrices") 
                .param("startDate",startDate)
                .param("productId", productId)
                .param("brandId", brandId))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn()
                .getResponse()
                .getContentAsString();
        
        PricesResponse testRespone = objectMapper.readValue(result, PricesResponse.class);
        String resultTest = String.format("Test %s: petición a las %s del producto %s   para la brand %s (%s)",
        numTest,
        testRespone.getStartDate(),
        testRespone.getProductId(),
        testRespone.getBrandId(),
        BrandEnum.getNombrePorCodigo(Integer.parseInt(testRespone.getBrandId())));
        System.out.println(resultTest);
        
        assertEquals(productId, testRespone.getProductId());        

    }

    @Test
    public void TestsPrices() throws Exception  {

        testCallPrices (1,"2020-06-14 00.00.00","35455", "1");
        testCallPrices (2,"2020-06-14 15.00.00","35455", "1");
        testCallPrices (3,"2020-06-15 00.00.00","35455", "1");
        testCallPrices (4,"2020-06-15 16.00.00","35455", "1");
    }


}
