import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;

public class Test extends JFrame {
    private ArrayList<Integer> scores = new ArrayList<>();
    private int currentQuestion = 0;
    private JLabel questionLabel;
    private JRadioButton optionARadioButton, optionBRadioButton, optionCRadioButton, optionDRadioButton;
    private JButton nextButton;
    private ButtonGroup buttonGroup;

    private String[] questions = {"Питання 1: Яка столиця Франції?",
            "Запитання 2: Яка найвища гора в світі?",
            "Запитання 3: Яка найбільша країна в світі?",
            "Запитання 4: Яка валюта Японії?",
            "Питання 5: Хто є нинішнім президентом Сполучених Штатів?"};
    private String[][] options = {{"А. Париж", "Б. Берлі", "C. Мадрид", "Д. Рим"},
            {"А. Еверест", "Б. Кіліманджаро", "C. Деналі", "Д. Аконкагуа"},
            {"А. Росія", "Б. Цанада", "Ц. Китай", "Д. Сполучені Штати"},
            {"А. Єн", "Б. євро", "C. Долар", "Д. Фунт"},
            {"А. Джо Байден", "Б. Дональд Трамп", "C. Барак Обама", "Д. Джордж Буш"}};
    private char[] answers = {'А', 'А', 'А', 'А', 'А'};

    public Test() {
        super("Test");
        setSize(400, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.PAGE_AXIS));

        JPanel questionPanel = new JPanel();
        questionLabel = new JLabel(questions[currentQuestion]);
        questionPanel.add(questionLabel);
        c.add(questionPanel);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.PAGE_AXIS));
        optionARadioButton = new JRadioButton(options[currentQuestion][0], true);
        optionBRadioButton = new JRadioButton(options[currentQuestion][1], false);
        optionCRadioButton = new JRadioButton(options[currentQuestion][2], false);
        optionDRadioButton = new JRadioButton(options[currentQuestion][3], false);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(optionARadioButton);
        buttonGroup.add(optionBRadioButton);
        buttonGroup.add(optionCRadioButton);
        buttonGroup.add(optionDRadioButton);
        optionsPanel.add(optionARadioButton);
        optionsPanel.add(optionBRadioButton);
        optionsPanel.add(optionCRadioButton);
        optionsPanel.add(optionDRadioButton);
        c.add(optionsPanel);

        JPanel buttonPanel = new JPanel();
        nextButton = new JButton("Next");
        nextButton.addActionListener(new NextButtonListener());
        buttonPanel.add(nextButton);
        c.add(buttonPanel);

        setVisible(true);
    }

    private class NextButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (currentQuestion == questions.length - 1) {
                // Last question, show score
                double totalScore = scores.stream().mapToInt(Integer::intValue).sum();
                double avgScore = scores.isEmpty() ? 0 : totalScore / (double)scores.size();
                JOptionPane.showMessageDialog(Test.this, "Test complete! Your score is " + avgScore);
                questionLabel.setText("Test complete! Your score is " + avgScore);
                System.exit(0);
            }
            else {
                // Check answer and update score
                if (optionARadioButton.isSelected() && answers[currentQuestion] == 'А') {
                    scores.add(5);
                } else if (optionBRadioButton.isSelected() && answers[currentQuestion] == 'Б') {
                    scores.add(5);
                } else if (optionCRadioButton.isSelected() && answers[currentQuestion] == 'В') {
                    scores.add(5);
                } else if (optionDRadioButton.isSelected() && answers[currentQuestion] == 'Г') {
                    scores.add(5);
                }
                currentQuestion++;
                questionLabel.setText(questions[currentQuestion]);
                optionARadioButton.setText(options[currentQuestion][0]);
                optionBRadioButton.setText(options[currentQuestion][1]);
                optionCRadioButton.setText(options[currentQuestion][2]);
                optionDRadioButton.setText(options[currentQuestion][3]);
                buttonGroup.clearSelection();
            }
        }
    }


    public static void main(String[] args) {
        new Test();
    }
}
