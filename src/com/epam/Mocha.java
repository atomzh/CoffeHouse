package com.epam;

public class Mocha implements Coffe {
    private float milk = 60;
    private float water = 30;
    private float coffeOil = 30 ;
    private float result;
    private float sugar;
    private float cost;
    private int size;

    @Override
    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    @Override
    public float getResult() {
        result=(milk+water+coffeOil)*size;
        return result;
    }

    @Override
    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }

    @Override
    public float getSugar() {
        return cost;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

}
