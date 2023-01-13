import java.util.Scanner;

public class circle {
    private int radius;
    private final double PI;
    public circle(){
        radius = 0;
        PI = 3.14159;
    }
    public circle(int r, double p){
        radius = r;
        PI = p;
    }
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public double getCircumference(){
        return 2 * PI * radius;
    }
    public double getArea(){
        return PI * radius * radius;
    }
    public double getDiameter(){
        return radius * 2;
    }

    public void setRadius(Scanner input) {
    }
}
