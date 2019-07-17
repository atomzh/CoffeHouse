package com.epam;

public class CoffeChanger {
    private String coffeName;
    private final String[] sizeArr = {" "," маленький","средний","большой"}; // 1-маленький , 2-средний, 3-большой
    private int size;

    public CoffeChanger(String coffeName,int size) {
        this.coffeName=coffeName;
        this.size=size;
    }

    public void coffeChanging() {
            CoffeCreator coffe;
            switch (coffeName) {
                case ("Americano"):
                    System.out.println("Вы выбрали: "+coffeName);
                    System.out.println("Размер вашего кофе:"+sizeArr[size]);
                    coffe = new CoffeCreator(coffeName,size);
                    break;
                case ("Cappucino"):
                    System.out.println("Вы выбрали: "+coffeName);
                    System.out.println("Размер вашего кофе:"+sizeArr[size]);
                    coffe = new CoffeCreator(coffeName,size);
                    break;
                case ("Espresso"):
                    coffe = new CoffeCreator(coffeName,size);
                    System.out.println("Вы выбрали: "+coffeName);
                    System.out.println("Размер вашего кофе:"+sizeArr[size]);
                    break;
                case ("Glace"):
                    coffe = new CoffeCreator(coffeName,size);
                    System.out.println("Вы выбрали: "+coffeName);
                    System.out.println("Размер вашего кофе:"+sizeArr[size]);
                    break;
                case ("Latte"):
                    coffe = new CoffeCreator(coffeName,size);
                    System.out.println("Вы выбрали: "+coffeName);
                    System.out.println("Размер вашего кофе:"+sizeArr[size]);
                    break;
                case ("Macchiato"):
                    coffe = new CoffeCreator(coffeName,size);
                    System.out.println("Вы выбрали: "+coffeName);
                    System.out.println("Размер вашего кофе:"+sizeArr[size]);
                    break;
                case ("Mocha"):
                    coffe = new CoffeCreator(coffeName,size);
                    System.out.println("Вы выбрали: "+coffeName);
                    System.out.println("Размер вашего кофе:"+sizeArr[size]);
                    break;
                default:
                    System.out.println("Такого кофе нет, напишите правильно");
                    Client client = new Client();
                    break;
        }
    }
}
