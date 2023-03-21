import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter first cat: ");
        double firstCat = Double.parseDouble(new Scanner(System.in).nextLine());

        System.out.print("Enter second cat: ");
        double secondCat = Double.parseDouble(new Scanner(System.in).nextLine());

        double angle = Math.toRadians(Math.hypot(firstCat, secondCat));
        double degrees = Math.toDegrees(angle);
        double asin = Math.asin(angle);

        System.out.println("Degrees: " + degrees);
        System.out.println("Asin: " + asin);
    }
}
