package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class DoubleEspresso extends Coffee {

    public DoubleEspresso() {
        super("Double Espresso", 29, 2, 4, 2);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        System.out.println("Teşekkürler içeceğiniz hazırlanıyor...");
        System.out.println("Double Espresso seçtiniz. Bu içeceğimiz iki doz espresso içermektedir. Afiyet Olsun.");
    }
}