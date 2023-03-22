import javax.swing.*;
import java.awt.*;

public class Task extends JFrame {
    public Task() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        JPanel panel = new JPanel(new GridLayout(3, 2, 50, 35));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 20, 40, 20));

        JLabel loginLabel = new JLabel("Логін:");
        JLabel passwordLabel = new JLabel("Пароль:");
        JTextField loginField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        panel.add(loginLabel);
        panel.add(loginField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(okButton);
        panel.add(cancelButton);

        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        new Task();
    }
}