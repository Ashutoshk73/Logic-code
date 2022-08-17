package Programs;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Repeatation_Charactors {

	public static void main(String[] args) {
		//String a = "aaa bb c" ;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("entre charactors");
		String a= scn.nextLine();		
		a=a.replace(" ", "");
		
		char[] b = a.toCharArray();
		Map<Character,Integer> map = new TreeMap<>();
		int count = 0 ;
		for(int i=0;i<b.length;i++)
		{
		    count =0;
			for(int j=0;j<b.length;j++)
			{				
				if(b[i]==b[j])
				{
					count++;	
				}							
			}
			map.put(b[i],count) ;			
		}		
		System.out.println(map); 
	}

}
