import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter rad: ");
        Scanner scan = new Scanner(System.in);
        double rad = scan.nextDouble();

        double sin = Math.sin(Math.toRadians(rad));
        double cos = Math.cos(Math.toRadians(rad));

        System.out.println("sin: " + sin + "\ncos: " + cos);

    }
}
