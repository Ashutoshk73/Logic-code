package Programs;

import java.util.Arrays;

public class Print_Alternateve {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0 ;i<a.length;i++)
		{
			if (a[i]%2==1)
			{				
				int b = a[i] ;
				String c = Integer.toString(b) ;
				char[] num = c.toCharArray();
				System.out.print(num);
				
			}
			
		}
		

	}

}
