package com.epam;

public class CoffeCreator {
    private String coffeName;
    private int size;

    public CoffeCreator(String coffeName,int size) {
        this.coffeName = coffeName;
        this.size = size;
        creatCoffe();
    }

    public void creatCoffe(){
        Coffe coffe;
        switch (coffeName) {
            case ("Americano"):
                coffe = new Americano();
                break;
            case ("Cappucino"):
                coffe = new Cappucino();
                break;
            case ("Espresso"):
                coffe = new Espresso();

                break;
            case ("Glace"):
                coffe = new Glace();
                break;
            case ("Latte"):
                coffe = new Latte();
                break;
            case ("Macchiato"):
                coffe = new Macchiato();
                break;
            case ("Mocha"):
                coffe = new Mocha();
                break;

        }
    }
}
