package collections;

import java.util.LinkedList;

public class CopyLinkedListToArray {

	public static void main(String[] args) {
		
		
		LinkedList<String> lld = new LinkedList<String>();
		lld.add("nadipena");
		lld.add("nadipena");
		lld.add("nadipena");
		System.out.println("LinkedList Data"+lld);
		String[] arry = new String[lld.size()];
		lld.toArray(arry);
		System.out.println(arry[0]);
		
	}

}
