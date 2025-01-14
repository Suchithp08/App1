package javafx.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class BloodGroupAppSwing {
    private static final Map<String, String[]> DONATE_TO = new HashMap<>();
    private static final Map<String, String[]> RECEIVE_FROM = new HashMap<>();
    private static final Map<String, String[]> CHILD_PREDICTION = new HashMap<>();

    static {
        DONATE_TO.put("A+", new String[]{"A+", "AB+"});
        DONATE_TO.put("A-", new String[]{"A+", "A-", "AB+", "AB-"});
        DONATE_TO.put("B+", new String[]{"B+", "AB+"});
        DONATE_TO.put("B-", new String[]{"B+", "B-", "AB+", "AB-"});
        DONATE_TO.put("AB+", new String[]{"AB+"});
        DONATE_TO.put("AB-", new String[]{"AB+", "AB-"});
        DONATE_TO.put("O+", new String[]{"A+", "B+", "AB+", "O+"});
        DONATE_TO.put("O-", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});

        RECEIVE_FROM.put("A+", new String[]{"A+", "A-", "O+", "O-"});
        RECEIVE_FROM.put("A-", new String[]{"A-", "O-"});
        RECEIVE_FROM.put("B+", new String[]{"B+", "B-", "O+", "O-"});
        RECEIVE_FROM.put("B-", new String[]{"B-", "O-"});
        RECEIVE_FROM.put("AB+", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        RECEIVE_FROM.put("AB-", new String[]{"A-", "B-", "AB-", "O-"});
        RECEIVE_FROM.put("O+", new String[]{"O+", "O-"});
        RECEIVE_FROM.put("O-", new String[]{"O-"});

        CHILD_PREDICTION.put("A+A+", new String[]{"A+", "A-", "O+", "O-"});
        CHILD_PREDICTION.put("A+A-", new String[]{"A+", "A-", "O+", "O-"});
        CHILD_PREDICTION.put("A+B+", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("A+B-", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("A+AB+", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("A+AB-", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("A+O+", new String[]{"A+", "A-", "O+", "O-"});
        CHILD_PREDICTION.put("A+O-", new String[]{"A+", "A-", "O+", "O-"});

        CHILD_PREDICTION.put("A-A-", new String[]{"A-", "O-"});
        CHILD_PREDICTION.put("A-B+", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("A-B-", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("A-AB+", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("A-AB-", new String[]{"A-", "B-", "AB-", "O-"});
        CHILD_PREDICTION.put("A-O+", new String[]{"A+", "A-", "O+", "O-"});
        CHILD_PREDICTION.put("A-O-", new String[]{"A-", "O-"});

        CHILD_PREDICTION.put("B+B+", new String[]{"B+", "B-", "O+", "O-"});
        CHILD_PREDICTION.put("B+B-", new String[]{"B+", "B-", "O+", "O-"});
        CHILD_PREDICTION.put("B+AB+", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("B+AB-", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("B+O+", new String[]{"B+", "B-", "O+", "O-"});
        CHILD_PREDICTION.put("B+O-", new String[]{"B+", "B-", "O+", "O-"});

        CHILD_PREDICTION.put("B-B-", new String[]{"B-", "O-"});
        CHILD_PREDICTION.put("B-AB+", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("B-AB-", new String[]{"A-", "B-", "AB-", "O-"});
        CHILD_PREDICTION.put("B-O+", new String[]{"B+", "B-", "O+", "O-"});
        CHILD_PREDICTION.put("B-O-", new String[]{"B-", "O-"});

        CHILD_PREDICTION.put("AB+AB+", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("AB+AB-", new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        CHILD_PREDICTION.put("AB+O+", new String[]{"A+", "A-", "B+", "B-", "O+", "O-"});
        CHILD_PREDICTION.put("AB+O-", new String[]{"A+", "A-", "B+", "B-", "O+", "O-"});

        CHILD_PREDICTION.put("AB-AB-", new String[]{"A-", "B-", "AB-", "O-"});
        CHILD_PREDICTION.put("AB-O+", new String[]{"A+", "A-", "B+", "B-", "O+", "O-"});
        CHILD_PREDICTION.put("AB-O-", new String[]{"A-", "B-", "O-"});

        CHILD_PREDICTION.put("O+O+", new String[]{"O+", "O-"});
        CHILD_PREDICTION.put("O+O-", new String[]{"O+", "O-"});

        CHILD_PREDICTION.put("O-O-", new String[]{"O-"});
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BloodGroupAppSwing::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Blood Group Compatibility");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel selectLabel = new JLabel("Select Your Blood Group:");
        JComboBox<String> bloodGroupComboBox = new JComboBox<>(new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        JLabel donateLabel = new JLabel();
        JLabel receiveLabel = new JLabel();
        JButton checkButton = new JButton("Check Compatibility");

        JLabel motherLabel = new JLabel("Mother's Blood Group:");
        JComboBox<String> motherComboBox = new JComboBox<>(new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        JLabel fatherLabel = new JLabel("Father's Blood Group:");
        JComboBox<String> fatherComboBox = new JComboBox<>(new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        JLabel childLabel = new JLabel();
        JButton predictButton = new JButton("Predict Child's Blood Group");

        // Add action listener to the check button
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedGroup = (String) bloodGroupComboBox.getSelectedItem();
                if (selectedGroup != null) {
                    String[] donateTo = DONATE_TO.get(selectedGroup);
                    String[] receiveFrom = RECEIVE_FROM.get(selectedGroup);
                    donateLabel.setText("Can Donate To: " + String.join(", ", donateTo));
                    receiveLabel.setText("Can Receive From: " + String.join(", ", receiveFrom));
                } else {
                    donateLabel.setText("Please select a blood group.");
                    receiveLabel.setText("");
                }
            }
        });

        // Add action listener to the predict button
        predictButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String motherGroup = (String) motherComboBox.getSelectedItem();
                String fatherGroup = (String) fatherComboBox.getSelectedItem();
                if (motherGroup != null && fatherGroup != null) {
                    String key = motherGroup + fatherGroup;
                    String[] predictedGroups = CHILD_PREDICTION.get(key);
                    if (predictedGroups == null) {
                        key = fatherGroup + motherGroup;
                        predictedGroups = CHILD_PREDICTION.get(key);
                    }
                    if (predictedGroups != null) {
                        childLabel.setText("Possible Child Blood Groups: " + String.join(", ", predictedGroups));
                    } else {
                        childLabel.setText("No prediction available for selected parents.");
                    }
                } else {
                    childLabel.setText("Please select blood groups for both parents.");
                }
            }
        });

        // Add components to the frame
        frame.add(selectLabel);
        frame.add(bloodGroupComboBox);
        frame.add(checkButton);
        frame.add(donateLabel);
        frame.add(receiveLabel);
        frame.add(motherLabel);
        frame.add(motherComboBox);
        frame.add(fatherLabel);
        frame.add(fatherComboBox);
        frame.add(predictButton);
        frame.add(childLabel);

        // Display the frame
        frame.setVisible(true);
    }
}
