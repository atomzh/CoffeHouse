package com.epam;

public abstract class Coffe implements CoffeHouse {
    private float sugar;

    public float sugar(float sugar){
        return this.sugar = sugar;
    }

}
