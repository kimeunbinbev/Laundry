package deu.cse.laundry;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BackCommand implements Command {
    private JFrame frame;

    public BackCommand(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void execute() {
        frame.dispose();
    }
}

