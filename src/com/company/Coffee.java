package com.company;

// Tüm kahvelerin kendisinden türeyeceği abstruct class
public abstract class Coffee {

    protected String name;
    protected int price;
    protected int dosesOfEspresso;
    protected int hotWater;
    protected int steamedMilk;
    protected int milkFoam;
    protected int hotChocolate;

    // Constructorımız
    public Coffee(String name, int price, int dosesOfEspresso, int hotWater, int steamedMilk, int milkFoam, int hotChocolate) {
        this.name = name;
        this.price = price;
        this.dosesOfEspresso = dosesOfEspresso;
        this.hotWater = hotWater;
        this.steamedMilk = steamedMilk;
        this.milkFoam = milkFoam;
        this.hotChocolate = hotChocolate;
    }

    // Child class'larda override edeceğimiz method
    public abstract void prepare();

    // Her alt sınıfta olması zorunlu olan methodlar
    // Örneğin hotWater'ın bütün alt sınıflarda olmasına gerek yok
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    // System.out.println method'unu her classta yazmak yerine burada yazıp lazım olan yerde çağırıyoruz
    public void printPrepareMessage() {
        System.out.println("Teşekkürler içeceğiniz hazırlanıyor...");

        // Hot Water seçilmesi durumunda
        if (hotWater > 0 && dosesOfEspresso == 0 && steamedMilk == 0 && milkFoam == 0 && hotChocolate == 0) {
            System.out.println(this.name + " seçtiniz. Bu içeceğimizdeki sıcak su miktarı " + this.hotWater + " dozdur.");
        }
        // Diğer seçenekler seçilirse
        else {
            System.out.println(this.name + " seçtiniz. Bu içeceğimiz " + this.dosesOfEspresso + " doz espresso içermektedir.");
            if (this.hotWater > 0) {
                System.out.println("Sıcak su mikarı " + this.hotWater + " dozdur.");
            }
            if (this.steamedMilk > 0) {
                System.out.println("Buğulanmış süt miktarı " + this.steamedMilk + " dozdur. ");
            }
            if (this.milkFoam > 0) {
                System.out.println("Süt köpüğü miktarı " + this.milkFoam + " dozdur." );
            }
            if (this.hotChocolate > 0) {
                System.out.println("Sıcak çikolata miktarı " + this.hotChocolate + " dozdur. ");
            }
        }
        System.out.println("Afiyet Olsun.");
    }
}