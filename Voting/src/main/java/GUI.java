import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI extends JFrame {

    private static final int width = 1000;
    private static final int height = 800;
    private JTextField textField;

    public GUI() {
        initGUI();
        setTitle("Voting");
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    void initGUI() {
        JPanel buttonPanel = createButtonPanel();
        JPanel textPanel = createTextPanel();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(buttonPanel, BorderLayout.NORTH);
        getContentPane().add(textPanel, BorderLayout.CENTER);
    }

    private JPanel createTextPanel() {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
            }
        };
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        panel.setBorder(blackline);

        return panel;
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        panel.setBorder(blackline);

        textField = new JTextField(20);
        textField.setEditable(false);
        textField.setFocusable(false);
        textField.setHorizontalAlignment(JTextField.CENTER);

        VoteButton button_vote1 = new VoteButton("Vote 1", textField, null, "Vote 1");
        VoteButton button_vote2 = new VoteButton("Vote 2", textField, button_vote1, "Vote 2");
        button_vote1.otherButton = button_vote2;

        panel.add(button_vote1);
        panel.add(textField);
        panel.add(button_vote2);

        return panel;
    }
}