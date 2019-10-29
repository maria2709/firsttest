package com.epam.less6.practical2;

/**
 * Created by Maryia_Gaydayenko on 10/28/2019.
 */
public class ID {
    private int id;
    private static int nextId = (int)(Math.random()*100 + 1);

    public ID() {
        id = nextId;
        nextId++;
    }
    public int getId(){
        return id;
    }
}
