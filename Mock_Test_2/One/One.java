
class Animal{
    public void makeSound(){
        System.out.println("Generic sound");
    }
}


class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog sound: woof woof");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat sound: meow meow");
    }
}

class Cow extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cow sound: moo moo");
    }
}


public class One {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cow c2 = new Cow();
        Dog d1 = new Dog();

        c1.makeSound();
        c2.makeSound();
        d1.makeSound();

    }
}