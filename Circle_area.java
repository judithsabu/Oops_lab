/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle_area;

/**
 *
 * @author sjcet
 */
public class Circle_area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        scanner s=new scanner(System.in);
        System.out.println("enter the radius of the circle");
        double r= s.nextDouble();
        double area =(3.141*r*r);
        System.out.println("");
    }
    
}
