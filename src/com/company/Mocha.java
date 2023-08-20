package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class Mocha extends Coffee {

    public Mocha() {
        super("Mocha", 32, 1, 0,1,1,2);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        this.printPrepareMessage();
    }
}