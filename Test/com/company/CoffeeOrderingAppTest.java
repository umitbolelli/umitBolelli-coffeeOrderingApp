package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeOrderingAppTest {

    @Test
    public void testCreateCoffee() {
        // Espresso kahve siparişi verilirse
        int coffeeType = 1;
        Coffee coffee = CoffeeOrderingApp.createCoffee(coffeeType);

        // Espresso kahve nesnesi oluşturulduğundan emin olmak için
        assertEquals(coffee.getClass(), Espresso.class);

        // Kahvenin fiyatının 20 TL olduğundan emin olmak için
        assertEquals(coffee.getPrice(), 20);
    }

    @Test
    public void testCreateDoubleEspresso() {
        // Double Espresso kahve siparişi verilirse
        int coffeeType = 2;
        Coffee coffee = CoffeeOrderingApp.createCoffee(coffeeType);

        // Double Espresso kahve nesnesi oluşturulduğundan emin olmak için
        assertEquals(coffee.getClass(), DoubleEspresso.class);

        // Kahvenin fiyatının 29 TL olduğundan emin olmak için
        assertEquals(coffee.getPrice(), 29);
    }

    @Test
    public void testCreateCappuccino() {
        // Cappuccino kahve siparişi verilirse
        int coffeeType = 3;
        Coffee coffee = CoffeeOrderingApp.createCoffee(coffeeType);

        // Cappuccino kahve nesnesi oluşturulduğundan emin olmak için
        assertEquals(coffee.getClass(), Cappuccino.class);

        // Kahvenin fiyatının 27 TL olduğundan emin olmak için
        assertEquals(coffee.getPrice(), 27);
    }

    @Test
    public void testCreateCaffeLatte() {
        // Caffe Latte kahve siparişi verilirse
        int coffeeType = 4;
        Coffee coffee = CoffeeOrderingApp.createCoffee(coffeeType);

        // Caffe Latte kahve nesnesi oluşturulduğundan emin olmak için
        assertEquals(coffee.getClass(), CaffeLatte.class);

        // Kahvenin fiyatının 27 TL olduğundan emin olmak için
        assertEquals(coffee.getPrice(), 27);
    }

    @Test
    public void testCreateMocha() {
        // Mocha kahve siparişi verilirse
        int coffeeType = 5;
        Coffee coffee = CoffeeOrderingApp.createCoffee(coffeeType);

        // Mocha kahve nesnesi oluşturulduğundan emin olmak için
        assertEquals(coffee.getClass(), Mocha.class);

        // Kahvenin fiyatının 32 TL olduğundan emin olmak için
        assertEquals(coffee.getPrice(), 32);
    }

    @Test
    public void testCreateAmericano() {
        // Americano kahve siparişi verilirse
        int coffeeType = 6;
        Coffee coffee = CoffeeOrderingApp.createCoffee(coffeeType);

        // Americano kahve nesnesi oluşturulduğundan emin olmak için
        assertEquals(coffee.getClass(), Americano.class);

        // Kahvenin fiyatının 25 TL olduğundan emin olmak için
        assertEquals(coffee.getPrice(), 25);
    }

    @Test
    public void testCreateHotWater() {
        // Sıcak Su siparişi verilirse
        int coffeeType = 7;
        Coffee coffee = CoffeeOrderingApp.createCoffee(coffeeType);

        // Sıcak Su nesnesin oluşturulduğundan emin olmak için
        assertEquals(coffee.getClass(), HotWater.class);

        // Sıcak suyun fiyatının 5 TL olduğundan emin olmak için
        assertEquals(coffee.getPrice(), 5);
    }
}