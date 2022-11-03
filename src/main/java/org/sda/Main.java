package org.sda;

import org.sda.generics.*;

import java.math.BigDecimal;
import java.util.*;

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

      //SET

      Set<String> countrySet = new HashSet<>();
      countrySet.add("Eesti");
      countrySet.add("Saksamaa");
      countrySet.add("Poola");
      countrySet.add("Rootsi");
      //countrySet.add("Eesti"); - duplicates not allowed

      for (String country: countrySet) {

      System.out.println(country);

    }
      TreeSet countryTreeSet = new TreeSet(countrySet); // Stored as Sorted
      System.out.println(countryTreeSet);


      //MAP

      Map<String, String> fullName = new HashMap<>();
      fullName.put("Sergei", "Oksanen");
      fullName.put("Santa", "Claus");
      fullName.put("Kurt", "Cabain");

      System.out.println(fullName);
      System.out.println(fullName.get("Sergei"));
      System.out.println(fullName.remove("Kurt"));
      System.out.println(fullName);

      Map<String, Integer> ageMap  = new HashMap<>();


      Map<String, List<String>> friendsMap  = new HashMap<>();



      Map<String, Map<String, String>> detailsMap  = new HashMap<>();

    }
}