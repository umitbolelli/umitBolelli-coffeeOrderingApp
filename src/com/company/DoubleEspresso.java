package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class DoubleEspresso extends Coffee {

    public DoubleEspresso() {
        super("Double Espresso", 29, 2, 0,0,0,0);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        this.printPrepareMessage();
    }
}