import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1Listener implements ActionListener {

    private JLabel Label;
    public Button1Listener(JLabel label){
        this.Label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK clicked!");
        this.Label.setText("OK clicked!");
    }



}
