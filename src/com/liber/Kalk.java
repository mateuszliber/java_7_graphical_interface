package com.liber;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Kalk implements ActionListener {
    JTextField text_field;
    JButton add_button, subb_button, multiply_button, division_button, dot_button, element_button, precent_button;
    JButton result_button, clr_button, memory_plus, memory_minus, memory_out;
    JButton num1_button, num2_button, num3_button, num4_button, num5_button, num6_button, num7_button, num8_button, num9_button, num0_button;

    double x;
    double buf;
    double memory = 0;

    String operand;

    public void actionPerformed(ActionEvent e)
    {
        Object target = e.getSource();

        if(target==num1_button)
        {
            text_field.setText(text_field.getText()+((JButton)target).getText());
            text_field.requestFocus();
        }
        else if(target==num2_button)
        {
            text_field.setText(text_field.getText() + ((JButton) target).getText());
            text_field.requestFocus();
        }
        else if(target==num3_button)
        {
            text_field.setText(text_field.getText() + ((JButton) target).getText());
            text_field.requestFocus();
        }
        else if(target==num4_button)
        {
            text_field.setText(text_field.getText() + ((JButton) target).getText());
            text_field.requestFocus();
        }
        else if(target==num5_button)
        {
            text_field.setText(text_field.getText() + ((JButton) target).getText());
            text_field.requestFocus();
        }
        else if(target==num6_button)
        {
            text_field.setText(text_field.getText() + ((JButton) target).getText());
            text_field.requestFocus();
        }
        else if(target==num7_button)
        {
            text_field.setText(text_field.getText() + ((JButton) target).getText());
            text_field.requestFocus();
        }
        else if(target==num8_button)
        {
            text_field.setText(text_field.getText() + ((JButton) target).getText());
            text_field.requestFocus();
        }
        else if(target==num9_button)
        {
            text_field.setText(text_field.getText() + ((JButton) target).getText());
            text_field.requestFocus();
        }
        else if(target==num0_button)
        {
            text_field.setText(text_field.getText() + ((JButton) target).getText());
            text_field.requestFocus();
        }
        else if(target==dot_button)
        {
            if(!text_field.getText().contains(".")) {
                text_field.setText(text_field.getText() + ((JButton) target).getText());
            }
            text_field.requestFocus();
        }
        else if(target==add_button)
        {
            buf = Double.parseDouble(text_field.getText());
            operand = "+";
            text_field.setText("");
            text_field.requestFocus();
        }
        else if(target==subb_button)
        {
            buf = Double.parseDouble(text_field.getText());
            operand = "-";
            text_field.setText("");
            text_field.requestFocus();
        }
        else if(target==multiply_button)
        {
            buf = Double.parseDouble(text_field.getText());
            operand = "*";
            text_field.setText("");
            text_field.requestFocus();
        }
        else if(target==division_button)
        {
            buf = Double.parseDouble(text_field.getText());
            operand = "/";
            text_field.setText("");
            text_field.requestFocus();
        }
        else if(target==element_button)
        {
            x = Double.parseDouble(text_field.getText());
            text_field.setText(Double.toString(Math.sqrt(x)));
            text_field.requestFocus();
        } else if(target==clr_button)
        {
            buf = 0;
            text_field.setText("");
            text_field.requestFocus();
        }
        // MEMORY BUTTONS //
        else if(target==memory_plus)
        {
            buf = Double.parseDouble(text_field.getText());
            memory += buf;
            text_field.setText("");
            text_field.requestFocus();
        }
        else if(target==memory_minus)
        {
            buf = Double.parseDouble(text_field.getText());
            memory -= buf;
            text_field.setText("");
            text_field.requestFocus();
        }
        else if(target==memory_out)
        {
            text_field.setText(Double.toString(memory));
            memory = 0;
            text_field.requestFocus();
        }
        else if(target==result_button || target==text_field)
        {
            if(!text_field.getText().equals("")) {
                x = Double.parseDouble(text_field.getText());
                if (operand == "+") {
                    x = buf + x;
                } else if (operand == "-") {
                    x = buf - x;
                } else if (operand == "*") {
                    x = buf * x;
                } else if (operand == "/") {
                    x = buf / x;
                }
                text_field.setText(Double.toString(x));
                text_field.requestFocus();
            }
        } else if(target==precent_button || target==text_field)
        {
            x = Double.parseDouble(text_field.getText());
            if (operand == "+") {
                x = buf + ((x*buf)/100);
            } else if (operand == "-") {
                x = buf - ((x*buf)/100);
            } else if (operand == "*") {
                x = buf * ((x*buf)/100);
            } else if (operand == "/") {
                x = buf / ((x*buf)/100);
            }
            text_field.setText(Double.toString(x));
            text_field.requestFocus();
        }

    }

    void init()
    {
        JFrame f=new JFrame();
        Container c=f.getContentPane();

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.setLayout(gbl);

        // NUMBERS
        num1_button=new JButton("1");
        num1_button.addActionListener(this);
        num1_button.setFocusable(false);
        gbc.gridx=0;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(num1_button, gbc);
        c.add(num1_button);


        num2_button=new JButton("2");
        num2_button.addActionListener(this);
        num2_button.setFocusable(false);
        gbc.gridx=1;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(num2_button, gbc);
        c.add(num2_button);


        num3_button=new JButton("3");
        num3_button.addActionListener(this);
        num3_button.setFocusable(false);
        gbc.gridx=2;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(num3_button, gbc);
        c.add(num3_button);


        num4_button=new JButton("4");
        num4_button.addActionListener(this);
        num4_button.setFocusable(false);
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(num4_button, gbc);
        c.add(num4_button);


        num5_button=new JButton("5");
        num5_button.addActionListener(this);
        num5_button.setFocusable(false);
        gbc.gridx=1;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(num5_button, gbc);
        c.add(num5_button);


        num6_button=new JButton("6");
        num6_button.addActionListener(this);
        num6_button.setFocusable(false);
        gbc.gridx=2;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(num6_button, gbc);
        c.add(num6_button);


        num7_button=new JButton("7");
        num7_button.addActionListener(this);
        num7_button.setFocusable(false);
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(num7_button, gbc);
        c.add(num7_button);


        num8_button=new JButton("8");
        num8_button.addActionListener(this);
        num8_button.setFocusable(false);
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(num8_button, gbc);
        c.add(num8_button);


        num9_button=new JButton("9");
        num9_button.addActionListener(this);
        num9_button.setFocusable(false);
        gbc.gridx=2;
        gbc.gridy=2;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(num9_button, gbc);
        c.add(num9_button);


        num0_button = new JButton("0");
        num0_button.addActionListener(this);
        num0_button.setFocusable(false);
        num0_button.setToolTipText("Liczba zmiennoprzecinkowa");
        gbc.gridx=3;
        gbc.gridy=4;
        gbc.gridwidth = 1;
        gbc.ipadx=30;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,5);
        gbl.setConstraints(num0_button,gbc);
        c.add(num0_button);

        //OPERATION FIELDS
        text_field=new JTextField(20);
        text_field.setEditable(false);
        text_field.addActionListener(this);
        text_field.setHorizontalAlignment(JTextField.RIGHT);
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=4;
        gbc.ipadx=0;
        gbc.ipady=5;
        gbc.insets=new Insets(5,5,0,5);
        gbl.setConstraints(text_field,gbc);
        c.add(text_field);


        division_button = new JButton("/");
        division_button.addActionListener(this);
        division_button.setFocusable(false);
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(division_button, gbc);
        c.add(division_button);


        multiply_button = new JButton("*");
        multiply_button.addActionListener(this);
        multiply_button.setFocusable(false);
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(multiply_button, gbc);
        c.add(multiply_button);


        element_button = new JButton("√");
        element_button.addActionListener(this);
        element_button.setFocusable(false);
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.ipadx=0;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,0);
        gbl.setConstraints(element_button, gbc);
        c.add(element_button);

        subb_button = new JButton("-");
        subb_button.addActionListener(this);
        subb_button.setFocusable(false);
        subb_button.setToolTipText("dodawanie");
        gbc.gridx=3;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.ipadx=30;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,5);
        gbl.setConstraints(subb_button,gbc);
        c.add(subb_button);


        add_button = new JButton("+");
        add_button.addActionListener(this);
        add_button.setFocusable(false);
        add_button.setToolTipText("dodawanie");
        gbc.gridx=3;
        gbc.gridy=2;
        gbc.gridwidth = 1;
        gbc.ipadx=30;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,5);
        gbl.setConstraints(add_button,gbc);
        c.add(add_button);

        dot_button = new JButton(".");
        dot_button.addActionListener(this);
        dot_button.setFocusable(false);
        dot_button.setToolTipText("Liczba zmiennoprzecinkowa");
        gbc.gridx=3;
        gbc.gridy=3;
        gbc.gridwidth = 1;
        gbc.ipadx=30;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,5);
        gbl.setConstraints(dot_button,gbc);
        c.add(dot_button);

        memory_plus = new JButton("M+");
        memory_plus.addActionListener(this);
        memory_plus.setFocusable(false);
        memory_plus.setToolTipText("Liczba zmiennoprzecinkowa");
        gbc.gridx=0;
        gbc.gridy=5;
        gbc.gridwidth = 1;
        gbc.ipadx=30;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,5);
        gbl.setConstraints(memory_plus,gbc);
        c.add(memory_plus);

        memory_minus = new JButton("M-");
        memory_minus.addActionListener(this);
        memory_minus.setFocusable(false);
        memory_minus.setToolTipText("Liczba zmiennoprzecinkowa");
        gbc.gridx=1;
        gbc.gridy=5;
        gbc.gridwidth = 1;
        gbc.ipadx=30;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,5);
        gbl.setConstraints(memory_minus,gbc);
        c.add(memory_minus);

        memory_out = new JButton("M");
        memory_out.addActionListener(this);
        memory_out.setFocusable(false);
        memory_out.setToolTipText("Liczba zmiennoprzecinkowa");
        gbc.gridx=2;
        gbc.gridy=5;
        gbc.gridwidth = 1;
        gbc.ipadx=30;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,0,5);
        gbl.setConstraints(memory_out,gbc);
        c.add(memory_out);

        precent_button=new JButton("%");
        precent_button.addActionListener(this);
        precent_button.setFocusable(false);
        precent_button.setToolTipText("");
        gbc.gridx=3;
        gbc.gridy=5;
        gbc.gridwidth=2;
        gbc.ipadx=30;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,5,5);
        gbl.setConstraints(precent_button,gbc);
        c.add(precent_button);

        result_button=new JButton("=");
        result_button.addActionListener(this);
        result_button.setFocusable(false);
        result_button.setToolTipText("wykonaj działanie");
        gbc.gridx=0;
        gbc.gridy=6;
        gbc.gridwidth=3;
        gbc.ipadx=30;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,5,5);
        gbl.setConstraints(result_button,gbc);
        c.add(result_button);

        clr_button=new JButton("clr");
        clr_button.addActionListener(this);
        clr_button.setFocusable(false);
        clr_button.setToolTipText("");
        gbc.gridx=3;
        gbc.gridy=6;
        gbc.gridwidth=1;
        gbc.ipadx=30;
        gbc.ipady=0;
        gbc.insets=new Insets(5,5,5,5);
        gbl.setConstraints(clr_button,gbc);
        c.add(clr_button);

        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Kalk");
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Kalk().init();
            }
        });
    }
}