package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	public static void main(String[] args) {
		// Declare ArrayList 
		List<String> myList = new ArrayList<>();
		
		// Declare String array
		String[] strs = {"I", "Me", "Myself", "My", "Mine"};
		// Populate ArrayList
		for(String str:strs) {
			myList.add(str);
		}
		
		// Print elements
		for(String elem:myList) {
			System.out.println(elem);
		}
		
		// Get Element
		System.out.println("3rd element in the list is: "+get(myList, 2));
		
		// Check Element
		String element = "My";
		if(checkElement(myList, element)) 
			System.out.println("Element '"+element+ "' Found in List");
		else 
			System.out.println("Element '"+element+ "' NOT Found in List");
		
		// Size of List
		System.out.println("Total size of List is "+myList.size());
		
		// Remove Element
		System.out.println("Size of the list after removing '"+ element + "' is " + removeElement(myList, element));
		System.out.println("List After removing Element " + myList);
	}
	
	static String get(List<String> myList, int index) {
		return myList.get(index);
	}
	
	static boolean checkElement(List<String> myList, String element) {
		return myList.contains(element);
	}
	
	static int removeElement(List<String> myList, String element) {
		myList.remove(element);
		return myList.size();
	}
}
