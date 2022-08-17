package Programs;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Even_Odd_Count {

	public static void main(String[] args) {
//		Scanner scn = new Scanner (System.in);
//		System.out.println("entre numbers");
//		int a = scn.nextInt();
		
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int count = 0;
		
		Map<String,Integer> map =new TreeMap <>();
		for(int i=0;i<a.length;i++)
		{
		
		if(a[i]%2==0)
		{
			count++ ;
			System.out.println(a[i]+" is even number");
			map.put("even", count);
		}
		else
		{
			System.out.println(a[i]+" is odd");
			map.put("odd", count);
		}
		
		}
		System.out.println(map);

	}

}
