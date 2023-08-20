package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaffeLatteTest {

    @Test
    public void testCreateCaffeLatte() {
        // Caffe Latte nesnesi oluşturuyoruz
        CaffeLatte latte = new CaffeLatte();

        // Nesnenin özelliklerini test etmek için
        assertEquals(latte.getName(), "Caffe Latte");
        assertEquals(latte.getPrice(), 27);
    }
}