import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VoteButton extends JButton implements ActionListener {
    private int voteCount = 0;
    private JTextField textField;
    VoteButton otherButton;
    private String name;

    public VoteButton(String text, JTextField textField, VoteButton otherButton, String name) {
        super(text);
        this.textField = textField;
        this.otherButton = otherButton;
        this.name = name;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        voteCount++;
        updateTextField();
    }

    public int getVoteCount() {
        return voteCount;
    }

    private void updateTextField() {
        if (otherButton != null) {
            if (name.equals("Vote 1")) {
                textField.setText("Vote 1: " + voteCount + ", Vote 2: " + otherButton.getVoteCount());
            } else {
                textField.setText("Vote 1: " + otherButton.getVoteCount() + ", Vote 2: " + voteCount);
            }
        } else {
            textField.setText(getText() + ": " + voteCount);
        }
    }
}