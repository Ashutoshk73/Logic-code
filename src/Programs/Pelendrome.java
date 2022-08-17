package Programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pelendrome {

	public static void main(String[] args) {
		
	  Scanner scn = new Scanner (System.in) ;
	  System.out.println("give number");
	  int a = scn.nextInt();
	
	  int Temp = a ;
	  int rev = 0,rem =0;
	  
	  while(Temp>0)
	  {
		 rem = Temp% 10 ;
		 rev = rev * 10+rem ;
		 Temp = Temp/10 ;		
	  }
	  if(rev==a)
	  {
		  System.out.println(a+" it is pelendrome");
	  }
	  else{
		  System.out.println(a+" it is not pelendrome");
	  }
	
	
	
	
	}
	}


