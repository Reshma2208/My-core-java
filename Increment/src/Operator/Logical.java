package Operator;

public class Logical {

	public static void main(String[]args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean result1 = (a<b) && (a<c);
		boolean result2 = (a>b) || (a<c);
		boolean result3 = (a<b) !=  (b>c);
		
		
		
		System.out.println(result1); //true
		System.out.println(result2); //true
		System.out.println(result3); //true
		
		
	}
	
	
	
}
