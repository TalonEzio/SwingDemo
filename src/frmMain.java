import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmMain extends  JFrame{
    private JPanel pnlMain;
    private JButton btn1;
    private JButton btn2;
    private JPanel pnlCenter;

    public frmMain()
    {
        initializeComponents();
        addEvents();

    }

    private void addEvents() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlCenter.removeAll();
                for(int i = 1; i <= 16; ++i)
                {
                    JButton btn = new JButton();
                    btn.setText("Tầng" + i);
                    btn.setSize(new Dimension(50,50));
                    pnlCenter.add(btn);

                    int tempI = i;
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frmApartment frmApartment = new frmApartment(tempI,frmMain.this);
                            frmMain.this.setVisible(false);
                            frmApartment.setVisible(true);
                        }
                    });

                }
                Integer count = pnlCenter.getComponentCount();

                pnlCenter.revalidate();
                pnlCenter.repaint();
            }

        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlCenter.removeAll();
                for(int i =17; i <= 32; ++i)
                {
                    JButton btn = new JButton();
                    btn.setText("Tầng" + i);
                    btn.setSize(new Dimension(50,50));
                    pnlCenter.add(btn);

                    int tempI = i;
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frmApartment frmApartment = new frmApartment(tempI,frmMain.this);

                            frmMain.this.setVisible(false);
                            frmApartment.setVisible(true);
                        }
                    });
                }
                pnlCenter.revalidate();
                pnlCenter.repaint();
            }
        });
    }

    private void initializeComponents() {
        this.setContentPane(pnlMain);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(900, 450);
        this.setLocationRelativeTo(null);// center app
    }

}
