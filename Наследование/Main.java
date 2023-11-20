//пример неправильного использования наследования
class Rectangle {
    protected int width;
    protected int height;
  
    public void setWidth(int width) {
        this.width = width;
    }
  
    public void setHeight(int height) {
        this.height = height;
    }
  
    public int calculateArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
  
    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setWidth(5);
        rectangle.setHeight(10);

        int area = rectangle.calculateArea();
        System.out.println("Площадь: " + area);
    }
}
