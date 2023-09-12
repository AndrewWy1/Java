import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Dialog4New extends JFrame {
    JTextField fld = new JTextField(20);
    JButton btn = new JButton("Натиснути");
    JButton printBtn = new JButton("Друкувати");
    JLabel inputLbl = new JLabel("Введіть текст:");
    JLabel outputLbl = new JLabel("Вивід:");
    JLabel output = new JLabel(" ");
    ArrayList<String> inputList = new ArrayList<>();

    Dialog4New() {
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
        btnPanel.add(printBtn);

        //додаємо панелі в контейнер
        Container c = getContentPane();
        c.add(inputPanel, BorderLayout.NORTH);
        c.add(outputPanel, BorderLayout.CENTER);
        c.add(btnPanel, BorderLayout.SOUTH);

        //додаємо користувачів до елементів
        fld.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String inputText = fld.getText();
                inputList.add(inputText);
                output.setText(inputText);
            }
        });

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String inputText = fld.getText();
                inputList.add(inputText);
                output.setText(inputText);
            }
        });

        printBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                for (String text : inputList) {
                    System.out.println(text);
                }
            }
        });

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);

        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Dialog4New();
    }
}
