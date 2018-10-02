package lad004;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testmax {

	@Test
	void test() {
		lab04 tes = new lab04();
		Scanner nhap=new Scanner(System.in);
		System.out.println("bat dau voi test 1");
		for(int i=2;i<7;i++)
		{
			int a,b,result,expResult;
			System.out.println("nhap so a");
			a = nhap.nextInt();
			System.out.println("nhap so b");
			b = nhap.nextInt();
			System.out.println("nhap ket qua du doan");
			expResult =nhap.nextInt();
			result = tes.max(a, b);
			assertEquals(expResult,result);
			System.out.println("ket qua dung ");
			System.out.println("test "+ i );
		}
			
	
	
		
	}

}
