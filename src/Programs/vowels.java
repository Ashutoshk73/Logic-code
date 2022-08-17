package Programs;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class vowels {

	public static void main(String[] args) {
		
		
		char [] c = {'a','b','c','d','s','e','f','d'};
		
		System.out.println(Arrays.toString(c));
		Map<Character ,Integer> map = new TreeMap<>() ;
		int count = 0;
		for(int i=0;i<c.length;i++){
			count = 0;
			if(c[i]=='a' || c[i]=='e' ||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count++ ;
				System.out.println((c[i]));	
				
			}
			map.put(c[i], count);
			
		}
		System.out.println(map);

	}

}
