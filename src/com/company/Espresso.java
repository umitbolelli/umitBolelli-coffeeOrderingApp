package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class Espresso extends Coffee {

    public Espresso() {
        super("Espresso", 20, 1, 0,0,0,0);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        this.printPrepareMessage();
    }
}