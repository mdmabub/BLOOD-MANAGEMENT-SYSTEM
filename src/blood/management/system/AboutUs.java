
package blood.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class AboutUs implements ActionListener{
     JFrame f;
    JButton b;
    AboutUs(){
        f = new JFrame ("About Us");
        f.setSize(1610,905);
        f.setBackground(Color.white);
        f.setLayout(null);
        
        JLabel l = new JLabel("ABOUT US");
        l.setBounds(700,30,700,40);
        l.setFont(new Font("serif",Font.BOLD,40));
        l.setFont(new Font("serif",Font.ITALIC,40));
        l.setForeground(Color.DARK_GRAY);
        f.add(l);
        
        JLabel l0 = new JLabel("............................");
        l0.setBounds(655,45,700,40);
        l0.setFont(new Font("serif",Font.BOLD,40));
        l0.setFont(new Font("serif",Font.ITALIC,40));
        l0.setForeground(Color.DARK_GRAY);
        f.add(l0);
        
        JLabel l1 = new JLabel("Designed by :-");
        l1.setBounds(100,130,700,40);
        l1.setFont(new Font("serif",Font.BOLD,30));
        l1.setFont(new Font("serif",Font.ITALIC,30));
        l1.setForeground(Color.DARK_GRAY);
        f.add(l1);
        
        JLabel l1A = new JLabel("------------------");
        l1A.setBounds(100,145,700,40);
        l1A.setFont(new Font("serif",Font.BOLD,30));
        l1A.setFont(new Font("serif",Font.ITALIC,30));
        l1A.setForeground(Color.DARK_GRAY);
        f.add(l1A);
        
        JLabel l2 = new JLabel("MD MAHBUBUR RAHMAN.");
        l2.setBounds(100,180,700,40);
        l2.setFont(new Font("serif",Font.BOLD,30));
        l2.setFont(new Font("serif",Font.ITALIC,30));
        l2.setForeground(Color.GRAY);
        f.add(l2);
        
        JLabel l3 = new JLabel("EMAIL ADDRESS :");
        l3.setBounds(100,270,700,40);
        l3.setFont(new Font("serif",Font.BOLD,30));
        l3.setFont(new Font("serif",Font.ITALIC,30));
        l3.setForeground(Color.GRAY);
        f.add(l3);
        
        JLabel l4 = new JLabel("mahbuburrahman4209@gmail.com");
        l4.setBounds(100,310,800,40);
        l4.setFont(new Font("serif",Font.BOLD,30));
        l4.setFont(new Font("serif",Font.ITALIC,30));
        l4.setForeground(Color.GRAY);
        f.add(l4);
        
        JLabel l5 = new JLabel("MOBILE NO. :");
        l5.setBounds(100,370,700,40);
        l5.setFont(new Font("serif",Font.BOLD,30));
        l5.setFont(new Font("serif",Font.ITALIC,30));
        l5.setForeground(Color.GRAY);
        f.add(l5);
        
        JLabel l6 = new JLabel("01785686463");
        l6.setBounds(100,410,700,40);
        l6.setFont(new Font("serif",Font.BOLD,30));
        l6.setFont(new Font("serif",Font.ITALIC,30));
        l6.setForeground(Color.GRAY);
        f.add(l6);
        
        
        
        b = new JButton("GO TO HOME");
        b.setBackground(Color.GREEN);
        b.setForeground(Color.white);
        b.setFont(new Font("serif",Font.BOLD,25));
        b.setBounds(650,800,250,40);
        f.add(b);
        
        b.addActionListener(this);
       
}
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == b){
            f.setVisible(false);
            new Home().setVisible(true);
        }
     }
 public static void main(String[] args) {
        new AboutUs().f.setVisible(true);
       
    }
}