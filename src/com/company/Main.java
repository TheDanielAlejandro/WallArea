package com.company;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall();                                                                                        // . Creating a new object of the class Wall, without any parameters. (calling the constructor with no parameters)
        System.out.println("area = "+ wall1.getArea());

        Wall wall2 = new Wall(5, 4);                                                                        // . Creating a new object of the class Wall, with all the parameters.
        wall2.setHeight(-1.5);
        System.out.println("width = "+ wall2.getWidth());
        System.out.println("heigth ="+ wall2.getHeight());
        System.out.println("area ="+ wall2.getArea());

    }
}
