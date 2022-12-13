public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int temp;

		System.out.println("Values of a and b before swapping are: " + a +" " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Values of a and b after swapping are: " + a + " " + b);

	}

}

