package Increment;

public class Prepostincrement {

	public static void main(String[] args) {
	
		// Pre increment
		
		int x = 5;
		int y = ++x;
		System.out.println(x); //6 
		System.out.println(y); //6
		
		//post increment
		
		int a = 6;
		int b = a++;
		System.out.println(a); //7
		System.out.println(b); //6
		
		
		//Pre decrement
		
		int x1 = 5;
		int y1 = --x1;
		System.out.println(x1); //4
		System.out.println(y1); //4
		
		//Post decrement
		
		int x2 = 5;
		int y2 = x2--;
		System.out.println(x2); //4
		System.out.println(y2); //5
		
		
		
		
		

	}

}
