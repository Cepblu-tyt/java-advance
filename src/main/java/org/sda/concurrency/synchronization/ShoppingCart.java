package org.sda.concurrency.synchronization;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Synchronization base class
 *
 * @author Sergei Oksanen
 */
@AllArgsConstructor
@Getter
public class ShoppingCart {
    private int numberOfProducts;

    public void addProduct(int quantity){
        numberOfProducts += quantity;
    }

    public void removeProduct(int quantity){
        numberOfProducts -= quantity;
    }
}
