import java.io.*;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) throws IOException {
        double radius;
        double area;
        System.out.print("Enter the radius of the circle: ");
// Зв’язок з клавіатурою
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}