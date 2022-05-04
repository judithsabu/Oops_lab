/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmani;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Stringmani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new  Scanner(System.in);
        System.out.println("enter the string");
        String str1=sc.nextLine();
        System.out.println("length of the string="+str1.length());
        System.out.println("character at postion="+str1.charAt(0));
        System.out.println("lowercase="+str1.toLowerCase());
        System.out.println("Uppercase=" +str1.toUpperCase());
        System.out.println("String ends with e : "+str1.endsWith("e"));
        System.out.println("Replace'sara' with 'Judith' : "+str1.replaceAll("sara","Judith"));
    }
    
}

        
       
                
    
    

