class Animal {
    void sound() {
    }
}

class Dog extends Animal {
    void sound() {
        bark();
    }
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void sound() {
        meow();
    }
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Animal a;

        a=new Dog();
        a.sound();

        a=new Cat();
        a.sound();
    }
}