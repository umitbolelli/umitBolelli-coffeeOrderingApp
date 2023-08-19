package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class Espresso extends Coffee {

    public Espresso() {
        super("Espresso", 20, 1, 4, 2);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        System.out.println("Teşekkürler içeceğiniz hazırlanıyor...");
        System.out.println("Espresso seçtiniz. Bu içeceğimiz bir doz espresso içermektedir. Afiyet Olsun.");
    }
}