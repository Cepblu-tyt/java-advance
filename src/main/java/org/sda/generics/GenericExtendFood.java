package org.sda.generics;

public class GenericExtendFood <T extends Food>{

    private T item;

    public GenericExtendFood(T item) {
        this.item = item;
    }

    public float doRating(){
        return item.rating();
    }

    public float getRating(){
        return item.rating();
    }
}
