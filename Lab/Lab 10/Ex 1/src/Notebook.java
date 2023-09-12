import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;
import javax.swing.*;

public class Notebook extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField surnameField;
    private JTextField phoneField;
    private JLabel countLabel;
    private TreeSet<String> entries;

    public Notebook() {
        super("Записник");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        // верхня панель з мітками, полями та кнопками
        JPanel topPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel surnameLabel = new JLabel("Прізвище:");
        topPanel.add(surnameLabel);
        surnameField = new JTextField();
        topPanel.add(surnameField);
        JLabel phoneLabel = new JLabel("Телефон(и):");
        topPanel.add(phoneLabel);
        phoneField = new JTextField();
        topPanel.add(phoneField);
        JButton addButton = new JButton("Додати");
        addButton.addActionListener(this);
        topPanel.add(addButton);
        JButton printButton = new JButton("Друкувати");
        printButton.addActionListener(this);
        topPanel.add(printButton);

        // нижня панель з міткою для кількості записів
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        countLabel = new JLabel("Кількість записів: 0");
        bottomPanel.add(countLabel);

        add(topPanel);
        add(bottomPanel);
        pack();
        setVisible(true);

        entries = new TreeSet<>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Додати")) {
            String surname = surnameField.getText().trim();
            String phones = phoneField.getText().trim();
            if (!surname.isEmpty() && !phones.isEmpty()) {
                entries.add(surname + ": " + phones);
                surnameField.setText("");
                phoneField.setText("");
                countLabel.setText("Кількість записів: " + entries.size());
            }
        } else if (e.getActionCommand().equals("Друкувати")) {
            for (String entry : entries) {
                System.out.println(entry);
            }
        }
    }

    public static void main(String[] args) {
        new Notebook();
    }
}
