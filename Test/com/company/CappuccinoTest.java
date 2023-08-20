package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CappuccinoTest {

    @Test
    public void testCreateCappuccino() {
        // Cappuccino nesnesi oluşturuyoruz
        Cappuccino cappuccino = new Cappuccino();

        // Nesnenin özelliklerini test etmek için
        assertEquals(cappuccino.getName(), "Cappuccino");
        assertEquals(cappuccino.getPrice(), 27);
    }

}