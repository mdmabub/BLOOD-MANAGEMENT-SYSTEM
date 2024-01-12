package blood.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class PatientDetails extends JFrame implements ActionListener {

    JLabel l,l1, l2, l3;
    JTable t1,t3;
    JButton b1,b2;
    JTextField t2;
    JComboBox c2;
    String x[] = {"ID","Name",  "Blood Group", "Contact", "Location", "Email", "Disease "};
    String y[][] = new String[1000][13];
    String p[] = {"ID","Name",  "Blood Group", "Contact", "Location", "Email", "Disease "};
    String a[][] = new String[1000][13];
    int i = 0, j = 0;

    PatientDetails() {
        super("Patient Details");
        setSize(1610, 905);
        setLayout(null);
        
        l = new JLabel("PATIENT INFORMATION TABLE");
        l.setBounds(430, 10, 800, 30);
        l.setFont(new Font("serif", Font.BOLD, 40));
        add(l);

        l1 = new JLabel("Select your blood group : ");
        l1.setBounds(550, 650, 400, 30);
        l1.setFont(new Font("serif", Font.BOLD, 25));
        add(l1);

        String group[] = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        c2 = new JComboBox(group);
        c2.setBounds(850, 652, 100, 30);
        c2.setFont(new Font("serif", Font.BOLD, 25));
        add(c2);
        
        b1 = new JButton("Enter to Find");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(850, 750, 250, 40);
        b1.setFont(new Font("serif", Font.BOLD, 25));
        add(b1);
        
        b1.addActionListener(this);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.white);
        b2.setBounds(450,750,250,40);
        b2.setFont(new Font("serif", Font.BOLD, 25));
        add(b2);
        
        b2.addActionListener(this);


        try {
            ConnectionClass c1 = new ConnectionClass();
            String s1 = "select * from patient";
            ResultSet rs = c1.s.executeQuery(s1);
            while (rs.next()) {
                
                y[i][j++] = rs.getString("id");
                y[i][j++] = rs.getString("name");
                y[i][j++] = rs.getString("blood_group");
                y[i][j++] = rs.getString("contact");
                y[i][j++] = rs.getString("location");
                y[i][j++] = rs.getString("email");
                y[i][j++] = rs.getString("disease");
                i++;
                j = 0;
            }
            t1 = new JTable(y, x);

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20, 80, 1550, 530);
        add(sp);

        getContentPane().setBackground(Color.white);
        
    }

    public void actionPerformed(ActionEvent ae) {
        ConnectionClass c1 = new ConnectionClass();
           
        if (ae.getSource() == b1) {
            try {
                String b = (String)c2.getSelectedItem();
                String q = "select * from patient where blood_group = '"+b+"';";
                ResultSet rs1 = c1.s.executeQuery(q);
                i=0;
                j=0;
            while (rs1.next()) {
                a[i][j++] = rs1.getString("id");
                a[i][j++] = rs1.getString("name");
                a[i][j++] = rs1.getString("blood_group");
                a[i][j++] = rs1.getString("contact");
                a[i][j++] = rs1.getString("location");
                a[i][j++] = rs1.getString("email");
                a[i][j++] = rs1.getString("disease");
                i++;
                j = 0;
            }
            t3 = new JTable(a, p);
            JScrollPane sp1 = new JScrollPane(t3);
        sp1.setBounds(20, 50, 1200, 330);
        add(sp1);
            } catch (Exception ez) {
              ez.printStackTrace();
            }
        }
        else if (ae.getSource() == b2) {
            new Home().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new PatientDetails().setVisible(true);
    }

    

}
