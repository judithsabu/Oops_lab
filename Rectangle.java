/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author sjcet
 */
public class Rectangle {

    int l,b;
    public Rectangle(int a,int c)
    {
        l=a;
        b=c;
        
    }
    public void  area()
    {
        System.out.println("area is="+l*b);
    }
    public void perimeter()
    {
        System.out.println("perimeter is="+(2*l+b));
    }
    public static void main(String[] args) {
      Rectangle s1= new Rectangle(4,4);
         s1.area();
         s1.perimeter();
    }
    
}
