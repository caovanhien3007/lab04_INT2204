package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tarrmin {

	@Test
	void test() {
		lab04 tes=new lab04();
		 int n = 5;
	        int arr[] = new int[n] ;
	        arr[0]=45;
	        arr[1]=3;
	         arr[2]=3;
	         arr[3]=56;
	         arr[4]=23;
	       
	        int expResult = 3;
	        int result = tes.minArr(arr, n);
	        assertEquals(expResult, result);
	}
	@Test
void test2() {

		lab04 tes=new lab04();
		 int n = 5;
	        int arr[] = new int[n] ;
	        arr[0]=4;
	        arr[1]=34;
	         arr[2]=33;
	         arr[3]=56;
	         arr[4]=23;
	       
	        int expResult = 4;
	        int result = tes.minArr(arr, n);
	        assertEquals(expResult, result);
	}
	@Test
	void test3() {

		lab04 tes=new lab04();
		 int n = 5;
	        int arr[] = new int[n] ;
	        arr[0]=45;
	        arr[1]=32;
	         arr[2]=31;
	         arr[3]=56;
	         arr[4]=23;
	       
	        int expResult = 23;
	        int result = tes.minArr(arr, n);
	        assertEquals(expResult, result);
	}
	@Test
	void test4() {

		lab04 tes=new lab04();
		 int n = 5;
	        int arr[] = new int[n] ;
	        arr[0]=45;
	        arr[1]=35;
	         arr[2]=39;
	         arr[3]=56;
	         arr[4]=213;
	       
	        int expResult = 35;
	        int result = tes.minArr(arr, n);
	        assertEquals(expResult, result);
	}
	@Test
	void test5() {

		lab04 tes=new lab04();
		 int n = 5;
	        int arr[] = new int[n] ;
	        arr[0]=45;
	        arr[1]=34;
	         arr[2]=31;
	         arr[3]=56;
	         arr[4]=123;
	       
	        int expResult = 31;
	        int result = tes.minArr(arr, n);
	        assertEquals(expResult, result);
	}
}
