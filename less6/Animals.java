package com.epam.less6;


public class Animals {
    public Animals(String name) {
        this.name = name;
    }

    public Animals() {
        this("animal", 15, 2);
    }

    public Animals(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    private String name;
    private int speed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void viewAnimal(){
        System.out.println("Name = " + this.getName() + ", Speed = " + this.getSpeed()+ ", Age = " +
                this.getAge());

    }
}
