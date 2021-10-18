package collections;

import java.util.LinkedList;
import java.util.List;

public class SubListFromLinkedList {
	
	
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.add("selenium");
		list.add("Manual Testing");
		list.add("SQL");
		list.add("Automation");
		System.out.println("Total LinkedList = "+list);
		
		 List<String> Sublist = list.subList(1, 4);
		 System.out.println("Sub List from LinkedList = "+Sublist);
		
	}

}
