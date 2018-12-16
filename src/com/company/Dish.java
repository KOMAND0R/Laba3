package com.company;

public abstract class Dish
{
    private String name;
    private String material;
    private String colour;

    public Dish(String n, String m, String c)
    {
        this.name = n;
        this.material = m;
        this.colour = c;
    }

    public String getName()
    {
        return name;
    }
    public String getMaterial()
    {
        return material;
    }
    public String getColour()
    {
        return colour;
    }

    public abstract void displayInfo();
}
