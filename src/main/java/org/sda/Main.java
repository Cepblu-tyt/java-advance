package org.sda;

import org.sda.generics.Fruit;
import org.sda.generics.GenericFood;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
      Fruit fruit = new Fruit();
      fruit.setName("Apple");
      fruit.setColor("Red");
      fruit.setPrice(BigDecimal.valueOf(1.99)); //converting to bigdecimal

      GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);
        System.out.println(genericFoodWithFruit.getItem());

        String str = "i'm great developer";
        GenericFood<String> genericFoodWithString = new GenericFood<>(str);
        System.out.println(genericFoodWithString.getItem());

        genericFoodWithString.setItem("i'm a good person!");
        System.out.println(genericFoodWithString.getItem());
    }
}