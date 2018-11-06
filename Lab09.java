/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author user56
 */
public class Lab09 {

    /**
     * @param args the command line arguments
     */
     
    public static String readContentFromFile(String path)
    {
        String s="" ;
         File file =new File(path);
        try{
            
            Scanner infile=new Scanner(file);
            s =infile.nextLine();
            s =infile.nextLine();
            }catch(Exception e){

                               }
        
        return s;
    }
    public static void writeContentToFile(String path) throws IOException
    {
         Scanner nhap= new Scanner(System.in);
         FileWriter file = new FileWriter (path,true);
         BufferedWriter bw = new BufferedWriter(file);
                bw.newLine();
                  bw.write(nhap.nextLine());
           bw.close();

    }
    public static File findFileByName(String folderPath, String fileName)
    {
        File foder =new File(folderPath);
        if(foder.getName().equals(fileName))
        {
            return foder;
        }
        File[] chil = foder.listFiles();
        if(chil!=null)
        for(int i=0;i<chil.length;i++)
        {
            if(findFileByName(chil[i].toString(),  fileName)!=null)
            {
              return findFileByName(chil[i].toString(),  fileName);
              
            }
        }
       return null;
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        writeContentToFile("lad.txt");
        System.out.println(readContentFromFile("lad.txt"));
      
      File a = findFileByName( "C:\\Users\\user56\\Documents\\NetBeansProjects","lab09.txt.txt");
          if(a==null)System.out.println("file không tồn tại");
          else System.out.println(a.toString());
                  System.out.println(readContentFromFile(a.toString()));

    }

        
}
