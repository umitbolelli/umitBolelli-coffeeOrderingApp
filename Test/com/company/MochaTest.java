package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MochaTest {

    @Test
    public void testCreateMochaEspresso() {
        // Mocha nesnesi oluşturuyoruz
        Mocha mocha = new Mocha();

        // Nesnenin özelliklerini test etmek için
        assertEquals(mocha.getName(), "Mocha");
        assertEquals(mocha.getPrice(), 32);
    }
}