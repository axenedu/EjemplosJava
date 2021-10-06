package clases;

public class WrappersExample {

	public static void main(String[] args) {
		// Comparando Wrappers
		
		Integer deprec = new Integer(3);
		Integer a = Integer.valueOf(3);
		Integer b = 5;
		
		System.out.println("A Mayor que B " + (a > b));
		System.out.println("A Menor que B " + (a < b));
		System.out.println("A Igual que B " + (a == b));
//		A Mayor que B false
//		A Menor que B true
//		A Igual que B false
		
		a=5;
		System.out.println("A Igual que B " + (a == b));
//		A Igual que B true
		
		a=5000;
		b=5000;
		System.out.println("A Igual que B " + (a == b));
		//A Igual que B false
		// :(
		
		System.out.println("A Igual que B " + (a.equals(b)));
		//A Igual que B true
		

	}

}
