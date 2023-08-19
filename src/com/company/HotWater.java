package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class HotWater extends Coffee {

    public HotWater() {
        super("Hot Water", 5, 0, 4, 2);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        System.out.println("Teşekkürler içeceğiniz hazırlanıyor...");
        System.out.println("Hot Water seçtiniz. Bu içeceğimiz beş doz sıcak su içermektedir. Afiyet Olsun.");
    }
}