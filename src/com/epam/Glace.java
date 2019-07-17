package com.epam;

public class Glace implements Coffe {
    private float icecream=45;
    private float chocolate=30;
    private float result;
    private float sugar;
    private float cost;
    private int size;
    Espresso espresso = new Espresso();

    @Override
    public void setSugar(float sugar) {
        this.sugar=sugar;
    }

    @Override
    public float getResult() {
        result=(chocolate+icecream+espresso.getResult())*size;
        return result;
    }

    @Override
    public void setCost(float cost) {
        this.cost=cost;
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
