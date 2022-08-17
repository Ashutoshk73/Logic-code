package Programs;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ClassA {

	public static void main(String[] args) {
		

		  String s= "hgfedcbaaa" ;
		  s.replace(" ", "");
		char c [] = s.toCharArray() ;
		TreeSet<Character> set = new TreeSet<>() ;
		Map<Character,Integer> map = new TreeMap<>();
		int count = 1 ;
		for(int i=0 ;i<s.length();i++)
		{  count = 0;
			try{
		    set.add(c[i]) ;
		    count ++ ;		    
			}catch(Exception e)
			{}
			 map.put(c[i], count) ;
			
		}
	
		System.out.print(set);
		System.out.println("\n");
		System.out.println(map);
		}}
		
		

		
		
		

