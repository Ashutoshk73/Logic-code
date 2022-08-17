package Programs;

import java.util.Arrays;

public class SkippingOne {

	public static void main(String[] args) {
		// printing number in alternative with respective index
		
		
		int [] a = {10,5,6,12,3,6,7,9,23,20};
		
		for(int i=0 ;i<a.length; i=i+2)
		{
			System.out.print((a[i])+",");
			
		}

	}

}
