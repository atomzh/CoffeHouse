package com.epam;

public class Americano implements Coffe {
    private float water;
    private Espresso espresso;
    private float result;

    @Override
    public float sugar(float sugar) {
        return 0;
    }

    @Override
    public float result() {
        result = water+espresso.result();
        return result;
    }

    @Override
    public float cost(float cost) {
        return cost;
    }

    public void setWater(float water) {
        this.water = water;
    }

    public float getWater() {
        return water;
    }

    public Espresso getEspresso() {
        return espresso;
    }
}
