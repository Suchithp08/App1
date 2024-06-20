
public class Fortap {

	
		// TODO Auto-generated method stub

		
		
		    public static int countRepresentations(int N) {
		        int count = 0;
		        for (int a = 1; a <= N; a++) {
		            for (int b = a; b <= N; b++) {
		                for (int c = b; c <= N; c++) {
		                    int d = N - (a + b + c);
		                    if (d >= c) {
		                        count++;
		                    }
		                }
		            }
		        }
		        return count;
		    }

		    public static void main(String[] args) {
		        int N = 123; // Example value of N
		        System.out.println("Number of ways N can be represented: " + countRepresentations(N));
		    }
		

	}


