package Electricity;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
      
public class Login extends JFrame implements  ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1,b2,b3;
    JPanel p1,p2,p3,p4;
    Choice c1;
    Login()
    {
        super("Login Page");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        l1=new JLabel("Username");
        l1.setBounds(300,20, 100, 20);
        add(l1);
        l2=new JLabel("Password");
        l2.setBounds(300,60, 100, 20);
        add(l2);
        
        tf1=new JTextField(15);
        tf1.setBounds(400,20,150, 20);
        add(tf1);
        pf1=new JPasswordField(15);
        pf1.setBounds(400,60, 150, 20);
        add(pf1);
        
        l4=new JLabel("Logging As In");
        l4.setBounds(300,100,100, 20);
        add(l4);
        
        ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("icon/A1.png"));
        Image i1=ic1.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        b1=new JButton("Login",new ImageIcon(i1));
        b1.setBounds(330, 160, 100,20);
        add(b1);
        
       ImageIcon ic2=new ImageIcon(ClassLoader.getSystemResource("icon/A2.png"));
        Image i2=ic2.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        b2=new JButton("Cancel",new ImageIcon(i2));
          b2.setBounds(450, 160, 100,20);
        add(b2);
        
        ImageIcon ic3=new ImageIcon(ClassLoader.getSystemResource("Icon/signup.png"));
        Image i3=ic3.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        b3=new JButton("SignUp",new ImageIcon(i3));
          b3.setBounds(390, 210, 100,20);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        ImageIcon ic4=new ImageIcon(ClassLoader.getSystemResource("Icon/second.jpg"));
        Image i4=ic4.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon icc4=new ImageIcon(i4);
        l3=new JLabel(icc4);
        l3.setBounds(0, 0, 250,250);
        add(l3);
        
        c1=new Choice();
        c1.add("Admin");
        c1.add("Customer");
        c1.setBounds(400, 100, 150,20);
        add(c1);
        
        setLayout(new BorderLayout());
        
      
        
        setSize(640,300);
        setLocation(600, 300);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
           if(ae.getSource()==b1)
           {
        try 
        {
            Conn c=new Conn();
            String a=tf1.getText();
            String b=pf1.getText();
            String user=c1.getSelectedItem();
            String q="select * from login where username='"+a+"' and password='"+b+"' and user='"+user+"'";
            ResultSet rs=c.s.executeQuery(q);
            if(rs.next())
            { 
                String meter=rs.getString("meter_number");
                new Project(meter,user).setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Input");
                tf1.setText("");
                pf1.setText("");
           } 
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Error" +ae);
        }
      }
           else if(ae.getSource()==b2)
           { 
               this.setVisible(false);
           }
           else if(ae.getSource()==b3)
           {
               this.setVisible(false);
               new SignUp().setVisible(true);
           }
    }
    
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
