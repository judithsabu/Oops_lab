/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fillewrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Fillewrte {
    public static void main(String[] args) {
        try {
            FileWriter dataWriter=new FileWriter("DATA.txt");
            dataWriter.write("hai hello");
            dataWriter.write("world");
            dataWriter.close();
        } catch (IOException ex) {
            System.out.println("an error occured");
            ex.printStackTrace();
        }
        
        
try{
File dataFile =new File("DATA.txt");
    Scanner dataRead= new Scanner(dataFile);
    while(dataRead.hasNextLine()){
        System.out.println(dataRead.nextLine());
    }
    dataRead.close();
}catch(FileNotFoundException ex){
    System.out.println("an error ocurred");
    ex.printStackTrace();
}
    }
}

        
    
    
    

