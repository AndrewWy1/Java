import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FunctionTable extends JFrame {
    JTextArea resultArea;
    JScrollPane scrollPane;
    FunctionTable() {
        super("Таблиця значень функції");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {}

        setSize(500, 400);
        Container c = getContentPane();
        JPanel pane = new JPanel(new BorderLayout());
        c.add(pane);

        JPanel controlPanel = new JPanel(new FlowLayout());
        pane.add(controlPanel, BorderLayout.NORTH);

        JLabel aLabel = new JLabel("Значення A:");
        JTextField aField = new JTextField("1.0", 5);
        controlPanel.add(aLabel);
        controlPanel.add(aField);

        JLabel xLabel = new JLabel("Значення X:");
        JTextField xField = new JTextField("0.1", 5);
        controlPanel.add(xLabel);
        controlPanel.add(xField);

        JButton calculateButton = new JButton("Обчислити");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(aField.getText());
                double xStep = Double.parseDouble(xField.getText());
                resultArea.setText("");
                for (double x = 0.0; x <= 1.0; x += xStep) {
                    double y = a * Math.sqrt(x) * Math.sin(a * x);
                    resultArea.append(String.format("%.2f  %.4f\n", x, y));
                }
            }
        });
        controlPanel.add(calculateButton);

        resultArea = new JTextArea(20, 40);
        scrollPane = new JScrollPane(resultArea);
        pane.add(scrollPane, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        FunctionTable ft = new FunctionTable();
    }
}
