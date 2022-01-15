package practice1;

public class ImplicitExplicit {

	
	public static void main(String[] args) {
		
		char a='A';
		
		System.out.println("implicit typecasting");
		System.out.println("value of a is :"+a);
 
		int b=a;
		System.out.println("value of b is :"+b);
		
		double c=a;
		System.out.println("value of c is :"+c);
		
		long d=a;
		System.out.println("value of d is :"+d);
		
		
		System.out.println("explicit typecasting");
		
		double x=55.5;
		
		int y=(int)x;
		System.out.println("value of x is :"+x);
		System.out.println("value of y is :"+y);
		
	}
}
