package Inheritance;

abstract class Animal {
    private String name;
    private int boundaryX;
    private int boundaryY;
    private String location;
    private boolean extinctSpecies;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getBoundaryX() {
        return boundaryX;
    }
    public void setBoundaryX(int bX) {
        boundaryX = bX;
    }

    public int getBoundaryY() {
        return boundaryY;
    }

    public void setBoundaryY(int boundaryY) {
        this.boundaryY = boundaryY;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isExtinctSpecies() {
        return extinctSpecies;
    }

    public void setExtinctSpecies(boolean extinctSpecies) {
        this.extinctSpecies = extinctSpecies;
    }

    abstract void eat();

    public void sleep() {
        System.out.println("Zzzz");
    }

    abstract void roam();

    abstract void makeSound();

    public void doWeirdness(Animal a) {
        System.out.println("Bowwry!");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Eat meat");
    }

    @Override
    void roam() {
        System.out.println("Roam here and there");
    }

    @Override
    void makeSound() {
        System.out.println("Bow Bowww!");
    }
}

class Tiger extends Dog {
    void makeSound() {
        System.out.println("Murrr!!!");
    }
}


public class AbstractionAndInheritance {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.makeSound();
        doggy.doWeirdness(doggy);


        Tiger tiger = new Tiger();
        tiger.makeSound();
        tiger.eat();
    }
}

