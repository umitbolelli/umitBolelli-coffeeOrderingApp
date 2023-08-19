package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class Americano extends Coffee {

    public Americano() {
        super("Americano", 25, 1, 4, 2);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        System.out.println("Teşekkürler içeceğiniz hazırlanıyor...");
        System.out.println("Americano seçtiniz. Bu içeceğimiz bir doz espresso ve dört doz sıcak su içermektedir. Afiyet Olsun.");
    }
}