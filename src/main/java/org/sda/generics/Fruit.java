package org.sda.generics;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fruit {
    private String name;
    private String color;
    private BigDecimal price;


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

