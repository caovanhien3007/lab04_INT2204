package lab10;
import java.io.*;
import java.util.*;
public class Utils {
	 public static String readContentFromFile(String path)
	    {
	        String s="" ;
	         File file =new File(path);
	        try{
	            
	            Scanner infile=new Scanner(file);
	            s =infile.nextLine();
	         //   s =infile.nextLine();
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
}
