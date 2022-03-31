/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe1;

/**
 *
 * @author sjcet
 */
public class Employe1 {
    int empid;
    String empname;
    float salary;
    Employe1(int a,String b ,float  c)
    {
        empid=a;
        empname=b;
        salary=c;
    }
    public  void  disp()
    {
        System.out.println("empid="+empid);
        System.out.println("empname="+empname);
        System.out.println("salary="+(salary+(salary*20)/100));
    }
            

    
    public static void main(String[] args) {
        Employe1 e1=new  Employe1(101,"sara",1000);
        e1.disp();
        Employe1 e2=new Employe1(102, "jai", 2000);
        e2.disp();
    }
    
}
