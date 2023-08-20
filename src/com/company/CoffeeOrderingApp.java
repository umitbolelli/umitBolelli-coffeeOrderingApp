package com.company;

import java.util.*;
import java.util.Scanner;

public class CoffeeOrderingApp {

    public static void main(String[] args) {
        // Kullanıcı seçimini okumak için bir tarayıcı nesnesi oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kahve türlerinin ve fiyatlarının listesi
        System.out.println("Aşağıda firmamızda bulunan farklı kahve türlerini görebilirsiniz.");
        System.out.println("1. Espresso (20 TL)");
        System.out.println("2. Double Espresso (29 TL)");
        System.out.println("3. Cappuccino (27 TL)");
        System.out.println("4. Caffe Latte (27 TL)");
        System.out.println("5. Mocha (32 TL)");
        System.out.println("6. Americano (25 TL)");
        System.out.println("7. Hot Water (5 TL)");

        // Kullanıcıdan bir kahve numarası girmesini istediğimiz bölüm
        System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
        int coffeeType;
        try {
            coffeeType = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Girdiğiniz seçenek geçersiz. Lütfen yukarıdaki listeye göre seçiminizi yapın.");
            return;
        }

        // Seçilen türde bir kahve nesnesi oluşturma
        Coffee coffee = createCoffee(coffeeType);

        // Kahveyi hazırlama
        coffee.prepare();

    }

    // Switch case ile seçilen türe göre kahve oluşturma
    static Coffee createCoffee(int coffeeType) {
        switch (coffeeType) {
            case 1:
                return new Espresso();
            case 2:
                return new DoubleEspresso();
            case 3:
                return new Cappuccino();
            case 4:
                return new CaffeLatte();
            case 5:
                return new Mocha();
            case 6:
                return new Americano();
            case 7:
                return new HotWater();
            default:
                System.out.println("Böyle bir seçeneğimiz bulunmuyor.");
                throw new IllegalArgumentException("Geçersiz kahve türü.");
        }
    }
}