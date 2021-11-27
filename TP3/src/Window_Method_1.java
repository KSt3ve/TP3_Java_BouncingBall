import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Window_Method_1 extends JFrame {

    private JButton OKbutton;
    private JLabel OKLabel;

    private JButton Cancelbutton;
    private JLabel CancelLabel;

    private JPanel LabelPanel;
    private JPanel ButtonPanel;

    public JLabel getOKLabel() {
        return OKLabel;
    }

    public JLabel getCancelLabel() {
        return CancelLabel;
    }

    public Window_Method_1() {
        super("My first Frame");
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //OK Label

        this.OKLabel = new JLabel("Click on Ok");
        this.add(OKLabel, BorderLayout.WEST);
        //OK Button

        this.OKbutton = new JButton("Ok");
        this.add(OKbutton, BorderLayout.SOUTH);

        //Cancel Label

        this.CancelLabel = new JLabel("Click on Cancel");
        this.add(CancelLabel, BorderLayout.WEST);

        //Cancel Button

        this.Cancelbutton = new JButton("Cancel");
        this.add(Cancelbutton, BorderLayout.SOUTH);

        //Ajout des Labels à notre LabelPanel

        LabelPanel = new JPanel();
        LabelPanel.setLayout(new GridLayout(2,1));
        this.LabelPanel.add(OKLabel);
        this.LabelPanel.add(CancelLabel);

        //Ajout des Buttons à notre ButtonPanel

        ButtonPanel = new JPanel();
        this.ButtonPanel.add(OKbutton);
        this.ButtonPanel.add(Cancelbutton);

        //Changement du Label du bouton ok
        Button1Listener OKButtonListen = new Button1Listener(this.OKLabel);

        //Changement du Label du bouton cancel
        Button2Listener CancelButtonListen = new Button2Listener(this.CancelLabel);

        //écoute des clics sur le bouton ok
        OKbutton.addActionListener(OKButtonListen);

        //écoute des clics sur le bouton cancel
        Cancelbutton.addActionListener(CancelButtonListen);

        this.add(LabelPanel,BorderLayout.CENTER);
        this.add(ButtonPanel,BorderLayout.SOUTH);

        this.setVisible(true);
    }
}