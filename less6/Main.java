package com.epam.less6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Animals animal = new Animals();
       // System.out.println("Name = " + animal.getName() + ", Speed = " + animal.getSpeed()+ ", Age = " +
        //animal.getAge());
        animal.viewAnimal();
        animal.setName("cat");
        animal.setSpeed(10);
        animal.setAge(5);
        animal.viewAnimal();

        Animals dog = new Animals ("dog");
        dog.viewAnimal();
        System.out.println("------------------------------------------");
        Animals[] arrayAnimal = {new Animals(), new Animals("Mouse"), new Animals("cat", 15, 12),
                new Animals("doggy", 45, 13)};

        printAnimals(arrayAnimal);
        printAnimals(searchAnimal(arrayAnimal, 11));
        System.out.println("-----------------------------------");
        printAnimals(searchAnimal(arrayAnimal, "doggy"));
    }

    static Animals[] searchAnimal (Animals[] animals, int age){
        Animals [] res = new Animals[animals.length];
        int counter = 0;
        for (Animals an: animals){
          if (an.getAge() > age){
              res[counter++] = an;
          }

        }
        return Arrays.copyOf(res, counter);

    }

    static Animals[] searchAnimal (Animals[] animals, String name){
        Animals [] res = new Animals[animals.length];
        int counter = 0;
        for (Animals an: animals){
            if (an.getName().equals(name)){
                res[counter++] = an;
            }

        }
        return Arrays.copyOf(res, counter);
    }

    static void printAnimals (Animals[] array){
        if (array.length == 0){
            System.out.println("No animals");
        }
        else {
            for (Animals elem : array){
                elem.viewAnimal();
            }
        }
    }
}
