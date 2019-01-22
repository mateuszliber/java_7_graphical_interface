package com.liber;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Demo implements ActionListener
{
    JTextField t1;
    JTextField t2;
    JTextField t3;

    JButton b1;
    JButton b2;

    JButton add_button;
    JButton subb_button;

    public void actionPerformed(ActionEvent e)
    {
        Object target = e.getSource();

        if(target==b1 || target==t1 || target==t2)
        {
            int k=Integer.parseInt(t1.getText());
            t3.setText(Integer.toString(k*k));
            t3.requestFocus();
        }
        else if (target==b2)
        {
            t1.setText("");
            t1.requestFocus();
            t2.setText("");
            t2.requestFocus();
            t3.setText("");
            t3.requestFocus();
        }
        else if (target == add_button || target==t1 || target==t2)
        {
            int k = Integer.parseInt(t1.getText());
            int n = Integer.parseInt(t2.getText());
            t3.setText(Integer.toString(k + n));
            t1.requestFocus();
        }
        else if (target==subb_button || target==t1 || target==t2)
        {
            int k = Integer.parseInt(t1.getText());
            int n = Integer.parseInt(t2.getText());
            t3.setText(Integer.toString(k - n));
            t3.requestFocus();        }
    }

    void init()
    {
        t1=new JTextField(6);
        t2=new JTextField(6);
        b1=new JButton("a^2");
        add_button = new JButton("a + b");
        subb_button = new JButton("a - b");
        b2=new JButton("clear");
        t3=new JTextField(6);


        JPanel p = new JPanel();
        p.add(t1);
        p.add(t2);
        p.add(b1);
        p.add(add_button);
        p.add(subb_button);
        p.add(b2);
        p.add(t3);

        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);

        b1.addActionListener(this);
        b2.addActionListener(this);

        add_button.addActionListener(this);
        subb_button.addActionListener(this);

        JFrame f=new JFrame();
        Container c=f.getContentPane();
        c.add(p);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Demo().init();
            }
        });
    }
}