package com.epam;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        switch (coffeName) {
            case ("Americano"):
                coffe = new Americano();
                coffe.setCost(300*size);
                coffe.setSize(size);
                System.out.println("Сколько кубиков сахара желаете добавить?");
                System.out.println("От 0 до 6 кубиков");
                coffe.setSugar(Float.parseFloat(scanner.next()));
                System.out.println("Объем кофе составил:"+coffe.getResult());
                System.out.println("Стоимость кофе:"+ coffe.getCost());
                break;
            case ("Cappucino"):
                coffe = new Cappucino();
                coffe.setCost(300*size);
                coffe.setSize(size);
                System.out.println("Сколько кубиков сахара желаете добавить?");
                System.out.println("От 0 до 6 кубиков");
                coffe.setSugar(Float.parseFloat(scanner.next()));
                System.out.println("Объем кофе составил:"+coffe.getResult());
                System.out.println("Стоимость кофе:"+ coffe.getCost());
                break;
            case ("Espresso"):
                coffe = new Espresso();
                coffe.setCost(300*size);
                coffe.setSize(size);
                System.out.println("Сколько кубиков сахара желаете добавить?");
                System.out.println("От 0 до 6 кубиков");
                coffe.setSugar(Float.parseFloat(scanner.next()));
                System.out.println("Объем кофе составил:"+coffe.getResult());
                System.out.println("Стоимость кофе:"+ coffe.getCost());
                break;
            case ("Glace"):
                coffe = new Glace();
                coffe.setCost(300*size);
                coffe.setSize(size);
                System.out.println("Сколько кубиков сахара желаете добавить?");
                System.out.println("От 0 до 6 кубиков");
                coffe.setSugar(Float.parseFloat(scanner.next()));
                System.out.println("Объем кофе составил:"+coffe.getResult());
                System.out.println("Стоимость кофе:"+ coffe.getCost());
                break;
            case ("Latte"):
                coffe = new Latte();
                coffe.setCost(300*size);
                coffe.setSize(size);
                System.out.println("Сколько кубиков сахара желаете добавить?");
                System.out.println("От 0 до 6 кубиков");
                coffe.setSugar(Float.parseFloat(scanner.next()));
                System.out.println("Объем кофе составил:"+coffe.getResult());
                System.out.println("Стоимость кофе:"+ coffe.getCost());
                break;
            case ("Macchiato"):
                coffe = new Macchiato();
                coffe.setCost(300*size);
                coffe.setSize(size);
                System.out.println("Сколько кубиков сахара желаете добавить?");
                System.out.println("От 0 до 6 кубиков");
                coffe.setSugar(Float.parseFloat(scanner.next()));
                System.out.println("Объем кофе составил:"+coffe.getResult());
                System.out.println("Стоимость кофе:"+ coffe.getCost());
                break;
            case ("Mocha"):
                coffe = new Mocha();
                coffe.setCost(300*size);
                coffe.setSize(size);
                System.out.println("Сколько кубиков сахара желаете добавить?");
                System.out.println("От 0 до 6 кубиков");
                coffe.setSugar(Float.parseFloat(scanner.next()));
                System.out.println("Объем кофе составил:"+coffe.getResult());
                System.out.println("Стоимость кофе:"+ coffe.getCost());
                break;

        }
    }
}
