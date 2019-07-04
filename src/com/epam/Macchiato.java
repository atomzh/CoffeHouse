package com.epam;

public class Macchiato implements Coffe {
    private float wippedMilk;
    private float result;

    @Override
    public float sugar(float sugar) {
        return 0;
    }

    @Override
    public float result() {
        result=wippedMilk;
        return result;
    }

    @Override
    public float cost(float cost) {
        return cost;
    }

    public void setWippedMilk(float wippedMilk) {
        this.wippedMilk = wippedMilk;
    }

    public float getWippedMilk() {
        return wippedMilk;
    }


}
