import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window_Method_2 extends JFrame implements ActionListener {

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

    public Window_Method_2() {
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

        //Auto-écoute
        this.OKbutton.addActionListener(this);
        this.Cancelbutton.addActionListener(this);

        this.add(LabelPanel,BorderLayout.CENTER);
        this.add(ButtonPanel,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.OKbutton){
            System.out.println("OK clicked! (method 2)");
            this.OKLabel.setText("OK clicked! (method 2)");
        }
        if(e.getSource()== this.Cancelbutton){
            System.out.println("Cancel clicked! (method 2)");
            this.CancelLabel.setText("Cancel clicked! (method 2)");
        }
    }
}