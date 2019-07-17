package com.epam;

public class Macchiato implements Coffe {
    private float wippedMilk=30;
    private float result;
    private float sugar;
    private float cost;
    private int size;
    Espresso espresso = new Espresso();

    @Override
    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    @Override
    public float getResult() {
        result=(wippedMilk+espresso.getResult()*2)*size;
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
