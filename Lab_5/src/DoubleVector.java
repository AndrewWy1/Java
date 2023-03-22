import java.util.Arrays;

public class DoublesVectors {
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

        System.out.println("a + b : " + Arrays.toString(DoublesVectors.addVectors(a, b)));
        System.out.println("a - b : " + Arrays.toString(DoublesVectors.subtractionVectors(a, b)));
        System.out.println("a * b : " + Arrays.toString(DoublesVectors.multiVectors(a, b)));
        System.out.println("a / b : " + Arrays.toString(DoublesVectors.divisionVectors(a, b)));
        System.out.println("a * num : " + Arrays.toString(DoublesVectors.multiVectorsNum(a, num)));

    }
}
