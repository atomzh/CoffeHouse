package com.epam;

public class Latte implements Coffe {
    private float milk;
    private float wippedMilk;
    private float result;

    @Override
    public float sugar(float sugar) {
        return 0;
    }

    @Override
    public float result() {
        result=wippedMilk+milk;
        return result;
    }

    @Override
    public float cost(float cost) {
        return cost;
    }

    public void setMilk(float milk) {
        this.milk = milk;
    }

    public void setWippedMilk(float wippedMilk) {
        this.wippedMilk = wippedMilk;
    }

    public float getMilk() {
        return milk;
    }

    public float getWippedMilk() {
        return wippedMilk;
    }


 }
