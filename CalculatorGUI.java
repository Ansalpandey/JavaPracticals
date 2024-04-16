import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    private JFrame frame;
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton addButton;
    private JLabel resultLabel;

    public CalculatorGUI() {
        // Create the frame
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));

        // Create the input fields
        num1Field = new JTextField();
        num2Field = new JTextField();

        // Create the add button
        addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener());

        // Create the result label
        resultLabel = new JLabel("Result: ");

        // Add components to the frame
        frame.add(new JLabel("First Number: "));
        frame.add(num1Field);
        frame.add(new JLabel("Second Number: "));
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(resultLabel);

        // Display the frame
        frame.setVisible(true);
    }

    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double sum = num1 + num2;

            resultLabel.setText("Result: " + sum);
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}