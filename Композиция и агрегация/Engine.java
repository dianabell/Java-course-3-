//Пример композиции
class Engine {
    public void start() {
        System.out.println("Запуск двигателя");
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine(); // Создание объекта Engine внутри класса Car
    }

    public void startCar() {
        engine.start(); // Использование функциональности двигателя
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar(); // Запуск автомобиля
    }
}
