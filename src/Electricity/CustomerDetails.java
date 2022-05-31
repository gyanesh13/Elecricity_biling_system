package Electricity;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class CustomerDetails extends JFrame implements ActionListener
{
    JTable t1;
    JButton b1;
    GridBagConstraints gbc;
    GridBagLayout gb1;
    String x[]={"Customer Name","Meter Number","Address","City","State","Email","Phone"};
    String y[][]=new String[40][8];
    int i=0,j=0;
    
    CustomerDetails()
    {
        super("Customer Detail");
        setSize(1200,650);
        setLocation(400,150);
        
        try 
        {
            Conn c1=new Conn();
            String s1="select * from customer";
            ResultSet rs=c1.s.executeQuery(s1);
            
            while(rs.next())
            {
                y[i][j++]=rs.getString("Name");
                y[i][j++]=rs.getString("meter");
                y[i][j++]=rs.getString("Address");
                y[i][j++]=rs.getString("city");
                y[i][j++]=rs.getString("state");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("phone");
                i++;
                j=0;
            }
            t1=new JTable(y,x);
            
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
        b1=new JButton("print");
        add(b1,"South");
        JScrollPane sc=new JScrollPane(t1);
        add(sc);
        b1.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae) 
    {
        try {
            t1.print();
        } catch (Exception e) {
        }
        
    }
    public static void main(String[] args) {
        new CustomerDetails().setVisible(true);
    }
    
}