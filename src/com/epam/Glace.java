package com.epam;

public class Glace implements Coffe {
    private float icecream;
    private float chocolate;
    private float result;

    @Override
    public float sugar(float sugar) {
        return 0;
    }

    @Override
    public float result() {
        result=chocolate+icecream;
        return result;
    }

    @Override
    public float cost(float cost) {
        return cost;
    }

    public void setIcecream(float icecream) {
        this.icecream = icecream;
    }

    public void setChocolate(float chocolate) {
        this.chocolate = chocolate;
    }

    public float getIcecream() {
        return icecream;
    }

    public float getChocolate() {
        return chocolate;
    }

}
