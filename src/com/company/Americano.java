package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class Americano extends Coffee {

    public Americano() {
        super("Americano", 25, 1, 4, 0, 0,0);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        this.printPrepareMessage();
    }
}