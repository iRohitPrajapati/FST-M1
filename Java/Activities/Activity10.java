package activities;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		// Declare String array
		String[] strs = {"AB", "BC", "CD", "DE", "EF", "FG"};
		// Populate ArrayList
		for(String str:strs) {
			hs.add(str);
		}
		System.out.println("Original Set " + hs);
		
		// Print size
		System.out.println("Original size of the HashSet is: "+ hs.size());
		
		// Remove Element Present
		String element = "EF";
		System.out.println("Is Element '"+ element +"' Present and Removed "+ removeElement(hs, element));
		
		// Remove Element NOT Present
		element = "XY";
		System.out.println("Is Element '"+ element + "' Present and Removed "+ removeElement(hs, element));
		
		// Check if Present
		element = "AB";
		System.out.println("Is element "+ element+ " Present - "+ hs.contains(element));
		
		// Updated Set
		System.out.println("Updated Set "+ hs);
	}
	
	static boolean removeElement(HashSet<String> set, String elem) {
		return set.remove(elem);
	}
}
