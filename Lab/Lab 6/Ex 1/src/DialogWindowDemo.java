import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogWindowDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //створення написів та текстових полів
        JLabel label1 = new JLabel("Label 1:");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Label 2:");
        JTextField textField2 = new JTextField(10);

        //створення кнопок "ОК" та "Відміна"
        JButton okButton = new JButton("ОК");
        JButton cancelButton = new JButton("Відміна");

        //створення панелі та додавання компонентів з відповідним розташуванням
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label1, BorderLayout.WEST);
        panel.add(textField1, BorderLayout.CENTER);
        panel.add(label2, BorderLayout.NORTH);
        panel.add(textField2, BorderLayout.SOUTH);

        //створення панелі для кнопок та додавання кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        //додавання панелі з текстовими полями та написами та панелі з кнопками
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        //встановлення розміру та відображення вікна
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

}