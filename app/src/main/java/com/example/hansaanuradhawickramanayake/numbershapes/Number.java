package com.example.hansaanuradhawickramanayake.numbershapes;

/**
 * Created by hansaanuradhawickramanayake on 1/27/18.
 */

public class Number {

    int number;

    public boolean isSquare() {

        double squareRoot = Math.sqrt(number);

        if (squareRoot == Math.floor(squareRoot))
            return true;
        else
            return false;


    }

    public boolean isTriangular() {

        int x = 1;

        int triangularNumber = 1;

        while (triangularNumber < number) {

            x++;

            triangularNumber = triangularNumber + x;

        }

        if(number == triangularNumber)
            return  true;
        else
            return false;

    }

}
