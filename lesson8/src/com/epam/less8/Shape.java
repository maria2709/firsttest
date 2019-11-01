package com.epam.less8;

/**
 * Created by Maryia_Gaydayenko on 11/1/2019.
 */
public abstract class Shape implements Drawable, Comparable {
    public String getColor() {
        return color;
    }

    private String color;
    public Shape (String color ) {this.color = color;}
    public abstract double calcArea();

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ": color=" + color;
    }
}
