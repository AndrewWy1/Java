import java.util.Scanner;
public class TriangleAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кут а: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть кут b: ");
        double b = scanner.nextDouble();
        double c = Math.hypot(a, b);
        double alpha = Math.toDegrees(Math.asin(a/c));
        double beta = Math.toDegrees(Math.asin(b/c));
        double gamma = 90.0;
        System.out.println("Кути трикутника:");
        System.out.println("alpha = " + alpha);
        System.out.println("beta = " + beta);
        System.out.println("gamma = " + gamma);

        scanner.close();
    }
}