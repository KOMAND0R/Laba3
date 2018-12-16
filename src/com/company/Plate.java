package com.company;

public class Plate extends Dish
{
    private float capacity;

    public Plate(String n, String m, String c, float cap)
    {
        super(n, m, c);
        this.capacity = cap;
    }

    public float getCapacity()
    {
        return capacity;
    }

    public void displayInfo()
    {
        System.out.println("Название: " + getName());
        System.out.println("Материал: " + getMaterial());
        System.out.println("Цвет: " + getColour());
        System.out.println("Объём: " + getCapacity());
    }
}
