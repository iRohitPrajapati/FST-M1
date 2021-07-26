package activities;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBook newNovel = new MyBook();
		newNovel.setTitle("Advanced Java");
		System.out.println("The title of book is "+newNovel.getTitle());
	}

}

abstract class Book {
	String title;
	
	// Abstract method declaration
	abstract void setTitle(String str);
	
	// Concrete method
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{ 
	void setTitle(String str){
		title = str;
	}
}