
class Shape {
  
    public double getArea() {
        System.out.println("Area of shape is undefined");
        return 0;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

   
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double getArea() {
        return length * width;
    }
}


public class Area_w_constructor {
    public static void main(String[] args) {
       
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rect.getArea());
    }
}
