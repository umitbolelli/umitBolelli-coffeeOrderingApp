package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class Mocha extends Coffee {

    public Mocha() {
        super("Mocha", 32, 1, 1, 2);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        System.out.println("Teşekkürler içeceğiniz hazırlanıyor...");
        System.out.println("Mocha seçtiniz. Bu içeceğimiz bir doz espresso, bir doz buğulanmış süt, bir doz süt köpüğü ve 2 doz sıcak çikolata içermektedir. Afiyet Olsun.");
    }
}