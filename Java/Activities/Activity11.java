package activities;

import java.util.HashMap;

public class Activity11 {
	public static void main(String[] args) {
		HashMap<Integer, String> colors = new HashMap<>();
		colors.put(1, "RED");
		colors.put(2, "YELLOW");
		colors.put(3, "WHITE");
		colors.put(4, "BLACK");
		colors.put(5, "BLUE");
		// Original Map
		System.out.println("Original Map is "+ colors);
		
		// Remove Item
		colors.remove(2);
		System.out.println("Map after removing a color at with Key 2 "+ colors);

		// Check if Color exists
		System.out.println("Is color 'Green' Present in Map - "+ colors.containsValue("Green"));
		
		// Size of the Map
		System.out.println("Size of the updated map is "+ colors.size());
	}
}
