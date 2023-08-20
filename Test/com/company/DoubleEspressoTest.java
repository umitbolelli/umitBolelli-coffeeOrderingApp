package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleEspressoTest {

    @Test
    public void testCreateDoubleEspresso() {
        // Double Espresso nesnesi oluşturuyoruz
        DoubleEspresso doubleEspresso = new DoubleEspresso();

        // Nesnenin özelliklerini test etmek için
        assertEquals(doubleEspresso.getName(), "Double Espresso");
        assertEquals(doubleEspresso.getPrice(), 29);
    }
}