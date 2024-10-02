package com.inditex.api.ecomerce.ecomerceapi.util;

public enum BrandEnum {
        //Simulated the brand table in bbdd
        ZARA(1, "Zara");

        private final int codigo;
        private final String nombre;
    
        // Constructor para el enum
        BrandEnum(int codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
        }
    
        // Método getter para obtener el nombre según el código
        public static String getNombrePorCodigo(int codigo) {
            for (BrandEnum marca : BrandEnum.values()) {
                if (marca.codigo == codigo) {
                    return marca.nombre;
                }
            }
            return "Marca desconocida";
        }
}
