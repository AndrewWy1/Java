import java.util.Arrays;

public class DoubleVector {
    private double[] vector = null;

    public DoubleVector(double[] vector) {
        this.vector = vector;
    }

    // Скалярний добуток векторів
    public double mult(DoubleVector anotherVector) {
        double s = 0;
        for (int i = 0; i < vector.length; i++) {
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }

    // Додавання векторів
    public DoubleVector add(DoubleVector anotherVector) {
        double[] result = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            result[i] = vector[i] + anotherVector.vector[i];
        }
        return new DoubleVector(result);
    }

    // Віднімання векторів
    public DoubleVector subtract(DoubleVector anotherVector) {
        double[] result = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            result[i] = vector[i] - anotherVector.vector[i];
        }
        return new DoubleVector(result);
    }

    // Множення вектора на число
    public DoubleVector multiply(double scalar) {
        double[] result = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            result[i] = vector[i] * scalar;
        }
        return new DoubleVector(result);
    }

    // Статичний метод для множення вектора на число
    public static DoubleVector multiply(DoubleVector vector, double scalar) {
        return vector.multiply(scalar);
    }

    // Статичний метод для скалярного добутку векторів
    public static double mult(DoubleVector a, DoubleVector b) {
        double s = 0;
        for (int i = 0; i < a.vector.length; i++) {
            s += a.vector[i] * b.vector[i];
        }
        return s;
    }

    public static void main(String[] args) {
        double[] a = {5, 2, 3, 8};
        double[] b = {7, 3, 1, 9};
        double[] c = {2, 2, 4, 6};

        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);
        DoubleVector v3 = new DoubleVector(c);

        System.out.println("v1*v2=" + v1.mult(v2));
        System.out.println("v1*v2=" + DoubleVector.mult(v1, v2));
        System.out.println("v1*v3=" + v1.mult(v3));

        DoubleVector sum = v1.add(v2);
        System.out.println("v1+v2=" + Arrays.toString(sum.vector));

        DoubleVector diff = v1.subtract(v3);
        System.out.println("v1-v3=" + Arrays.toString(diff.vector));

    }
}