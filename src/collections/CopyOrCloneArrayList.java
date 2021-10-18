package collections;

import java.util.ArrayList;

public class CopyOrCloneArrayList {
	
	
	
	public static void main(String args[])
	{
		ArrayList<String> OriginalArrayList = new ArrayList<>();
		OriginalArrayList.add("Nadipena");
		OriginalArrayList.add("Chandra");
		OriginalArrayList.add("Mouli");
		ArrayList<String> CopiedArrayList = new ArrayList<>(OriginalArrayList);
		System.out.println(CopiedArrayList);
		
	}

}
