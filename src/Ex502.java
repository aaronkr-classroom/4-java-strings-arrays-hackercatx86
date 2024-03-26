
public class Ex502 {
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static double sub(double a, double b) {
		return a-b;
	}
	
	public static double mult(double a, double b) {
		return a*b;
	}
	
	public static double div(double a, double b) {
		return a/b;
	}
	
	public static double max(double a, double b) {
		if (a > b) return a;
		else return b;
	}
	
	public static double min(double a, double b) {
		if (a < b) return a;
		else return b;
	}
	
	// Factorial
	public static void factorial(int a) {
		int result = 1;
		for (int i = 1; i <= a; i++) {
			result *= i;
		}
		System.out.println("Factorial of " + a + "!" + "=" + result);
	}
	
	// Circle
	public static void circle(int a) {
		String result = "Pizza circle: " + 2*a*3.141592 + " inches";
		System.out.println(result);
	}
	
	public static void circle(double a) {
		String result = "Pizza circle: " + 2*a*3.141592 + " inches";
		System.out.println(result);
	}
	
	public static void area(int a) {
		String result = "Pizza area: " + a*a*3.141592 + " inches";
		System.out.println(result);
	}
	
	public static void area(double a) {
		String result = "Pizza area: " + a*a*3.141592 + " inches";
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int a = 15;
		int b = 7;
		
		System.out.println("Calculator Program: ");
		System.out.println("Add: " + a + "+" + b + "=" + add(a,b));
		System.out.println("Subtract: " + a + "-" + b + "=" + sub(a,b));
		System.out.println("Multiply: " + a + "*" + b + "=" + mult(a,b));
		System.out.println("Divide: " + a + "/" + b + "=" + div(a,b));
		
		System.out.println("Max(" + a + "," + b + "): " + max(a,b));
		System.out.println("Min(" + a + "," + b +"): " + min(a,b));
		
		factorial(a);
		factorial(b);
		
		// Circle (pizza)
		circle(a);
		area(a);
		
		circle(12); // int
		circle(1.24567); // double
		
		float c = 12.345f;
		circle(c);
	}

}
