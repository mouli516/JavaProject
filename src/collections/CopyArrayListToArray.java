package collections;

import java.util.ArrayList;

public class CopyArrayListToArray {

	public static void main(String[] args) {
		
		
		ArrayList<String> arylist = new ArrayList<>();
		arylist.add("mouli");
		arylist.add("nadipena");
		arylist.add("chandra");
		String[] strary = new String[arylist.size()];
		arylist.toArray(strary);
		System.out.println(arylist);
		

	}

}
