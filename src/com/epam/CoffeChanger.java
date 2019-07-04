package com.epam;

public class CoffeChanger {
    private String coffeName;
    private int size;

    public CoffeChanger(String coffeName,int size) {
        this.coffeName=coffeName;
        this.size=size;
        coffeChanging();
    }

    public void coffeChanging() {
        while (true) {
            CoffeCreator coffe;
            switch (coffeName) {
                case ("Americano"):
                    coffe = new CoffeCreator(coffeName,size);
                    break;
                case ("Cappucino"):
                    coffe = new CoffeCreator(coffeName,size);
                    break;
                case ("Espresso"):
                    coffe = new CoffeCreator(coffeName,size);
                    break;
                case ("Glace"):
                    coffe = new CoffeCreator(coffeName,size);
                    break;
                case ("Latte"):
                    coffe = new CoffeCreator(coffeName,size);
                    break;
                case ("Macchiato"):
                    coffe = new CoffeCreator(coffeName,size);
                    break;
                case ("Mocha"):
                    coffe = new CoffeCreator(coffeName,size);
                    break;
                default:
                    System.out.println("Такого кофе нет, напишите правильно");
                    Client client = new Client();
                    break;
            }
        }
    }
}
