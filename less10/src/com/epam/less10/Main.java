package com.epam.less10;

public class Main {

    public static void main(String[] args) {
        MyPhoneBook myBook = new MyPhoneBook();
        myBook.addPhoneNumber("Peter", "06711223432");
        myBook.addPhoneNumber("Ivan", "06714623432");
        myBook.addPhoneNumber("Tom", "06986523432");
        myBook.addPhoneNumber("Kirill", "06746523432");
        myBook.addPhoneNumber("Liza", "0954223432");
        myBook.printPhoneBook();
        System.out.println("----------");
        MyPhoneBook.PhoneRecord[] myRec = myBook.sortByName();
        for (MyPhoneBook.PhoneRecord elem: myRec) {
            System.out.println(elem);
        }
    }
}

