package lad004;
import java.util.Scanner;  
public class lab04 {
	 public static int max(int a,int b)
	    {
	        if(b>a)a=b;
	        return a;
	    }   
	    public static int minArr(int arr[],int n)
	    {
	        int min=arr[0];
	        for(int i=1;i<n;i++)
	        {
	            if(arr[i]<min)min=arr[i];
	        }
	        return min;
	    }
	    public static void main(String[] args)
	    {
	        Scanner nhap = new Scanner(System.in);
	        System.out.println("nhap a va b");
	        int a = nhap.nextInt();
	        int b = nhap.nextInt();
	        System.out.println(max(a,b));
	        
	    }
}
