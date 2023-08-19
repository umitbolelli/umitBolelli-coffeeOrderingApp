package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class CaffeLatte extends Coffee {

    public CaffeLatte() {
        super("Caffe Latte", 27, 1, 3, 2);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        System.out.println("Teşekkürler içeceğiniz hazırlanıyor...");
        System.out.println("Caffe Latte seçtiniz. Bu içeceğimiz bir doz espresso, üç doz buğulanmış süt ve bir doz süt köpüğü içermektedir. Afiyet Olsun.");
    }
}