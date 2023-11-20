//Пример агрегацци
class Wheel {
    public void rotate() {
        System.out.println("Колесо вращается");
    }
}

class Car {
    private List<Wheel> wheels;

    public Car() {
        this.wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            wheels.add(new Wheel()); // Создание объектов Wheel и добавление их в список
        }
    }

    public void rotateWheels() {
        for (Wheel wheel : wheels) {
            wheel.rotate(); // Вращение каждого колеса
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.rotateWheels(); // Вращение колес автомобиля
    }
}