package Interfaces;

import java.util.ArrayList;

class Animals {
    private String name;

    public void sleep() {
        System.out.println("ZZZzzzz");
    }
    public void makeSound() {
        System.out.println("Preww!!1");
    }


}
interface roam {
    abstract void roamBoundaries();

}

interface location {
    abstract void locationAni();
}
class AnimalList {
    private int id;
    private int size;
    private Animals[] arrayAnimals = new Animals[5];
    int i = 0;

    public void display() {
        System.out.println(arrayAnimals.length);
    }



    public void add(Animals a) {
        if (i < arrayAnimals.length) {
            arrayAnimals[i] = a;
            System.out.println(arrayAnimals[i] + " came inside at " + i);
            i++;
        }
    }

}

class Dog extends Animals {
    public void makeSound() {
        super.makeSound();
        System.out.println("Bowww!");
    }
}

class Cat extends Animals implements roam,location {
    public void makeSound() {
        System.out.println("Meoww!");
    }

    @Override
    public void roamBoundaries() {
        System.out.println("Roa roam");
    }

    @Override
    public void locationAni() {
        System.out.println("Southern");
    }
}

public class Interfaces {
    static Object returning(Object o) {
        return o;
    }
    public static void main(String[] args) {

        Dog luna = new Dog();
        Dog nuna = new Dog();



        AnimalList arrayAnimals = new AnimalList();

        Animals a = new Animals(); // parent obj
        Cat meena = new Cat(); // child obj
//        Cat nuna = meena;
//
//        Animals ani = meena; // upcasting
//
//        System.out.println(meena.equals(nuna));
//        System.out.println(meena.getClass());
//        System.out.println(meena.toString());
//        arrayAnimals.add(meena);
//        arrayAnimals.add(luna);

        ArrayList<Dog> dogarrays = new ArrayList<Dog>();
        dogarrays.add(luna);
        dogarrays.add(nuna);
        for (Dog d : dogarrays) {
//            System.out.println(d);
        }


        Dog d = dogarrays.get(0);
//        System.out.println(d);

        Cat catten = new Cat();
        Object c = returning(catten);
        System.out.println(c instanceof Cat);
        Cat ca = (Cat)c;
        ca.makeSound();
        System.out.println(returning(catten));
        ca.roamBoundaries();

        Dog nana = new Dog();
        nana.makeSound();


    }
}
