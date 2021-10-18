package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElementsInArrayList {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> araylist = new ArrayList<String>(); 
		araylist.add("mouli");
		araylist.add("chandra");
		araylist.add("nadipena");
		System.out.println("Array List before Swaping\n");
		System.out.println(araylist);
		Collections.swap(araylist, 0, 1);
		System.out.println("Array List after Swaping\n");
		System.out.println(araylist);
		
	}

}
