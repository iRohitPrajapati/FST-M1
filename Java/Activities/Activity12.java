package activities;

interface Addable {
	int add(int num1, int num2);
}

public class Activity12 {
	public static void main(String[] args) {
		// Lambda expression without return keyword.
		Addable ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));
		
		// Lambda expression with return keyword.
		Addable ad2 = (int a, int b) -> {
		    return (a + b);
		};
		System.out.println(ad2.add(23, 32));
	}
}
