package Inheritance;

public class Cat extends Animal {
    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}