package com.epam;

public class Espresso implements Coffe {
    private final float water = 35;
    private final float coffeBeans = 10;
    private float result;
    private float sugar;
    private float cost;
    private int size = 1;

    @Override
    public void setSugar(float sugar) {
        this.sugar=sugar;
    }

    @Override
    public float getResult() {
        result=(water+coffeBeans)*size;
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
        this.size *= size;
    }

}
