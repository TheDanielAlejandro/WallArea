package com.company;

public class Wall {

    private double width;
    private double height;


    // CONSTRUCTORS                                                                                                     // . Creating the 2 constructors for the class Wall.

    public Wall(){                                                                                                      // . First constructor with no parameters and set the instance variables to 0.
        this(0,0);
    }


    public Wall(double width, double height){                                                                           // . Second Construtor with 2 parameters (2 of fields) that sets the instance variables.
        if(width < 0){                                                                                                  // . Checking if the parameter width is higher than 0.
            width = 0;                                                                                                  // . if not, set the value to 0.
        }

        if(height < 0){                                                                                                 // . Checking if the parameter height is higher than 0.
            height = 0;                                                                                                 // . if not, set the value to 0.
        }

        this.width = width;                                                                                             // . Return the width.
        this.height = height;                                                                                           // . Return the height.
    }


    // GET METHODS

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    // SET METHODS

    public void setWidth(double width) {
        if(width < 0){
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if(height < 0){
            height = 0;
        }
        this.height = height;
    }


    // OTHER METHODS

    public double getArea(){                                                                                            // . Creating the method "getArea" with no parameters that returns the multiplication of width and height.
        return (this.height * this.width);
    }


}
