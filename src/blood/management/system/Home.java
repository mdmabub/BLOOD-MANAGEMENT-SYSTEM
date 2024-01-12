package blood.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    JLabel id,id1,id2;
    Home(){
        super("Blood Donation System");
        setBackground(Color.WHITE);
        setSize(1610,905);
        
        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource("blood/management/system/home.jpg"));
        Image i4 = ic4.getImage().getScaledInstance(1605,890,Image.SCALE_DEFAULT);
        ImageIcon  icc4 = new ImageIcon(i4);
        JLabel l4 = new JLabel(icc4);
        l4.setSize(1605,895);
        add(l4);
        
        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("blood/management/system/p.jpg"));
        Image i1 = ic1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon  icc1 = new ImageIcon(i1);
        
        b1 = new JButton(icc1);
        b1.setBackground(Color.white);
        b1.setBounds(400,290,150,150);
        l4.add(b1);
        
        b1.addActionListener(this);
        
        id = new JLabel("Patient Details");
        id.setBounds(410,440,150,30);
        id.setFont(new Font("serif",Font.BOLD,20));
        l4.add(id);
        
        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("blood/management/system/d.jpg"));
        Image i2 = ic2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon  icc2 = new ImageIcon(i2);
        
        b2 = new JButton(icc2);
        b2.setBackground(Color.white);
        b2.setBounds(700,290,150,150);
        l4.add(b2);
        
        b2.addActionListener(this);
        
        id1 = new JLabel("Donor Details");
        id1.setBounds(715,440,150,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        l4.add(id1);
        
        ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("blood/management/system/blood bank.png"));
        Image i3 = ic3.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon  icc3 = new ImageIcon(i3);
        
        b3 = new JButton(icc3);
        b3.setBackground(Color.white);
        b3.setBounds(1000,290,150,150);
        l4.add(b3);
        
        b3.addActionListener(this);
        
        id2 = new JLabel("Blood Bank Details");
        id2.setBounds(995,440,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        l4.add(id2);
        
        JMenuBar mb = new JMenuBar();
        
        JMenu add1 = new JMenu(" ADD ");
        JMenuItem u1 = new JMenuItem("New Patient");
        JMenuItem u2 = new JMenuItem("New Donor");
        JMenuItem u3 = new JMenuItem("New Blood Bank");
        add1.setFont(new Font("monospaced",Font.BOLD,30));
        add1.setForeground(Color.DARK_GRAY);
        
        u1.setFont(new Font("monospaced",Font.BOLD,26));
        u1.setMnemonic('A');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        
        u2.setFont(new Font("monospaced",Font.BOLD,26));
        u2.setMnemonic('B');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
        
        u2.addActionListener(this);
        
        u3.setFont(new Font("monospaced",Font.BOLD,26));
        u3.setMnemonic('C');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
        u3.setBackground(Color.WHITE);
        
        u3.addActionListener(this);
        
        JMenu user = new JMenu(" Details ");
        JMenuItem d1 = new JMenuItem("Patient ");
        JMenuItem d2 = new JMenuItem("Donor ");
        JMenuItem d3 = new JMenuItem("Blood Bank ");
        user.setFont(new Font("monospaced",Font.BOLD,30));
        user.setForeground(Color.DARK_GRAY);
        
        d1.setFont(new Font("monospaced",Font.BOLD,26));
        d1.setMnemonic('A');
        d1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        d1.setBackground(Color.WHITE);
        
        d1.addActionListener(this);
        
        d2.setFont(new Font("monospaced",Font.BOLD,26));
        d2.setMnemonic('B');
        d2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
        d2.setBackground(Color.WHITE);
        
        d2.addActionListener(this);
        
        d3.setFont(new Font("monospaced",Font.BOLD,26));
        d3.setMnemonic('C');
        d3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
        d3.setBackground(Color.WHITE);
        
        d3.addActionListener(this);
        
        
       
        JMenu update_de = new JMenu(" Update ");
        JMenuItem up1 = new JMenuItem("Patient");
        JMenuItem up2 = new JMenuItem("Donor");
        JMenuItem up3 = new JMenuItem("Blood Bank");
        update_de.setFont(new Font("monospaced",Font.BOLD,30));
        update_de.setForeground(Color.DARK_GRAY);
        
        up1.setFont(new Font("monospaced",Font.BOLD,26));
        up1.setMnemonic('A');
        up1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        up1.setBackground(Color.WHITE);
        
        up1.addActionListener(this);
        
        up2.setFont(new Font("monospaced",Font.BOLD,26));
        up2.setMnemonic('B');
        up2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
        up2.setBackground(Color.WHITE);
        
        up2.addActionListener(this);
        
        up3.setFont(new Font("monospaced",Font.BOLD,26));
        up3.setMnemonic('C');
        up3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
        up3.setBackground(Color.WHITE);
        
        up3.addActionListener(this);
        
        JMenu ut = new JMenu("                                                                                                                                                                                                                                                                                        ");
        
        JMenu utility = new JMenu(" About us ");
        JMenuItem ut1 = new JMenuItem("About Us");
        ut1.setFont(new Font("monospaced",Font.BOLD,30));
        utility.setFont(new Font("monospaced",Font.BOLD,30));
        utility.setForeground(Color.GRAY);
        
        ut1.addActionListener(this);
        
        JMenu exit = new JMenu(" Exit ");
        JMenuItem ex = new JMenuItem("Exit");
        ex.setFont(new Font("monospaced",Font.BOLD,30));
        exit.setForeground(Color.RED);
        
        exit.setFont(new Font("monospaced",Font.BOLD,30));
        ex.setMnemonic('I');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        add1.add(u1);
        add1.add(u2);
        add1.add(u3);
        
        user.add(d1);
        user.add(d2);
        user.add(d3);
        
        update_de.add(up1);
        update_de.add(up2);
        update_de.add(up3);
        
        utility.add(ut1);
        
        exit.add(ex);
        
        
        mb.add(add1);
        mb.add(user);
        mb.add(update_de);
        mb.add(ut);
        mb.add(utility);
        mb.add(exit);
        mb.setFont(new Font("monospaced",Font.BOLD,26));
        mb.setBackground(Color.white);
        setJMenuBar(mb);
        
        
        setFont(new Font("Sensrif",Font.BOLD,50));
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Patient")){
            setVisible(false);
            new AddPatient().f.setVisible(true);
            
        }else if(msg.equals("New Donor")){
            setVisible(false);
            new AddDonor().f.setVisible(true);
            
        }else if(msg.equals("New Blood Bank")){
            setVisible(false);
            new BloodBank().f.setVisible(true);
            
        }else if(msg.equals("Patient ")){
            setVisible(false);
            new PatientDetails().setVisible(true);
            
        }else if(msg.equals("Donor ")){
            setVisible(false);
            new DonorDetails().setVisible(true);
            
        }else if(msg.equals("Blood Bank ")){
            setVisible(false);
            new BloodBankDetails().setVisible(true);
            
        }else if(msg.equals("Patient")){
            setVisible(false);
            new PatientUpdate().f.setVisible(true);
            
        }else if(msg.equals("Donor")){
            setVisible(false);
            new DonorUpdate().f.setVisible(true);
            
        }else if(msg.equals("Blood Bank")){
            setVisible(false);
            new BloodBankUpdate().f.setVisible(true);
            
        }
        else if(msg.equals("About Us")){
            setVisible(false);
            new AboutUs().f.setVisible(true);
            
        }else if(msg.equals("Exit")){
            System.exit(0);
        }else if (ae.getSource() == b1) {
            new PatientDetails().setVisible(true);
            this.setVisible(false);
        }else if (ae.getSource() == b2) {
            new DonorDetails().setVisible(true);
            this.setVisible(false);
        }else if (ae.getSource() == b3) {
            new BloodBankDetails().setVisible(true);
            this.setVisible(false);
        }
        
    }
    
    public static void main(String[] args) {
        new Home().setVisible(true);
    }
}