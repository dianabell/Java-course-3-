class Animal {
    void eat() {
        System.out.println("Животное кушает");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Кошка мяукает");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Собака лает");
    }
}

public class NewClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();  // Наследуемый метод от Animal
        cat.meow(); // Уникальный метод для кошки

        Dog dog = new Dog();
        dog.eat();  // Наследуемый метод от Animal
        dog.bark(); // Уникальный метод для собаки
    }
}