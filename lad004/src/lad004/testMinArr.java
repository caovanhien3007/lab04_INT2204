package lad004;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMinArr {

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

}
