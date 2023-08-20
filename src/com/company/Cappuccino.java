package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class Cappuccino extends Coffee {

    public Cappuccino() {
        super("Cappuccino", 27, 1, 0, 2, 2,0);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        this.printPrepareMessage();
    }
}