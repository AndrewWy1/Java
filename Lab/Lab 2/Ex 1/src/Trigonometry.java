import java.lang.*;
import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) {
        double angle1 = 45;
        double angle2 = 60;

        double radians1 = Math.toRadians(angle1);
        double radians2 = Math.toRadians(angle2);

        double sin1 = Math.sin(radians1);
        double sin2 = Math.sin(radians2);

        double cos1 = Math.cos(radians1);
        double cos2 = Math.cos(radians2);

        System.out.println("Sin(" + angle1 + "): " + sin1);
        System.out.println("Cos(" + angle1 + "): " + cos1);

        System.out.println("Sin(" + angle2 + "): " + sin2);
        System.out.println("Cos(" + angle2 + "): " + cos2);
    }
}
