import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Function extends JFrame {
    private JLabel labelA;
    private JLabel labelX;
    private JLabel labelPoints;
    private JTextField fieldA;
    private JTextField fieldX;
    private JTextField fieldPoints;
    private JTextArea resultArea;

    Function() {
        setTitle("Function Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        labelA = new JLabel("Enter value for A:");
        labelX = new JLabel("Enter value for X:");
        labelPoints = new JLabel("Enter number of points:");

        fieldA = new JTextField(10);
        fieldX = new JTextField(10);
        fieldPoints = new JTextField(10);

        resultArea = new JTextArea(20, 30);
        resultArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(resultArea);
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Input"));
        inputPanel.add(labelA);
        inputPanel.add(fieldA);
        inputPanel.add(labelX);
        inputPanel.add(fieldX);
        inputPanel.add(labelPoints);
        inputPanel.add(fieldPoints);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(calculateButton);
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder("Results"));
        resultPanel.add(scrollPane, BorderLayout.CENTER);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(inputPanel, BorderLayout.NORTH);
        c.add(buttonPanel, BorderLayout.CENTER);
        c.add(resultPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calculate() {
        double a = Double.parseDouble(fieldA.getText());
        double x = Double.parseDouble(fieldX.getText());
        int points = Integer.parseInt(fieldPoints.getText());

        resultArea.setText("");
        for (int i = 0; i < points; i++) {
            double xi = i * x / points;
            double yi = a * Math.sqrt(xi) * Math.sin(a * xi);
            resultArea.append(String.format("Y(%d) = %f\n", i, yi));
        }
    }

    public static void main(String[] args) {
        new Function();
    }
}
