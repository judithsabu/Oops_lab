/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleintrest;

/**
 *
 * @author sjcet
 */


import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author sjcet
 */
public class Simpleintrest implements ActionListener{
    Frame f=new Frame();
    Label l1=new Label("Principle");
    Label l2=new Label("Number of years");
    Label l3=new Label ("Rate");
    Label l4=new Label("simpleinterest");
    TextField t1= new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    TextField t4=new TextField();
    Button b1= new Button("calculate");
    Simpleintrest()    
    {
        l1.setBounds(50, 100, 100, 20);
        l2.setBounds(50, 140, 100, 20);
        l3.setBounds(50, 180, 100, 20);
        l4.setBounds(50, 220, 100, 20);
        t1.setBounds(200,100 , 100, 20);
        t2.setBounds(200, 140, 100, 20);
        t3.setBounds(200, 180, 100, 20);
        t4.setBounds(200, 220, 100, 20);
        b1.setBounds(50, 250, 50, 20);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(b1);
        b1.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(600, 600);
    }
    public void actionPerformed(ActionEvent e) 
    {
        
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int n3=Integer.parseInt(t3.getText());
        if(e.getSource()==b1)
        {
         
            t4.setText(String.valueOf((n1*n2*n3)/100));
        }
  
    }
    public static void main(String args[])
    {
        new Simpleintrest();
    }
    
}