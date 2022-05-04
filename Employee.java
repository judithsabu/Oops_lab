/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author sjcet
 */
public class Employee {
    int id;
    String name;
    public Employee(int i,String n)
    {
        id=i;
        name=n;
        
    }
    void  show()
    {
        System.out.println(id+""+name);
    }

        public static void main(String[] args) {
      Employee emp1=new Employee(1,"govind");
      Employee emp2=new Employee(2,"akash");
      emp1.show();
      emp2.show();
    }
    
}
