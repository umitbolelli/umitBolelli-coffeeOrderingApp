package com.company;

// Coffee'yi bir parent class olarak kabul edip onun bir child class'ını üretiyoruz
class CaffeLatte extends Coffee {

    public CaffeLatte() {
        super("Caffe Latte", 27, 1, 0, 3, 1,0);
    }

    // prepare method'u override edilerek Polymorphism mekanizması kullanılıyor
    @Override
    public void prepare() {
        this.printPrepareMessage();
    }
}