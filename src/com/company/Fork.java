package com.company;

public class Fork extends Dish
{
    private int tinesCount;

    public Fork(String n, String m, String c, int t)
    {
        super(n, m, c);
        this.tinesCount = t;
    }

    public int getTinesCount()
    {
        return tinesCount;
    }

    public void displayInfo()
    {
        System.out.println("Название: " + getName());
        System.out.println("Материал: " + getMaterial());
        System.out.println("Цвет: " + getColour());
        System.out.println("Количество зубьев: " + getTinesCount());
    }
}
