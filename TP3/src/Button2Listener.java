import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2Listener implements ActionListener {

    private JLabel Label;
    public Button2Listener(JLabel label){
        this.Label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cancel clicked!");
        this.Label.setText("Cancel clicked!");
    }



}
