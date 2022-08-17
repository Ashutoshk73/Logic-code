package Programs;

public class Seprate_Charactoe_And_Number {

	public static void main(String[] args) {
		String a = "ahg4s5f7";
		
		for(int i=0;i<a.length();i++){
			
			char b= a.charAt(i);
			
			try{
			
				int p = Integer.parseInt(String.valueOf(b));
			    
				System.out.println("number "+p );
			}
			catch(Exception e)
			{
				System.out.println("Charactors "+b);
			}
			
	
			
			
			
			
			}
			

	}

}
