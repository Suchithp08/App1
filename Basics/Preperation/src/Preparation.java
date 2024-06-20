import java.util.Scanner;

public class Preparation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String sum=" ";
        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input the elements of the array
        int [] array = new int[n];
        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum=sum+array[n];
        }
        System.out.println("Sum "+sum);

}
    }