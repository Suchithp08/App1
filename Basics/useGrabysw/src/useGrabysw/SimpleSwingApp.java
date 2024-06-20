package useGrabysw;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class SimpleSwingApp {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Swing App");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("press enter");

        // Create a button
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });
        JButton button1 = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
