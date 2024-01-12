package blood.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class RegiUser implements ActionListener{
    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JButton b1,b2,b3;
    
    Random ran = new Random();
    long last4 = (ran.nextLong() % 9000L) +1000L ;
    long last = Math.abs(last4);
    
    
    public RegiUser(){
        
        f = new JFrame ("Add USERS");
        f.setBackground(Color.white);
        f.setLayout(null);
        
        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource("blood/management/system/user.jpg"));
        Image i4 = ic4.getImage().getScaledInstance(1605,905,Image.SCALE_DEFAULT);
        ImageIcon  icc4 = new ImageIcon(i4);
        JLabel id10  = new JLabel(icc4);
        id10.setSize(1610,905);
        id10.setLayout(null);
        
        
        id9 = new JLabel(" USER DETAILS REGISTRATION FORM ");
        id9.setBounds(235,30,800,50);
        id9.setFont(new Font("serif",Font.ITALIC,40));
        id9.setForeground(Color.black);
        id10.add(id9);
        f.add(id10);
        
        id1 = new JLabel("Name :");
        id1.setBounds(300,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id1);
        
        t1 = new JTextField();
        t1.setBounds(530,150,300,30);
        id10.add(t1);
        
        id2 = new JLabel("USERNAME :");
        id2.setBounds(300,200,200,30);
        id2.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id2);
        
        t2 = new JTextField();
        t2.setBounds(530,200,300,30);
        id10.add(t2);
        
        id3 = new JLabel("DOB dd/mm/yy :");
        id3.setBounds(300,250,200,30);
        id3.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id3);
        
        t3 = new JTextField();
        t3.setBounds(530,250,300,30);
        id10.add(t3);
        
        id4 = new JLabel("Address :");
        id4.setBounds(300,300,200,30);
        id4.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id4);
        
        t4 = new JTextField();
        t4.setBounds(530,300,300,30);
        id10.add(t4);
        
        id5 = new JLabel("Contact :");
        id5.setBounds(300,350,200,30);
        id5.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id5);
        
        t5 = new JTextField();
        t5.setBounds(530,350,300,30);
        id10.add(t5);
        
        id6 = new JLabel("Email :");
        id6.setBounds(300,400,200,30);
        id6.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id6);
        
        t6 = new JTextField();
        t6.setBounds(530,400,300,30);
        id10.add(t6);
        
        id7 = new JLabel("Password :");
        id7.setBounds(300,450,200,30);
        id7.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id7);
        
        t7 = new JTextField();
        t7.setBounds(530,450,300,30);
        id10.add(t7);
        
        id8 = new JLabel("Confirm Password :");
        id8.setBounds(300,500,250,30);
        id8.setFont(new Font("serif",Font.BOLD,25));
        id10.add(id8);
        
        t8 = new JTextField();
        t8.setBounds(530,500,300,30);
        id10.add(t8);
        
        id11 = new JLabel("If you are a user go to :");
        id11.setBounds(315,700,300,35);
        id11.setFont(new Font("serif",Font.BOLD,30));
        id10.add(id11);
        
        b1 = new JButton("Submit");
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.white);
        b1.setBounds(580,600,150,40);
        b1.setFont(new Font("serif",Font.BOLD,25));
        id10.add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.white);
        b2.setBounds(370,600,150,40);
        b2.setFont(new Font("serif",Font.BOLD,25));
        id10.add(b2);
        
        b3 = new JButton("Login Page");
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.white);
        b3.setBounds(620,700,200,40);
        b3.setFont(new Font("serif",Font.BOLD,25));
        id10.add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(1610,905);
    }
    
    public void actionPerformed(ActionEvent ae){
        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        if(ae.getSource() == b1){
          try{
              ConnectionClass cc = new ConnectionClass();
              String q = "insert into users (`name`, `username`, `dob`, `address`, `contact`, `email`, `password`, `confirm_password`) values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"');";
              cc.s.executeUpdate(q);
              JOptionPane.showMessageDialog(null,"User Details Inserted Successfully");
              
              new Login().setVisible(true);
              f.setVisible(false);
          }catch(Exception ee){
              System.out.println("The error is:"+ee);
          }  
        }
        else if(ae.getSource() == b2){
            
            new Login().setVisible(true);
            f.setVisible(false);
        }
        else if(ae.getSource() == b3){
            new Login().setVisible(true);
            f.setVisible(false);
        }
     }
    public static void main(String[] args) {
        new RegiUser().f.setVisible(true);
       
    } 

}


////lab2 = new JLabel("Branch");
////        lab2.setBounds(50,450,150,30);
////        lab2.setFont(new Font("serif",Font.BOLD,20));
////        id15.add(lab2);
////        
////        String branch[] = {"CSE","IT","EEE","ECE","Civil"};
////        c2 = new JComboBox(branch);
////        c2.setBackground(Color.white);
////        c2.setBounds(200,450,150,30);
////        id15.add(c2);
//        String l = (String)c1.getSelectedItem();
//        String m = (String)c2.getSelectedItem();
//        ,'"+l+"','"+m+"'