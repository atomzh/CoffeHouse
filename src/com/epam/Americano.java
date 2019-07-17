package com.epam;

public class Americano implements Coffe {
    private float water = 75;
    private float result;
    private float cost;
    private float sugar;
    private int size;
    Espresso espresso = new Espresso();

    @Override
    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    @Override
    public float getResult() {
        result = (water+espresso.getResult())*size;
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
        return sugar;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }
}
