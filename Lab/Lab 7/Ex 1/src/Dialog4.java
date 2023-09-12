import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dialog4 extends JFrame {
    JTextField fld = new JTextField(20);
    JButton btn = new JButton("Натиснути");
    JLabel inputLbl = new JLabel("Введіть текст:");
    JLabel outputLbl = new JLabel("Вивід:");
    JLabel output = new JLabel(" ");

    Dialog4() {
        super("Користувачі  полів та кнопок");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {}

        //створюємо панелі для елементів
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(inputLbl);
        inputPanel.add(fld);

        JPanel outputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        outputPanel.add(outputLbl);
        outputPanel.add(output);

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnPanel.add(btn);

        //додаємо панелі в контейнер
        Container c = getContentPane();
        c.add(inputPanel, BorderLayout.NORTH);
        c.add(outputPanel, BorderLayout.CENTER);
        c.add(btnPanel, BorderLayout.SOUTH);

        //додаємо користувачів до елементів
        fld.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                output.setText(fld.getText());
            }
        });

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                output.setText(fld.getText());
            }
        });

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);

        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Dialog4();
    }
}
