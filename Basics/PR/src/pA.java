public class pA {

	public static void main(String[] args) {
		// Initialize the array
		int e[] = {1, 2, 3, 4, 5, 6};
		
		// Loop to print elements in reverse order
		for(int i = e.length - 1; i >= 0; i--) {
			System.out.println("reversed " + e[i]);
		}
	}

}
