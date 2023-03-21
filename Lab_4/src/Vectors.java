import java.lang.reflect.Array;
import java.util.Arrays;

public class Vectors {
    public static double[] addVectors(double[] a, double[] b) {
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] + b[i];
        }

        return res;
    }
    public static double[] subtractionVectors(double[] a, double[] b) {
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] - b[i];
        }

        return res;
    }
    public static double[] multiVectors(double[] a, double[] b) {
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] * b[i];
        }

        return res;
    }
    public static double[] divisionVectors(double[] a, double[] b) {
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] / b[i];
        }

        return res;
    }
    public static double[] multiVectorsNum(double[] a, double num) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= num;
        }

        return a;
    }






    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4};
        double[] b = {1, 2, 1, 3};
        double num = 2;

        System.out.println("a + b : " + Arrays.toString(Vectors.addVectors(a, b)));
        System.out.println("a - b : " + Arrays.toString(Vectors.subtractionVectors(a, b)));
        System.out.println("a * b : " + Arrays.toString(Vectors.multiVectors(a, b)));
        System.out.println("a / b : " + Arrays.toString(Vectors.divisionVectors(a, b)));
        System.out.println("a * num : " + Arrays.toString(Vectors.multiVectorsNum(a, num)));

    }
}
