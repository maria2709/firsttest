package com.epam.less8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Shape [] shapes = {
            new Circle("red", 10),
            new Circle("blue", 17),
            new Circle("pink", 120),
            new Circle("green", 40),
            new Circle("white", 10),
    };

        for (Shape elem: shapes) {
            elem.draw();

        }
        System.out.println("Sort: ");
    //    Arrays.sort(shapes);

        Arrays.sort(shapes, new MyComparatorColor());

        for (Shape elem: shapes) {
            elem.draw();

        }
    }

}
