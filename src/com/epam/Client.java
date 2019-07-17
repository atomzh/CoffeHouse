package com.epam;

import java.util.Scanner;

public class Client {
    private CoffeChanger coffeChanger;
    private int coffeNumber = 0;
    private int size;
    private String[] coffeTypes = {" ","Americano","Cappucino","Espresso","Glace","Latte","Macchiato","Mocha"};
    public void coffeChoice(){
        for (int i = 1; i < coffeTypes.length; i++) {
            System.out.println(i+"). "+coffeTypes[i]);
        }
        System.out.println("Напишите порядковый номера кофе :");
        Scanner scanner = new Scanner(System.in);
        coffeNumber = Integer.parseInt(scanner.next());
        System.out.println("Размеры: 1 - маленький, 2 - средний, 3 - большой");
        size = Integer.parseInt(scanner.next());
        String coffeName = coffeTypes[coffeNumber];
        coffeChanger = new CoffeChanger(coffeName,size);
        coffeChanger.coffeChanging();
    }

}
