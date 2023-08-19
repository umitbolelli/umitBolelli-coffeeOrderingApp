package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class Cappuccino extends Coffee {

    public Cappuccino() {
        super("Cappuccino", 27, 1, 2, 2);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        System.out.println("Teşekkürler içeceğiniz hazırlanıyor...");
        System.out.println("Cappuccino seçtiniz. Bu içeceğimiz bir doz espresso, iki doz buğulanmış süt ve iki doz süt köpüğü içermektedir. Afiyet Olsun.");
    }
}