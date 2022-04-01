/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrics;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.SAXConnector;
import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Matrics {

    public static void main(String[] args) {
        int m,n,c,d;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the rows and coloum of the matrics");
        m=in.nextInt();
        n= in.nextInt();
        int first[][]=new int[m][n];
        int second[][]=new  int[m][n];
        int sum[][]=new  int [m][n];
        System.out.println("enter the elements of the  first matrics");
        for(c=0;c<m;c++)
            for(d=0;d<n;d++)
                first[c][d]=in.nextInt();
        System.out.println("enter the elements of the second matrics");
        for(c=0;c<m;c++)
            for(d=0;d<n;d++)
                second [c][d]=in.nextInt();
        for(c=0;c<m;c++)
            for(d=0;d<n;d++)
                sum[c][d]=first[c][d]+second[c][d];
        System.out.println("sum of the matrics is");
        for (c = 0; c < m; c++)
    {
      for (d = 0; d < n; d++)
        System.out.print(sum[c][d] + "\t");

      System.out.println();
    }
  }
}
                
                
            
            
        
        
        
       
       
    }
    
}
