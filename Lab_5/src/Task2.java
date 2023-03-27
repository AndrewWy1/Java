import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Task2 {
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
        double[] b = {1, 2, 3, 4};

        String first = "First: " + Arrays.toString(Task2.addVectors(a, b));
        String second = "Second: " + Arrays.toString(Task2.divisionVectors(a, b));
        String third = "Third: " + Arrays.toString(Task2.multiVectors(a, b));

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        label1.setText(first);
        label2.setText(second);
        label3.setText(third);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        //frame.pack();
    }
}

