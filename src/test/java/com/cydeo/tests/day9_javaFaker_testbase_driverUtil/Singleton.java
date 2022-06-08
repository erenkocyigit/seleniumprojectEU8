package com.cydeo.tests.day9_javaFaker_testbase_driverUtil;

import com.sun.source.tree.IfTree;

public class Singleton {

    // 1- Create private constructor
    private Singleton(){}

    // 2- Create private static String
    // prevent access and provide a getter method
    private static String word;

    //This utility method will return the "word" int the way we want to return
    public static String getWord() {

        if (word==null){
            System.out.println("First time call.Word object is null. Assigning value to it now!");
            word = "something";
        }else   {
            System.out.println("Word already has value.");
        }

        return word;
    }



}
