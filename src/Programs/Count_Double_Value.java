package Programs;

import java.util.ArrayList;
import java.util.List;

public class Count_Double_Value {

	public static void main(String[] args) {
		char []a = {'a','b','f','d','b','f','m','a'};
		
		List<Character> cList = new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			int count = 1 ; 
			
			if(!cList.contains(a[i]))
			{
				for(int j=(i+1);j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++ ;
						cList.add(a[i]) ;					
					}
				}
				System.out.println(a[i] +" Repeated " + count +" times");
			}
		}

	}

}
