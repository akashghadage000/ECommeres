import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ecommerce implements ActionListener
{
   JFrame frame;
   JTabbedPane jtp;
   JButton Electronicsb,Clothesb,Stationaryb,Sportsb;
   JButton E[]=new JButton[4];
   JButton C[]=new JButton[4];
   JButton ST[]=new JButton[4];
   JButton S[]=new JButton[4];

   public Ecommerce()
   {

      frame=new JFrame();
      Electronicsb=new JButton("Electronics");
      Clothesb=new JButton("Clothes");
      Stationaryb=new JButton("Stationary");
      Sportsb=new JButton("Sports");
      Electronicsb.addActionListener(this);
      Clothesb.addActionListener(this);
      Stationaryb.addActionListener(this);
      Sportsb.addActionListener(this);
      Container c = frame.getContentPane();
      JLabel l1 = new JLabel();
      JLabel l2 = new JLabel();
      JLabel l3 = new JLabel();
      JLabel l4 = new JLabel();
      l1.setIcon(new ImageIcon("Elec.jpg"));
      l2.setIcon(new ImageIcon("Clothes.jpg"));
      l3.setIcon(new ImageIcon("Stationary.jpg"));
      l4.setIcon(new ImageIcon("Sports.jpg"));
      frame.add(Electronicsb);
      frame.add(l1);
      frame.add(Clothesb);
      frame.add(l2);
      frame.add(Stationaryb);
      frame.add(l3);
      frame.add(Sportsb);
      frame.add(l4);
      frame.setBackground(Color.CYAN);
      frame.setLayout(new GridLayout(4, 1));
      frame.setSize(400,400);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
   
   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource()==Electronicsb)
      {
        this.new Electronics();
      }
      if(e.getSource()==Clothesb)
      {
        this.new Clothes();
      }
      if(e.getSource()==Stationaryb)
      {
        this.new Stationary();
      }
      if(e.getSource()==Sportsb)
      {
        this.new Sports();
      }
   }
   public class Electronics extends JFrame implements ActionListener
   {
      JFrame frame1 =new JFrame();
      Electronics()
      {
         JLabel l5 = new JLabel();
         JLabel l6 = new JLabel();
         JLabel l7 = new JLabel();
         JLabel l8 = new JLabel();
         l5.setIcon(new ImageIcon("Lap.jpg"));
         l6.setIcon(new ImageIcon("Head.jpg"));
         l7.setIcon(new ImageIcon("Charger.jpg"));
         l8.setIcon(new ImageIcon("Mobile.jpg"));

         E[0]=new JButton("Laptop");
         E[0].addActionListener(this);
         frame1.add(E[0]);
         frame1.add(l5);
         E[1]=new JButton("Headset");
         E[1].addActionListener(this);
         frame1.add(E[1]);
         frame1.add(l6);
         E[2]=new JButton("Charger");
         E[2].addActionListener(this);
         frame1.add(E[2]);
         frame1.add(l7);
         E[3]=new JButton("Mobile");
         E[3].addActionListener(this);
         frame1.add(E[3]);
         frame1.add(l8);
         frame1.getContentPane().setBackground(Color.BLACK);
         frame1.setLayout(new GridLayout(4,1));
         frame1.setSize(400,500);
         frame1.setVisible(true);
         frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==E[0])
         {
            int amount=75000;
            JOptionPane.showMessageDialog(null,"Cost of 1 Laptop :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==E[1])
         {
            int amount=2500;
            JOptionPane.showMessageDialog(null,"Cost of 1 Headset :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==E[2])
         {
            int amount=250;
            JOptionPane.showMessageDialog(null,"Cost of 1 Charger :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==E[3])
         {
            int amount=25000;
            JOptionPane.showMessageDialog(null,"Cost of 1 mobile :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
      }
   }
   public class Clothes extends JFrame implements ActionListener
   {
      JFrame frame2=new JFrame();
      public Clothes()
      {
         JLabel l9 = new JLabel();
         JLabel l10 = new JLabel();
         JLabel l11 = new JLabel();
         JLabel l12 = new JLabel();
         l9.setIcon(new ImageIcon("TShirts.jpg"));
         l10.setIcon(new ImageIcon("Trouser.jpg"));
         l11.setIcon(new ImageIcon("Hoodie.jpg"));
         l12.setIcon(new ImageIcon("Shirts.jpg"));
         C[0]=new JButton("T-Shirt");
         C[0].addActionListener(this);
         frame2.add(C[0]);
         frame2.add(l9);
         C[1]=new JButton("Trousers");
         C[1].addActionListener(this);
         frame2.add(C[1]);
         frame2.add(l10);
         C[2]=new JButton("Hoodie");
         C[2].addActionListener(this);
         frame2.add(C[2]);
         frame2.add(l11);
         C[3]=new JButton("Shirts");
         C[3].addActionListener(this);
         frame2.add(C[3]);
         frame2.add(l12);
         frame2.getContentPane().setBackground(Color.BLACK);
         frame2.setLayout(new GridLayout(4, 1));
         frame2.setSize(400,500);
         frame2.setVisible(true);
         frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==C[0])
         {
            int amount=700;
            JOptionPane.showMessageDialog(null,"Cost of 1 T-Shrit :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==C[1])
         {
            int amount=900;
            JOptionPane.showMessageDialog(null,"Cost of 1 Trouser :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==C[2])
         {
            int amount=2000;
            JOptionPane.showMessageDialog(null,"Cost of 1 Hoodie :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==C[3])
         {
            int amount=1300;
            JOptionPane.showMessageDialog(null,"Cost of 1 Shirt :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
      }
   }
   public class Stationary extends JFrame implements ActionListener
   {
      JFrame frame3=new JFrame();
      public Stationary()
      {
         JLabel l13 = new JLabel();
         JLabel l14 = new JLabel();
         JLabel l15 = new JLabel();
         JLabel l16 = new JLabel();
         l13.setIcon(new ImageIcon("Bags.jpg"));
         l14.setIcon(new ImageIcon("Notebook.jpg"));
         l15.setIcon(new ImageIcon("Pens.jpg"));
         l16.setIcon(new ImageIcon("Pencils.jpg"));
         ST[0]=new JButton("Bags");
         ST[0].addActionListener(this);
         frame3.add(ST[0]);
         frame3.add(l13);
         ST[1]=new JButton("Notebooks");
         ST[1].addActionListener(this);
         frame3.add(ST[1]);
         frame3.add(l14);
         ST[2]=new JButton("Pens");
         ST[2].addActionListener(this);
         frame3.add(ST[2]);
         frame3.add(l15);
         ST[3]=new JButton("Pencil");
         ST[3].addActionListener(this);
         frame3.add(ST[3]);
         frame3.add(l16);
         frame3.getContentPane().setBackground(Color.BLACK);
         frame3.setLayout(new GridLayout(4,1));
         frame3.setSize(400,500);
         frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame3.setVisible(true);
      }
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==ST[0])
         {
            int amount=1000;
            JOptionPane.showMessageDialog(null,"Cost of 1 Bag :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==ST[1])
         {
            int amount=50;
            JOptionPane.showMessageDialog(null,"Cost of 1 Notebook :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==ST[2])
         {
            int amount=30;
            JOptionPane.showMessageDialog(null,"Cost of 1 Pen :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==ST[3])
         {
            int amount=20;
            JOptionPane.showMessageDialog(null,"Cost of 1 Pencil :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         } 
      }
   }
   public class Sports extends JFrame implements ActionListener
   {
      JFrame frame4=new JFrame();
      public Sports()
      {
         JLabel l17 = new JLabel();
         JLabel l18 = new JLabel();
         JLabel l19 = new JLabel();
         JLabel l20 = new JLabel();
         l17.setIcon(new ImageIcon("Bat.jpg"));
         l18.setIcon(new ImageIcon("Football.jpg"));
         l19.setIcon(new ImageIcon("Basketball.jpg"));
         l20.setIcon(new ImageIcon("Stumps.jpg"));
         S[0]=new JButton("Bat");
         S[0].addActionListener(this);
         frame4.add(S[0]);
         frame4.add(l17);
         S[1]=new JButton("Football");
         S[1].addActionListener(this);
         frame4.add(S[1]);
         frame4.add(l18);
         S[2]=new JButton("Basketball");
         S[2].addActionListener(this);
         frame4.add(S[2]);
         frame4.add(l19);
         S[3]=new JButton("Stumps");
         S[3].addActionListener(this);
         frame4.add(S[3]);
         frame4.add(l20);
         frame4.getContentPane().setBackground(Color.BLACK);
         frame4.setLayout(new GridLayout(4, 1));
         frame4.setSize(400,500);
         frame4.setVisible(true);
         frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==S[0])
         {
            int amount=1600;
            JOptionPane.showMessageDialog(null,"Cost of 1 Bat :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==S[1])
         {
            int amount=600;
            JOptionPane.showMessageDialog(null,"Cost of 1 Football :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==S[2])
         {
            int amount=300;
            JOptionPane.showMessageDialog(null,"Cost of 1 Basketball :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==S[3])
         {
            int amount=250;
            JOptionPane.showMessageDialog(null,"Cost of 1 Stump :"+amount);
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
      }
   } 
   public static void main(String a[])
   {
      Ecommerce ecom =new Ecommerce();
   }
}