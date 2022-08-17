package Programs;

import java.util.Scanner ;

public class Amstrong {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("entre the value");
		int n= scn.nextInt();
		int temp=n;
		int rem = 0;
		while(temp>0)
		{
		int rm = temp%10 ;
		rem=rem+rm*rm*rm ;
		temp = temp/10 ;
		
		}
		if(rem==n)
		System.out.println(n+" is Armstrong");
		else{
			System.out.println(n+" is not Armstrong");
		
		
		
		}
	}

}
