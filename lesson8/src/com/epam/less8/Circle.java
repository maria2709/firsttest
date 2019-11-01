package com.epam.less8;

/**
 * Created by Maryia_Gaydayenko on 11/1/2019.
 */
public class Circle extends Shape {

    @Override
    public int compareTo(Object o) {
        if (o instanceof Shape){
            return (int)(this.calcArea() - ((Shape) o).calcArea());
        }
        return 0;
    }

    private int radius;
    public Circle (String color, int radius){
        super(color);
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + ", radius=" + radius;
    }

    @Override
    public double calcArea (){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
        public void draw (){
            System.out.printf("%s%s7.2%n", this.toString(), "; area", this.calcArea());
        }

}
