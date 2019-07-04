package com.epam;

public class Espresso implements Coffe {
    private float water;
    private float coffeBeans;
    private float result;

    @Override
    public float sugar(float sugar) {
        return 0;
    }

    @Override
    public float result() {
        result=coffeBeans+water;
        return result;
    }

    @Override
    public float cost(float cost) {
        return cost;
    }

    public void setWater(float water) {
        this.water = water;
    }

    public void setCoffeBeans(float coffeBeans) {
        this.coffeBeans = coffeBeans;
    }

    public float getWater() {
        return water;
    }

    public float getCoffeBeans() {
        return coffeBeans;
    }

}
