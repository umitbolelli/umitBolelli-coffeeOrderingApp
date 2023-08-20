package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EspressoTest {

    @Test
    public void testCreateEspresso() {
        // Espresso nesnesi oluşturuyoruz
        Espresso espresso = new Espresso();

        // Nesnenin özelliklerini test etmek için
        assertEquals(espresso.getName(), "Espresso");
        assertEquals(espresso.getPrice(), 20);
    }
}