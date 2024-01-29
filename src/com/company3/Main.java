package com.company3;

// Base class (superclass)
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass 1 (derived class)
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof, woof!");
    }
}

// Subclass 2 (derived class)
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow, meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
       // Dog dog = new Dog();
        //Cat cat = new Cat();

        // Use polymorphism to call the makeSound method
        Animal animal1 = new Dog();
        Animal animal2 =  new Cat();

        animal1.makeSound(); // Calls the Dog's makeSound method
        animal2.makeSound(); // Calls the Cat's makeSound method
    }
}

