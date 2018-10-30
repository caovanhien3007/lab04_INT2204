/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author user56
 */
public class cau2 {
     
     public void  ReadFile(String s) throws FileNotFoundException
     {
        FileReader file= new FileReader(s); 
     }
     public void  File(String s) throws IOException 
    {
         FileWriter file = new FileWriter (s);
        

    }
     public void division(int a, int b) {
   System.out.println(a/b);
        
 }
   
     public void arr(int a, int b) {  
        int c[]= new int [b];
       c[a] = 5 ;
        System.out.println(c[a]);
     }
     public void Null(String a)
     {
         System.out.println(a.charAt(0));
     }
    
    public static void main(String arg[])
    {
        cau2 a= new cau2();     
         try
         {
             a.division(3, 0);
         }
         catch(Exception e)        
         {
             System.out.println("ngoại lệ " + e.toString()
             );
         }
         
         try
         {
             a.arr(5, 5);
         }
         catch(Exception e)
         {
             System.out.println("ngoại lệ " + e.toString());
         }
         
       try
         {
             a.Null(null);
         }
         catch(Exception e)
         {
             System.out.println("ngoại lệ " + e.toString());
         }
      
       try
         {
             a.File("cau2txt");
         }
         catch(Exception e)
         {
             System.out.println("ngoại lệ " + e.toString());
         }
      try
         {
             a.ReadFile("cau2.txt");
         }
         catch(Exception e)
         {
             System.out.println("ngoại lệ " + e.toString());
         }
    }
}
