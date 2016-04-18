package com.shopping.cart;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Azeez on 4/18/2016.
 */
public class FruitCartTest {

    FruitCart fruitCart;
    List<Fruit> fruitsList ;

    @Before
    public void setup(){
        fruitCart=new FruitCart();
        fruitsList=new ArrayList<>();
    }

    @Test
    public void test_Total_Fruit_Cost(){
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
        double totalCost=fruitCart.getCost();
        assertEquals("2.55",Double.toString(totalCost) );
    }


    @Test
    public void test_Apple_Fruit_Cost(){
        fruitsList.add(new Fruit(FruitName.APPLE,35));
        fruitsList.add(new Fruit(FruitName.APPLE,35));
        fruitsList.add(new Fruit(FruitName.APPLE,35));
        fruitCart.addFruits(fruitsList);
        double totalCost=fruitCart.getCost();
        assertEquals("1.05",Double.toString(totalCost) );
    }

    @Test
    public void test_Banana_Fruit_Cost(){
        fruitsList.add(new Fruit(FruitName.BANANA,20));
        fruitsList.add(new Fruit(FruitName.BANANA,20));
        fruitsList.add(new Fruit(FruitName.BANANA,20));
        fruitsList.add(new Fruit(FruitName.BANANA,20));
        fruitsList.add(new Fruit(FruitName.BANANA,20));
        fruitsList.add(new Fruit(FruitName.BANANA,20));
        fruitCart.addFruits(fruitsList);
        double totalCost=fruitCart.getCost();
        assertEquals("1.2",Double.toString(totalCost) );
    }

    @Test
    public void test_Melons_Cost(){
        fruitsList.add(new Fruit(FruitName.MELON,60));
        fruitsList.add(new Fruit(FruitName.MELON,60));
        fruitsList.add(new Fruit(FruitName.MELON,60));
        fruitsList.add(new Fruit(FruitName.MELON,60));
        fruitCart.addFruits(fruitsList);
        double totalCost=fruitCart.getCost();
        assertEquals("1.2",Double.toString(totalCost) );
    }

    @Test
    public void test_Lemons_Cost(){
        fruitsList.add(new Fruit(FruitName.LEMON,15));
        fruitsList.add(new Fruit(FruitName.LEMON,15));
        fruitsList.add(new Fruit(FruitName.LEMON,15));
        fruitsList.add(new Fruit(FruitName.LEMON,15));
        fruitCart.addFruits(fruitsList);
        double totalCost=fruitCart.getCost();
        assertEquals("0.45",Double.toString(totalCost) );
    }


    @Test
    public void test_Total_Fruit_Cost_For_Empty_FruitList(){
        fruitCart.addFruits(fruitsList);
        double totalCost=fruitCart.getCost();
        assertEquals("0.0",Double.toString(totalCost) );
    }

}