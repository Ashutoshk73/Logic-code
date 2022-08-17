package Programs;

import java.util.Arrays;

public class Class_A {

	public static void main(String[] args) {
		int a []={0,1,2,3,4,5,6,7,8,9,10,11,12} ;
		{
			int count = 0;
			System.out.println(a[0]);
			for(int i=1 ; i<a.length;i++)
			{
				if(count<=2 && a[i]%2==1 )
				{
					count ++ ;					
				}
				else if(count == 3)
				{
					System.out.print((a[i]));
					System.out.println("\n");
					count=0;
				}
				
			}
		}

	}

}
