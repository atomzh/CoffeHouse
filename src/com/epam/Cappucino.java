package com.epam;

public class Cappucino implements Coffe {
    private float milk;
    private float coffeOil;
    private float result;

    @Override
    public float sugar(float sugar) {
        return sugar;
    }

    @Override
    public float result() {
        result=milk+coffeOil;
        return result;
    }

    @Override
    public float cost(float cost) {
        return cost;
    }

    public void setMilk(float milk) {
        this.milk = milk;
    }


    public void setCoffeOil(float coffeOil) {
        this.coffeOil = coffeOil;
    }

    public float getMilk() {
        return milk;
    }


    public float getCoffeOil() {
        return coffeOil;
    }



}
