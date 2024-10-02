package com.inditex.api.ecomerce.ecomerceapi.config;
// package config;

// import java.time.LocalDate;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import com.inditex.api.ecomerce.ecomerceapi.repository.PricesRepository;
// import com.inditex.api.ecomerce.ecomerceapi.repository.Entity.Prices;

// import lombok.RequiredArgsConstructor;

// @Configuration
// @RequiredArgsConstructor

// class LoadDatabase {
//     PricesRepository repository;

//     private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

//     @Bean
//     CommandLineRunner initDatabase(PricesRepository repository) {
//         return args -> {
//         log.info("Preloading " + repository.save(new Prices(1, LocalDate.parse("2020-06-14-00.00.00"), LocalDate.parse("2020-12-31-23.59.59"), 0, 3545, 0, 35.50, "EUR")));
//         };
//     }
// }