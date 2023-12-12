import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frmApartment extends  JFrame {
    private JPanel pnlMain;
    private JLabel lblId;
    private frmMain frmMain;
    public  frmApartment(int id,frmMain main)
    {

        lblId.setText(id + "");
        frmMain = main;

        initializeComponents();
        addEvents();
    }

    private void addEvents() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                frmMain.setVisible(true);
            }
        });
    }

    private void initializeComponents() {
        this.setContentPane(pnlMain);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
    }

}
