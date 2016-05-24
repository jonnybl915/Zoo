package com.theironyard.jdblack;

/**
 * Created by jonathandavidblack on 5/24/16.
 */
public class Dog extends Mammal {
    public Dog() {
        this.name = "Dog";
    }

    @Override
    public void makeSound(){
        System.out.println("Woof Woof!");
    }
}
