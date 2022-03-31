/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe.java;

/**
 *
 * @author sjcet
 */
public class EmployeJava {

    int empid;
    float salary;
    String emname;
    EmployeJava(int a,float b, string n);
    {
     empid=a;
     emname=n;
     salary=b;
    }
    public void disp()
    {
        System.out.println("empid="+empid);
        System.out.println("emname="+emname);
        System.out.println("salary="+(salary+(salary*20)/100));
        
       
        
   
    }
    public static void main(String[] args) {
      EmployeJava e1=new EmployeJava(34, 400, sara);
      e1.disp();
      EmployeJava e2=new EmployeJava(48, 500, sneha);
      e2.disp();
    }
    
}
