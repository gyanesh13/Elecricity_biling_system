package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Project extends JFrame implements ActionListener
{    String meter;
     Project(String meter,String person)
     {
         super("Electricity Billing System");
         this.meter=meter;
         setSize(1920,1030);
         
         ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("Icon/El.jpg"));
         Image i3=ic.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
         ImageIcon icc3=new ImageIcon(i3);
         JLabel l1=new JLabel(icc3);
         add(l1);
         
         JMenuBar mb=new JMenuBar();
         JMenu master=new JMenu("Master");
         JMenuItem m1=new JMenuItem("New Customer");
         JMenuItem m2=new JMenuItem("Customer Details");
         JMenuItem m3=new JMenuItem("Deposit Details");
         JMenuItem m4=new JMenuItem("Calculate Bill");
         master.setForeground(Color.BLUE);
         
         m1.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("Icon/A4.jpg"));
         Image image1=icon1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         m1.setIcon(new ImageIcon(image1));
         
          m2.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("Icon/A5.jpg"));
         Image image2=icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         m2.setIcon(new ImageIcon(image2));
          
         m3.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("Icon/A6.jpg"));
         Image image3=icon3.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         m3.setIcon(new ImageIcon(image3));
         
          m4.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("Icon/A8.png"));
         Image image5=icon5.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         m4.setIcon(new ImageIcon(image5));
         
         m1.addActionListener(this);
         m2.addActionListener(this);
         m3.addActionListener(this);
         m4.addActionListener(this);
         
            JMenu info=new JMenu("Information");
         JMenuItem info1=new JMenuItem("Update Information");
         //JMenuItem u2=new JMenuItem("Calculate Bill");
         JMenuItem info2=new JMenuItem("View Information");
         info.setForeground(Color.RED);
         
         info1.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon41=new ImageIcon(ClassLoader.getSystemResource("Icon/A7.jpg"));
         Image image41=icon41.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         info1.setIcon(new ImageIcon(image41));
        
         
         
          info2.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon42=new ImageIcon(ClassLoader.getSystemResource("Icon/A8.png"));
         Image image42=icon42.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         info2.setIcon(new ImageIcon(image42));
         
         info1.addActionListener(this);
         info2.addActionListener(this);
         
         
         
         
         
         JMenu user=new JMenu("User");
         JMenuItem u1=new JMenuItem("Pay Bill");
         //JMenuItem u2=new JMenuItem("Calculate Bill");
         JMenuItem u3=new JMenuItem("Bill Details");
         user.setForeground(Color.RED);
         
         u1.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("Icon/A7.jpg"));
         Image image4=icon4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         u1.setIcon(new ImageIcon(image4));
        
         
         
          u3.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("Icon/A8.png"));
         Image image6=icon6.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         u3.setIcon(new ImageIcon(image6));
         
         u1.addActionListener(this);
         u3.addActionListener(this);
          
         JMenu report=new JMenu("Report");
         JMenuItem r1=new JMenuItem("Generate Bill");
         report.setForeground(Color.BLUE);
         
         r1.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("Icon/A9.png"));
         Image image7=icon7.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         r1.setIcon(new ImageIcon(image7));
         
         r1.addActionListener(this);
         
         
         JMenu utility=new JMenu("Utility");
         JMenuItem ut1=new JMenuItem("Notepad");
         JMenuItem ut2=new JMenuItem("Calculater");
         JMenuItem ut3=new JMenuItem("Web Browser");
         utility.setForeground(Color.RED);
         
            
         ut1.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("Icon/A10.png"));
         Image image8=icon8.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         ut1.setIcon(new ImageIcon(image8));
            
         ut2.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon9=new ImageIcon(ClassLoader.getSystemResource("Icon/A12.png"));
         Image image9=icon9.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         ut2.setIcon(new ImageIcon(image9));
            
         ut3.setFont(new Font("monospaced",Font.PLAIN,12));
         ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("Icon/A11.jpg"));
         Image image10=icon10.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         ut3.setIcon(new ImageIcon(image10));
         
         
         ut1.addActionListener(this);
         ut2.addActionListener(this);
         ut3.addActionListener(this);
         
         JMenu exit=new JMenu("Logout");
         JMenuItem ex=new JMenuItem("Logout");
         exit.setForeground(Color.BLUE);
         
         ex.addActionListener(this);
         
         master.add(m1);
         master.add(m2);
         master.add(m3);
         master.add(m4);
         
         info.add(info1);
         info.add(info2);
         
         user.add(u1);
         user.add(u3);
         
         report.add(r1);
         
         utility.add(ut1);
           utility.add(ut2);
             utility.add(ut3);
             
         exit.add(ex);
         
         if(person.equals("Admin"))
         {
              mb.add(master);
         }
         else
         {
          mb.add(info);
         mb.add(user);
         mb.add(report);
         }
         mb.add(utility);
         mb.add(exit);
         
         setJMenuBar(mb);
         
         setFont(new Font("senserif",Font.BOLD,16));
         setLayout(new FlowLayout());
         setVisible(false);
         
     }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg=ae.getActionCommand();
        if(msg.equals("Customer Details"))
        {
            new CustomerDetails().setVisible(true);
        }
        else if(msg.equals("New Customer"))
        {
            new NewCustomer().setVisible(true);
        }
         else if(msg.equals("Calculate Bill"))
        {
            new CalculateBill().setVisible(true);
        }
         else if(msg.equals("Pay Bill"))
        {
            new PayBill(meter).setVisible(true);
        }
         
         else if(msg.equals("Notepad"))
        {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) { }
       }
         else if(msg.equals("Calculater"))
        {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) { }
       }
         else if(msg.equals("Logout"))
        {
          this.setVisible(false);
          new Login().setVisible(true);
       }
    
    else if(msg.equals("Generate Bill"))
        {
            new GenerateBill(meter).setVisible(true);
        }
    else if(msg.equals("Deposit Details"))
        {
            new DepositDetails().setVisible(true);
        }
        else if(msg.equals("View Information"))
        {
            new ViewInformation(meter).setVisible(true);
        }
        else if(msg.equals("Update Information"))
        {
            new UpdateInformation(meter).setVisible(true);
        }
         else if(msg.equals("Bill Details"))
        {
            new BillDetails(meter).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Project("","").setVisible(true);
    }
}
