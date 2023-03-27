import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dialog4 extends JFrame {
    JTextField field = new JTextField(20);
    JButton button = new JButton("Press");
    JLabel output = new JLabel();

    Dialog4() {

        WindowListener windowCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        addWindowListener(windowCloser);
        setSize(300, 150);
        setVisible(true);

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(new JLabel("Enter text:"));
        inputPanel.add(field);
        JPanel outputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        outputPanel.add(new JLabel("Output text:"));
        outputPanel.add(output);
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnPanel.add(button);

        Container c = getContentPane();
        c.add(inputPanel, BorderLayout.NORTH);
        c.add(outputPanel, BorderLayout.CENTER);
        c.add(btnPanel, BorderLayout.SOUTH);

        field.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                output.setText(field.getText());
            }
        });
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                output.setText(field.getText());
            }
        });

    }

    public static void main(String[] args) {
        new Dialog4();
    }
}
