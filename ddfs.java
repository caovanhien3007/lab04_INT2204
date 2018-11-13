package lab10;

import java.util.Random;

public class ddfs {
	 public static void main(String[] arg)
	    {
	    	Random ran = new Random();
	    	int [] arr = new int[1000];
	    	for(int i=0;i<100;i++)
	    	{
	    		arr[i]=ran.nextInt(1000);
	    		System.out.println(arr[i]);
	    	}
	    	System.out.println("---------------------------------");
	    	arr=bai2.bubbleSort(arr, 100);
	    	for(int i=0;i<100;i++)
	    	{
	    		System.out.println(arr[i]);
	    		
	    	}
	    }
}
