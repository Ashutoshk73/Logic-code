package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
			
		ArrayList List = new ArrayList<>();
		List.add(10);
		List.add(20);
		List.add(30);
		List.add(40);
		List.add(50);
		List.add(60);
		
		
		System.out.println(List.size());
		System.out.println((List));
		Collections.reverse(List);
		System.out.println(List);
	}

}
