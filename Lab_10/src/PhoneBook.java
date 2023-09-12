import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class PhoneBook extends JFrame {

    private JTextField lastNameField, phoneField;
    private JButton printButton;
    private JLabel countLabel;
    private TreeSet<String> data;

    public PhoneBook() {
        super("My Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridLayout(2, 1));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel topPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        Border topBorder = new LineBorder(getForeground(), 1);
        topBorder = new EmptyBorder(10, 10, 10, 10);
        topPanel.setBorder(topBorder);
        topPanel.add(new JLabel("Фамілія:"));
        lastNameField = new JTextField();
        topPanel.add(lastNameField);
        topPanel.add(new JLabel("Телефон:"));
        phoneField = new JTextField();
        topPanel.add(phoneField);
        mainPanel.add(topPanel);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        Border bottomBorder = new LineBorder(getForeground(), 1);
        bottomBorder = new EmptyBorder(10, 10, 10, 10);
        bottomPanel.setBorder(bottomBorder);
        countLabel = new JLabel("Кількість записів: 0");
        bottomPanel.add(countLabel, BorderLayout.WEST);
        printButton = new JButton("Друк");
        bottomPanel.add(printButton, BorderLayout.EAST);
        mainPanel.add(bottomPanel);
        getContentPane().add(mainPanel);
        data = new TreeSet<>();
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(data);
            }
        });
        phoneField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lastName = lastNameField.getText();
                String phone = phoneField.getText();
                if (!lastName.isEmpty() && !phone.isEmpty()) {
                    String record = "\nФамілія: " + lastName + ", Телефон: " + phone;
                    data.add(record);
                    countLabel.setText("Кількість записів: " + data.size());
                    lastNameField.setText("");
                    phoneField.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        PhoneBook program = new PhoneBook();
        program.setVisible(true);
    }
}

