package com.epam;

public class CoffeChanger {

    public CoffeChanger(String coffeName) {
        coffeChanging(coffeName);
    }

    public void coffeChanging(String coffeName) {
        while (true) {
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
                default:
                    System.out.println("Такого кофе нет, напишите правильно");
                    coffeChanging(coffeName);
            }

        }
    }
}
