package blood.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

 class DonorUpdate implements ActionListener{
     
    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13,id14,id15,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    JButton b,b1,b2;
    JComboBox c1;
    String id_emp;
    
    DonorUpdate(){
        f = new JFrame("Donor Details Update");
         f.setSize(1610,905);
        f.setBackground(Color.white);
        f.setLayout(null);
        
        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource("blood/management/system/d.jpg"));
        Image i4 = ic4.getImage().getScaledInstance(1605,950,Image.SCALE_DEFAULT);
        ImageIcon  icc4 = new ImageIcon(i4);
        JLabel l5 = new JLabel(icc4);
        l5.setSize(1605,895);
        f.add(l5);
        
        JLabel l1 = new JLabel("Enter id number to update the data of donor :");
        l1.setBounds(300,200,700,30);
        l1.setFont(new Font("serif",Font.ITALIC,30));
        l1.setFont(new Font("serif",Font.BOLD,30));
        l5.add(l1);
        
        t7 = new JTextField();
        t7.setBounds(885,205,200,30);
        l5.add(t7);
        
        b2 = new JButton("Update");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.white);
        b2.setBounds(1100,205,150,30);
        b2.setFont(new Font("serif",Font.ITALIC,20));
        l5.add(b2);
        
        b2.addActionListener(this);
        
        id9 = new JLabel("DONOR DETAILS UPDATE");
        id9.setBounds(550,70,800,50);
        id9.setFont(new Font("serif",Font.ITALIC,40));
        id9.setFont(new Font("serif",Font.BOLD,40));
        id9.setForeground(Color.black);
        l5.add(id9);
        
        id1 = new JLabel("Name :");
        id1.setBounds(550,300,100,30);
        id1.setFont(new Font("serif",Font.BOLD,25));
        l5.add(id1);
        
        t1 = new JTextField();
        t1.setBounds(740,300,250,30);
        l5.add(t1);
        
        id2 = new JLabel("Blood Group :");
        id2.setBounds(550,370,200,30);
        id2.setFont(new Font("serif",Font.BOLD,25));
        l5.add(id2);
        
        
        String group[] = {"A+","A-","B+","B-","AB+","AB-","O+","O-"};
        c1 = new JComboBox(group);
        c1.setBackground(Color.white);
        c1.setBounds(740,370,70,30);
        c1.setFont(new Font("serif",Font.BOLD,25));
        l5.add(c1);
        
        id3 = new JLabel("Contact :");
        id3.setBounds(550,440,150,30);
        id3.setFont(new Font("serif",Font.BOLD,25));
        l5.add(id3);
        
        t3 = new JTextField();
        t3.setBounds(740,440,250,30);
        l5.add(t3);
        
        id4 = new JLabel("Email :");
        id4.setBounds(550,510,150,30);
        id4.setFont(new Font("serif",Font.BOLD,25));
        l5.add(id4);
        
        t4 = new JTextField();
        t4.setBounds(740,510,250,30);
        l5.add(t4);
        
        id5 = new JLabel("Address :");
        id5.setBounds(550,580,150,30);
        id5.setFont(new Font("serif",Font.BOLD,25));
        l5.add(id5);
        
        t5 = new JTextField();
        t5.setBounds(740,580,250,30);
        l5.add(t5);
        
        id6 = new JLabel("Medical Report :");
        id6.setBounds(550,650,200,30);
        id6.setFont(new Font("serif",Font.BOLD,25));
        l5.add(id6);
        
        t6 = new JTextField();
        t6.setBounds(740,650,250,30);
        l5.add(t6);
     
        b1 = new JButton("Submit");
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.white);
        b1.setFont(new Font("serif",Font.BOLD,25));
        b1.setBounds(855,750,150,40);
        l5.add(b1);
        
        b = new JButton("Cancel");
        b.setBackground(Color.RED);
        b.setForeground(Color.white);
        b.setFont(new Font("serif",Font.BOLD,25));
        b.setBounds(540,750,150,40);
        l5.add(b);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b.addActionListener(this);
        
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String a = t1.getText();
        String bb = (String)c1.getSelectedItem();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        
        if(ae.getSource() == b1){
          try{
              ConnectionClass con = new ConnectionClass();
              String str = "UPDATE donor SET name ='"+a+"', blood_group ='"+bb+"', contact='"+c+"', email='"+d+"', address = '"+e+"', medical_report = '"+ff+"' where id = '"+t7.getText()+"' ";
              con.s.executeUpdate(str);
              JOptionPane.showMessageDialog(null,"Successfully updated you details");
              f.setVisible(false);
            new Home().setVisible(true);
              
          }catch(Exception ea){
              System.out.println("The error is:"+ea);
          }  
        }
        if(ae.getSource() == b){
            f.setVisible(false);
            new Home().setVisible(true);
        }
     
        if(ae.getSource() == b2){
             try{
              ConnectionClass con = new ConnectionClass();
              String str = "select * from donor where id = '"+t7.getText()+"' ";
              ResultSet rs = con.s.executeQuery(str);
              
                if(rs.next()){
                  f.setVisible(true);
                  
                  t1.setText(rs.getString(2));
                  c1.setSelectedItem(rs.getString(3));
                  t3.setText(rs.getString(4));
                  t4.setText(rs.getString(5));
                  t5.setText(rs.getString(6));
                  t6.setText(rs.getString(7));
                }
              
            }catch(Exception ex){}
            
             f.setVisible(true);
             
        }
    }
    
    public static void main(String[] args) {
        new DonorUpdate().f.setVisible(true);
    }    

}
