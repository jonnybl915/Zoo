package com.theironyard.jdblack;

/**
 * Created by jonathandavidblack on 5/24/16.
 */
public class Animal {
    String name;

    public void makeSound(){
        System.out.println("Animal Sound!!!");
    }

    @Override
    public String toString(){ //the override toString helps making print more human readable
        return name;
    }
}
