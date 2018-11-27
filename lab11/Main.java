package lab11;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner nhap= new Scanner(System.in);
	
	Type<Integer> integer =new Type<>();
	int n=6;
	for(int i=0;i<n;i++)
	{
		integer.getarr(nhap.nextInt());
	}
    integer .ToString();
			
	
	Type<String> string =new Type<>();
	for(int i=0;i<n;i++)
	{
		string.getarr(nhap.nextLine());
	}
    string .ToString();
	}
	
}
