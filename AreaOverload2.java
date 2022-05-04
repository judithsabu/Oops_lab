/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaoverload2;

/**
 *
 * @author sjcet
 */
class Areashape {

    void  area(double x)
    {
        System.out.println("area of the circle:"+(3.141*x*x));
         }
    void area(int x,int y)
    {
       System.out.println("area of the rectangle:"+(x*y));
    }
    void area(int x,int y,int z)
    {
        double s= x+y+z/2;
        double triarea;
        triarea=Math.sqrt(s*(s-x)*(s-y)*(s-z));         
       System.out.println("area of the triangle is:"+triarea);
    }
}
    public class AreaOverload2
    {
    public static void main(String[] args) {
        Areashape obj = new Areashape();
        obj.area(8);
        obj.area(4,4);
        obj.area(3,4,5);        
    }
   
    }
    

