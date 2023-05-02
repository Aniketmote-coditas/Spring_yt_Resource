package org.example;

import org.springframework.stereotype.Component;

import java.util.StringTokenizer;
@Component
public class Tyre {
    public String brand = "aniket";

//    public Tyre(String brand) {
//        super();
//        this.brand = brand;
//    }

        public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String  toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
