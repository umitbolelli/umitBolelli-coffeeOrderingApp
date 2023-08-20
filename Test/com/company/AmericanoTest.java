package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmericanoTest {

    @Test
    public void testCreateAmericano() {
        // Americano nesnesi oluşturuyoruz
        Americano americano = new Americano();

        // Nesnenin özelliklerini test etmek için
        assertEquals(americano.getName(), "Americano");
        assertEquals(americano.getPrice(), 25);
    }

}