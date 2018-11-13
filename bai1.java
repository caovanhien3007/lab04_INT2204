package lab10;

import java.io.*;
import java.util.*;

public class bai1 {
	public static List<String> getAllFunctions(File path)
	{
		List<String> list = new ArrayList<String>() ;
		String s="";
		String S="";
		String []a = null ;
		boolean b=false;
		 try{
			 Scanner infile=new Scanner(path);
			 while(infile.hasNext())
			 {
	            s =infile.nextLine();
	           if(s.contains("public static")) {
	            	if(b)
	            	{
	            		list.add(S);
	            	}
	            	b=true;
	            	S="";
	            	}
	            
	            S=S+s+"\n";
			 }
			 list.add(S);
	            }catch(Exception e){
	                               }
		return list;
			}
	public static String findFunctionByName(String name)
	{
		File file=new File("C:\\Users\\user56\\Documents\\eclipse\\lab10\\src\\lab10\\Utils.java");
		List<String> arr=getAllFunctions(file);
        String[]s=name.split("");
        for(int i=0;i<s.length;i++)
        {
        	System.out.println(s[i]);
        }
        for(int i=0;i<arr.size();i++)
        {
        	String []S=arr.get(i).split("\n");
        	if(S[0].contains(s[0]))return arr.get(i);
        }
		return "khong co";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\user56\\Documents\\eclipse\\lab10\\src\\lab10\\Utils.java");
		List<String> arr=getAllFunctions(file);
		System.out.println(findFunctionByName("writeContentToFile(String)"));
		
	}
}
