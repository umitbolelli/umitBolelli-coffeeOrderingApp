package com.company;

// Tüm kahvelerin kendisinden türeyeceği abstruct class
public abstract class Coffee {

    protected String name;
    protected int price;
    protected int dosesOfEspresso;

    // Constructorımız
    public Coffee(String name, int price, int dosesOfEspresso, int i, int i1) {
        this.name = name;
        this.price = price;
        this.dosesOfEspresso = dosesOfEspresso;
    }

    //Child class'larda override edeceğimiz method
    public abstract void prepare();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDosesOfEspresso() {
        return dosesOfEspresso;
    }
}