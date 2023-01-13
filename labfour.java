import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class labfour {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Working Directory " + currentDirectory);

        System.out.println("Programmer: " + System.getProperty("user.name"));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy @ HH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Lab 18.1: " + dtf.format(now));

        Scanner input = new Scanner(System.in);
        int radius;

        System.out.print("\nEnter the radius of the circle: ");
        radius = input.nextInt();

        circle shape = new circle();

        shape.setRadius(radius);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("The circle's area is " + df.format(shape.getArea()));
        System.out.println("The circle's diameter is " + df.format(shape.getDiameter()));
        System.out.println("The circle's circumference is " + df.format(shape.getCircumference()));
    }
}
