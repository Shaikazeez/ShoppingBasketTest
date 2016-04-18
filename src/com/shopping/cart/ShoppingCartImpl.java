package com.shopping.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azeez on 4/17/2016.
 */
public class ShoppingCartImpl {
    public static void main(String args[]){
        FruitCart fruitCart=new FruitCart();
        List<Fruit> fruitsList=new ArrayList<>();
        fruitsList.add(new Fruit(FruitName.APPLE,35));
        fruitsList.add(new Fruit(FruitName.APPLE,35));
        fruitsList.add(new Fruit(FruitName.BANANA,20));
        fruitsList.add(new Fruit(FruitName.BANANA,20));
        fruitsList.add(new Fruit(FruitName.MELON,50));
        fruitsList.add(new Fruit(FruitName.MELON,50));
        fruitsList.add(new Fruit(FruitName.MELON,50));
        fruitsList.add(new Fruit(FruitName.MELON,50));
        fruitsList.add(new Fruit(FruitName.LEMON,15));
        fruitsList.add(new Fruit(FruitName.LEMON,15));
        fruitsList.add(new Fruit(FruitName.LEMON,15));
        fruitsList.add(new Fruit(FruitName.LEMON,15));
        fruitCart.addFruits(fruitsList);
        System.out.println("Total Cost of Fruits= £"+fruitCart.getCost());


    }
}
