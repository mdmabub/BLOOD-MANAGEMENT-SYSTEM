package blood.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

class BloodBankUpdate implements ActionListener {

    JFrame f;
    JLabel id, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id13, id14, id15, lab, lab1, lab2;
    JTextField t, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;
    JButton b, b1, b2, b3;
    JComboBox c1, c2;
    String y[][] = new String[1000][13];
    int i = 0, j = 0;

    BloodBankUpdate() {
        
        f = new JFrame("Blood Bank Details Update");
        f.setSize(1610,905);
        f.setBackground(Color.white);
        f.setFont(new Font("serif", Font.ITALIC, 50));
        f.setFont(new Font("serif", Font.BOLD, 50));
        f.setLayout(null);
        
        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource("blood/management/system/blood bank.png"));
        Image i4 = ic4.getImage().getScaledInstance(1605,890,Image.SCALE_DEFAULT);
        ImageIcon  icc4 = new ImageIcon(i4);
        JLabel l5 = new JLabel(icc4);
        l5.setSize(1605,895);
        f.add(l5);
        

        JLabel l1 = new JLabel("Enter Id number and select blood group to update the data of Blood Bank :");
        l1.setBounds(270, 250, 850, 30);
        l1.setFont(new Font("serif", Font.ITALIC, 30));
        l1.setFont(new Font("serif", Font.BOLD, 25));
        l1.setForeground(Color.white);
        l5.add(l1);
        
        JLabel l3 = new JLabel("Tap ");
        l3.setBounds(400,170,800,50);
        l3.setFont(new Font("serif",Font.ITALIC,30));
        l3.setFont(new Font("serif", Font.BOLD, 25));
        l3.setForeground(Color.white);
        l5.add(l3);
        
        JLabel l4 = new JLabel(" button to insert new tuple to the Blood Bag  for update ");
        l4.setBounds(640,170,800,50);
        l4.setFont(new Font("serif",Font.ITALIC,30));
        l4.setFont(new Font("serif", Font.BOLD, 25));
        l4.setForeground(Color.white);
        l5.add(l4);
        
        b3 = new JButton("Insert");
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.white);
        b3.setBounds(470,180,150,35);
        b3.setFont(new Font("serif",Font.ITALIC,30));
        b3.setFont(new Font("serif", Font.BOLD, 25));
        l5.add(b3);
        
        b3.addActionListener(this);
        
        t12 = new JTextField();
        t12.setBounds(1080, 255, 150, 30);
        l5.add(t12);

        JLabel l2 = new JLabel(" & ");
        l2.setBounds(1230, 250,70, 30);
        l2.setFont(new Font("serif", Font.ITALIC, 30));
        l2.setFont(new Font("serif", Font.BOLD, 25));
        l2.setForeground(Color.white);
        l5.add(l2);

        String group1[] = {"NULL","A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        c2 = new JComboBox(group1);
        c2.setBackground(Color.white);
        c2.setBounds(1260, 255, 100, 30);
        c2.setFont(new Font("serif", Font.ITALIC, 22));
        l5.add(c2);

        b2 = new JButton("Update");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.white);
        b2.setBounds(1380, 253, 150, 35);
        b2.setFont(new Font("serif", Font.ITALIC, 25));
        b2.setFont(new Font("serif", Font.BOLD, 25));
        l5.add(b2);

        b2.addActionListener(this);

        id9 = new JLabel("BLOOD BANK DETAILS UPDATE");
        id9.setBounds(550,70,800,50);
        id9.setFont(new Font("serif",Font.ITALIC,40));
        id9.setFont(new Font("serif", Font.BOLD, 40));
        id9.setForeground(Color.white);
        l5.add(id9);

        id1 = new JLabel("Name :");
        id1.setBounds(620, 330, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 25));
        id1.setForeground(Color.white);
        l5.add(id1);

        t1 = new JTextField();
        t1.setBounds(800, 330, 250, 30);
        l5.add(t1);

        id2 = new JLabel("Address :");
        id2.setBounds(620, 400, 150, 30);
        id2.setFont(new Font("serif", Font.BOLD, 25));
        id2.setForeground(Color.white);
        l5.add(id2);

        t2 = new JTextField();
        t2.setBounds(800, 400, 250, 30);
        l5.add(t2);

        id3 = new JLabel("Contact :");
        id3.setBounds(620, 470, 150, 30);
        id3.setFont(new Font("serif", Font.BOLD, 25));
        id3.setForeground(Color.white);
        l5.add(id3);

        t3 = new JTextField();
        t3.setBounds(800, 470, 250, 30);
        l5.add(t3);

        id4 = new JLabel("Email :");
        id4.setBounds(620, 540, 150, 30);
        id4.setFont(new Font("serif", Font.BOLD, 25));
        id4.setForeground(Color.white);
        l5.add(id4);

        t4 = new JTextField();
        t4.setBounds(800, 540, 250, 30);
        l5.add(t4);

        id5 = new JLabel("Blood Group :");
        id5.setBounds(620, 610, 200, 30);
        id5.setFont(new Font("serif", Font.BOLD, 25));
        id5.setForeground(Color.white);
        l5.add(id5);

        String group[] = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        c1 = new JComboBox(group);
        c1.setBackground(Color.white);
        c1.setBounds(800, 610, 100, 30);
        c1.setFont(new Font("serif", Font.BOLD, 22));
        l5.add(c1);

        id6 = new JLabel("Quantity :");
        id6.setBounds(620, 680, 150, 30);
        id6.setFont(new Font("serif", Font.BOLD, 25));
        id6.setForeground(Color.white);
        l5.add(id6);

        t6 = new JTextField();
        t6.setBounds(800, 680, 250, 30);
        l5.add(t6);

        b1 = new JButton("Submit");
        b1.setBackground(Color.green);
        b1.setForeground(Color.white);
        b1.setBounds(940, 770, 150, 40);
        b1.setFont(new Font("serif", Font.BOLD, 25));
        l5.add(b1);

        b = new JButton("Cancel");
        b.setBackground(Color.red);
        b.setForeground(Color.white);
        b.setBounds(590, 770, 150, 40);
        b.setFont(new Font("serif", Font.BOLD, 25));
        l5.add(b);

        b1.addActionListener(this);
        b.addActionListener(this);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = (String) c1.getSelectedItem();
        String ff = t6.getText();
        if (ae.getSource() == b3) {
            try {
                ConnectionClass con = new ConnectionClass();
                String q1 = "INSERT INTO `blood_bag`(`id`, `blood_group`) VALUES ((SELECT MAX(id) FROM blood_bank  HAVING MAX(id)) ,'NULL')";
                con.s.executeUpdate(q1);
            } catch (Exception ep) {
                System.out.println("The error is:" + ep);
            }
        }
        if (ae.getSource() == b1) {
            try {
                ConnectionClass con = new ConnectionClass();
//              String str = "UPDATE `blood_bank` SET `name`='"+a+"',`address`='"+bb+"',`contact`='"+c+"',`email`='"+d+"' where id ='"+t12.getText()+"'";
//              con.s.executeUpdate(str);
                String str1 = "UPDATE blood_bag SET blood_group='" + e + "',quantity='" + ff + "' where id ='" + t12.getText() + "' and blood_group='" + c2.getSelectedItem() + "'";
                con.s.executeUpdate(str1);
                JOptionPane.showMessageDialog(null, "Successfully updated");
                f.setVisible(false);
                new Home().setVisible(true);
            } catch (Exception ea) {
                System.out.println("The error is:" + ea);
            }
        }
        if (ae.getSource() == b) {
            f.setVisible(false);
            new Home().setVisible(true);
        }

        if (ae.getSource() == b2) {
            try {
                ConnectionClass con = new ConnectionClass();
                String str = "select blood_bank.name,blood_bank.address,blood_bank.contact,blood_bank.email,blood_bag.blood_group,blood_bag.quantity from blood_bank INNER JOIN blood_bag ON blood_bank.id= blood_bag.id And blood_bag.blood_group='" + c2.getSelectedItem() + "'; ";
                ResultSet rs = con.s.executeQuery(str);
                if (rs.next()) {
                    f.setVisible(true);
                    t1.setText(rs.getString(1));
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                    t4.setText(rs.getString(4));
                    c1.setSelectedItem(rs.getString(5));
                    t6.setText(rs.getString(6));
                }
            } catch (Exception ex) {
                System.out.println("The error is:" + ex);
            }
            f.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new BloodBankUpdate().f.setVisible(true);
    }
}
