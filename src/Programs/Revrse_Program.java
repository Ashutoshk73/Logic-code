package Programs;

import java.util.Arrays;

public class Revrse_Program {

	public static void main(String[] args) {
		
		int []a = {6,40,20,30,10};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<(i+1);j++)
			{
				int temp = a[i] ;
				a[i]=a[j];
				a[j]=temp ;				
				
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
