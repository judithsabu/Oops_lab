/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Emp {
int id;
String name;
float salary;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no.of employees");
        int n= sc.nextInt();
        Emp emp[] = new Emp[n];
for (int i = 0; i < n; i++) {
emp[i] = new Emp();
System.out.print("Enter details of employee " + (i + 1)
);
System.out.println("Enter employee id :");
emp[i].id = sc.nextInt();
System.out.print("Enter employee name :");
emp[i].name = sc.next();
System.out.print("Enter employee salary :");
emp[i].salary = sc.nextFloat();
}
System.out.println("\n\n********* All Employee Details are:*********\n");
for (int i = 0; i < n; i++) 
System.out.print("\nEmployee Id :" + emp[0].id );
System.out.print("\nEmployee Name :" + emp[0].name );
System.out.print("\nEmployee Salary :" + emp[0].salary );
}
}

        
        
        
    
        
    
    

