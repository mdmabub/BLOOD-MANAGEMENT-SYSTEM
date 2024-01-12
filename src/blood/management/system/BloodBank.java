package blood.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import java.util.Random;

class BloodBank implements ActionListener{
    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JButton b1,b2;
    JComboBox c1;
    Random ran = new Random();
    long last4 = (ran.nextLong() % 9000L) +1000L ;
    long last = Math.abs(last4);
    String y[][] = new String[1000][13];
    int i = 0, j = 0;
    
    public BloodBank(){
        f = new JFrame ("Add Blood Bank");
        f.setBackground(Color.white);
        f.setLayout(null);
        
        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource("blood/management/system/blood bank.png"));
        Image i4 = ic4.getImage().getScaledInstance(1605,890,Image.SCALE_DEFAULT);
        ImageIcon  icc4 = new ImageIcon(i4);
        id10 = new JLabel(icc4);
        id10.setSize(1605,895);
        id10.setLayout(null);
       
        
        id9 = new JLabel("REGISTER NEW BLOOD BANK DETAILS");
        id9.setBounds(430,100,800,50);
        id9.setFont(new Font("serif",Font.ITALIC,40));
        id9.setForeground(Color.black);
        id10.add(id9);
        f.add(id10);
        
        id1 = new JLabel("Name :");
        id1.setBounds(550,200,100,30);
        id1.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id1);
        
        t1 = new JTextField();
        t1.setBounds(700,200,250,30);
        id10.add(t1);
        
        id2 = new JLabel("Address :");
        id2.setBounds(550,250,150,30);
        id2.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id2);
       
        t2 = new JTextField();
        t2.setBounds(700,250,250,30);
        id10.add(t2);
        
        id3 = new JLabel("Contact :");
        id3.setBounds(550,300,150,30);
        id3.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id3);
        
        t3 = new JTextField();
        t3.setBounds(700,300,250,30);
        id10.add(t3);
        
        id4 = new JLabel("Email :");
        id4.setBounds(550,350,150,30);
        id4.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id4);
        
        t4 = new JTextField();
        t4.setBounds(700,350,250,30);
        id10.add(t4);
        
        b1 = new JButton("Submit");
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.white);
        b1.setFont(new Font("serif",Font.BOLD,25));
        b1.setBounds(780,450,150,40);
        id10.add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.white);
        b2.setFont(new Font("serif",Font.BOLD,25));
        b2.setBounds(550,450,150,40);
        id10.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(1610,905);
        f.setLocation(0,0);
    }
    
    public void actionPerformed(ActionEvent ae){
        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        
        if(ae.getSource() == b1){
          try{
            ConnectionClass cc = new ConnectionClass();
              String q = "INSERT INTO `blood_bank`(`name`, `address`, `contact`, `email`) VALUES ('"+a+"','"+b+"','"+c+"','"+d+"')";
              String q1 = "INSERT INTO `blood_bag`(`id`, `blood_group`) VALUES ((SELECT MAX(id) FROM blood_bank  HAVING MAX(id)) ,'NULL')";
              cc.s.executeUpdate(q);
              cc.s.executeUpdate(q1);
              JOptionPane.showMessageDialog(null,"Blood Bank Details Inserted Successfully");
              f.setVisible(false);
              new Home().setVisible(true);
          }catch(Exception ee){
              System.out.println("The error is:"+ee);
          }  
        }else if(ae.getSource() == b2){
            f.setVisible(false);
            new Home().setVisible(true);
        }
     }
    public static void main(String[] args) {
        new BloodBank().f.setVisible(true);
       
    } 
}
