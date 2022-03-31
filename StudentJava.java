/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.java;

/**
 *
 * @author sjcet
 */
public class StudentJava {
    int m1,m2,m3;

   StudentJava()
    {
        m1=20;
        m2=40;
        m3=60;
    }
        public void sum()
        {
            int sum;
            sum=m1+m2+m3;
            System.out.println("sum="+sum);
            
        }
        public void percentage()
        {
            float percentage;
            percentage=((m1+m2+m3)*100)/300;
            System.out.println("percentage="+percentage);
           
        }
    
 public static void main(String[] args) {
StudentJava S =new StudentJava();
S.sum();
S.percentage();
   }
    
}
