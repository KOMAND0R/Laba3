package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    Fork fork = new Fork("Вилка", "Аллюминий", "Серый металлический", 4);
	    Plate plate = new Plate("Тарелка", "Керамика", "Белый", 0.5f);

	    fork.displayInfo();
	    System.out.println();
	    plate.displayInfo();
    }
}
