package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Activity1 {
	static List<String> list;
	
	@BeforeAll
	static void setUp() {
		// Initialize a new ArrayList
		list = new ArrayList<String>();
		
		// Add values to the list
		list.add("alpha");
		list.add("beta");
	}
	
	@Test
	void insertTest() {
		// Size Check
		assertEquals(2, list.size(), "Wrong size");
		// Add Item
		list.add("gamma");
		// Assert after new element
		assertEquals(3, list.size(), "Wrong size");
		
		// Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("charlie", list.get(2), "Wrong element");
	}
	
	@Test
	void replaceTest() {
		// Replace new element
        list.set(1, "charlie");
 
        // Assert size of list
        assertEquals(2, list.size(), "Wrong size");
        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");
	}
}
