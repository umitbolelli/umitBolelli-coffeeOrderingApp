package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotWaterTest {
    @Test
    public void testCreateHotWater() {
        // Hot Water nesnesi oluşturuyoruz
        HotWater hotWater = new HotWater();

        // Nesnenin özelliklerini test etmek için
        assertEquals(hotWater.getName(), "Hot Water");
        assertEquals(hotWater.getPrice(), 5);
    }
}