package org.sda;

import org.sda.generics.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      //generic type
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

        //generic type - extends
      Vegetable vegetable = new Vegetable();
      GenericExtendFood<Vegetable> vegetableGenericExtendFood = new GenericExtendFood<>(vegetable);
      System.out.println(vegetableGenericExtendFood.getRating());

      //Generic type  - interface
      Snack snack1 = new Snack(5);
      Snack snack2 = new Snack(3);
      System.out.println("Snack 1 is better than snack2: " + snack1.isBetter(snack2) );

      //List

      List<String> animalList= new ArrayList<>();
      animalList.add("Lion");
      animalList.add("Tiger");
      animalList.add("Dog");

      System.out.println(animalList.get(1));

      for (String animal : animalList){
        System.out.println(animal);
      }

    }
}