package com.epam;

public class Mocha implements Coffe {
    private float milk;
    private float water;
    private float coffeOil;
    private float result;

    @Override
    public float sugar(float sugar) {
        return 0;
    }

    @Override
    public float result() {
        result=milk+water+coffeOil;
        return result;
    }

    @Override
    public float cost(float cost) {
        return cost;
    }

    public void setMilk(float milk) {
        this.milk = milk;
    }

    public void setWater(float water) {
        this.water = water;
    }

    public void setCoffeOil(float coffeOil) {
        this.coffeOil = coffeOil;
    }

    public float getMilk() {
        return milk;
    }

    public float getWater() {
        return water;
    }

    public float getCoffeOil() {
        return coffeOil;
    }

}
