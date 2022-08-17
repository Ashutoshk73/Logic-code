package Programs;

import java.util.Arrays;

public class Differ_Char_number {

	public static void main(String[] args) {
		
	String[] strr = {"a","b","c","1","2","M"};

	
	for(int i=0;i<strr.length;i++)
	{
		
		try{
			int k = Integer.parseInt(String.valueOf(strr[i]));
			System.out.println(k+" is integer");
			
		}
		catch(Exception e)
		{
			System.out.println(strr[i] + " is Charactor");
		}
		
	 
	}
		
		
		

	}

}
