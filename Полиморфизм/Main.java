class Animal {
    void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Кошка мяукает");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Собака лает");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.makeSound(); // Вывод: "Кошка мяукает"
        animal2.makeSound(); // Вывод: "Собака лает"
    }
}