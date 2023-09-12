import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;

public class Task extends JFrame {
    private ArrayList<Integer> scores = new ArrayList<>();
    private int currentQuestion = 0;
    private JLabel questionLabel;
    private JRadioButton optionARadioButton, optionBRadioButton, optionCRadioButton, optionDRadioButton;
    private JButton nextButton;
    private ButtonGroup buttonGroup;

    private String[] questions = {"1 + 1",
            "2 + 2",
            "3 + 3",
            "4 + 4"};
    private String[][] options = {
            {"2", "1", "3", "Ща, калькулятор включу"},
            {"4", "3", "8", "Ща, калькулятор включу"},
            {"6", "1", "9", "Ща, калькулятор включу"},
            {"8", "10", "16", "Ща, калькулятор включу"},
    };
    private char[] answers = {'A', 'A', 'A', 'A'};

    public Task() {
        setSize(500, 300);
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
        nextButton = new JButton("Наступне");
        nextButton.addActionListener(new NextButtonListener());
        buttonPanel.add(nextButton);
        c.add(buttonPanel);

        setVisible(true);
    }

    private class NextButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (currentQuestion == questions.length - 1) {
                // Last question, show score
                int totalScore = scores.stream().mapToInt(Integer::intValue).sum();
                int avgScore = scores.isEmpty() ? 0 : (int) Math.round(totalScore / scores.size());
                if (optionARadioButton.isSelected() && answers[currentQuestion] == 'А') {
                    scores.add(5);
                } else {
                    scores.add(0);
                }
                totalScore = scores.stream().mapToInt(Integer::intValue).sum();
                avgScore = scores.isEmpty() ? 0 : (int) Math.round(totalScore / scores.size());
                JOptionPane.showMessageDialog(Task.this, "Результат" + avgScore);
                questionLabel.setText("Результат" + avgScore);
                System.exit(0);
            } else {
                if (optionARadioButton.isSelected() && answers[currentQuestion] == 'А') {
                    scores.add(5);
                } else if (optionBRadioButton.isSelected() && answers[currentQuestion] == 'Б') {
                    scores.add(0);
                } else if (optionCRadioButton.isSelected() && answers[currentQuestion] == 'В') {
                    scores.add(0);
                } else if (optionDRadioButton.isSelected() && answers[currentQuestion] == 'Д') {
                    scores.add(0);
                } else {
                    scores.add(0);
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
        new Task();
    }
}
