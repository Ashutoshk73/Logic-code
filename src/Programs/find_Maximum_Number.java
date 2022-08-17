package Programs;

import java.util.Arrays;

public class find_Maximum_Number {

	public static void main(String[] args) {
		
		int []a = {1,2,3,14,5,6,7};
	    
		int Maximum = a[0]; 
		for(int i=0;i<a.length;i++)
		{
			
			if(Maximum < a[i])
			{
				Maximum=a[i];
			}
				
		}
		System.out.println(Maximum);
			
			
			
					
			}
								
		}



