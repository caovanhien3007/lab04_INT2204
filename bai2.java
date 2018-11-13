package lab10;

import java.util.Random;

public class bai2 {

	public static int[] bubbleSort(int [] arr, int x)
	{
		int a;
		for(int i=0;i<x-1;i++)
		{
			for(int j=0;j<x-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
		return arr;
	}
    public static void main(String[] arg)
    {
    	Random ran = new Random();
    	int [] arr = new int[10];
    	for(int i=0;i<10;i++)
    	{
    		arr[i]=ran.nextInt(9);
    		System.out.println(arr[i]);
    	}
    	arr=bubbleSort(arr, 10);
    	for(int i=0;i<10;i++)
    	{
    		System.out.println(arr[i]);
    		
    	}
    }
	
}
