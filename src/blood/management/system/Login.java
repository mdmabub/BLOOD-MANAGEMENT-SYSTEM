package blood.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    private JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;
    
    Login(){

        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource("blood/management/system/login.jpg"));
        Image i4 = ic4.getImage().getScaledInstance(1605,890,Image.SCALE_DEFAULT);
        ImageIcon  icc4 = new ImageIcon(i4);
        JLabel l5 = new JLabel(icc4);
        l5.setSize(1605,895);

        
        l1 = new JLabel("Username");
        l1.setBounds(550,310,250,40);
        l1.setFont(new Font("serif",Font.ITALIC,20));
        l1.setFont(new Font("serif",Font.BOLD,40));
        l5.add(l1);
        
        l2 = new JLabel ("Password");
        l2.setBounds(550,380,250,40);
        l2.setFont(new Font("serif",Font.ITALIC,20));
        l2.setFont(new Font("serif",Font.BOLD,40));
        l5.add(l2);
        
        l3 = new JLabel ("IF YOU'RE NOT OUR USER YOU HAVE TO REGISTER FIRST,");
        l3.setBounds(400,550,750,60);
        l3.setFont(new Font("serif",Font.ITALIC,25));
        l3.setFont(new Font("serif",Font.BOLD,25));
        l5.add(l3);
        
        l4 = new JLabel ("TO REGISTRATION TAP REGISTER BUTTON : ");
        l4.setBounds(500,585,600,60);
        l4.setFont(new Font("serif",Font.ITALIC,20));
        l4.setFont(new Font("serif",Font.BOLD,25));
        l5.add(l4);
        
        t1 = new JTextField();
        t1.setBounds(750,310,250,40);
        l5.add(t1);
        
        t2 = new JPasswordField();
        t2.setBounds(750,380,250,40);
        l5.add(t2);
        
        ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("blood/management/system/i.png"));
        Image i3 = ic3.getImage().getScaledInstance(350,250,Image.SCALE_DEFAULT);
        ImageIcon  icc3 = new ImageIcon(i3);
        JLabel l3 = new JLabel(icc3);
        l3.setBounds(1285,25,350,250);
        l5.add(l3);
        
        b1 = new JButton("Login");
        b1.setBounds(570,480,150,40);
        b1.setFont(new Font("serif",Font.BOLD,30));
        b1.setBackground(Color.green);
        b1.setForeground(Color.WHITE);
        l5.add(b1);
        
        b1.addActionListener(this);
        
        b2 = new JButton("Cancel");
        b2.setBounds(830,480,150,40);
        b2.setFont(new Font("serif",Font.BOLD,30));
        b2.setBackground(Color.red);
        b2.setForeground(Color.WHITE);
        l5.add(b2);
        
        b2.addActionListener(this);
        
        b3 = new JButton("Register");
        b3.setBounds(650,650,250,35);
        b3.setFont(new Font("serif",Font.BOLD,30));
        b3.setFont(new Font("serif",Font.BOLD,30));
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.WHITE);
        l5.add(b3);
        
        b3.addActionListener(this);
        
        f = new JFrame ("Login Page");
        f.add(l5);
        f.setSize(1615,905);
        
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        try{
            ConnectionClass c1 =new ConnectionClass();
            String u=t1.getText();
            String v=t2.getText();
            
            String q = "select * from users where username='"+u+"' and password ='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q);
            if (rs.next()){
                new Home().setVisible(true);
                f.setVisible(false);
            }
            else{
               JOptionPane.showMessageDialog(null,"The password that you've entered is incorrect.");
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }
       }
       else if(ae.getSource()==b2){
        System.exit(0);
    }
       else if(ae.getSource()==b3){
           f.setVisible(false);
       new RegiUser().f.setVisible(true);;
       }
}
    public static void main(String[] args) {
         Login l = new Login();
    }
}