import java.util.Scanner;
import java.util.*;

public class D {

	public static void main(String[] args) {
		Scanner j=new Scanner(System.in);
		int sum=0,z=0;
	 System.out.println("enter the number of elements");
	 int g=j.nextInt();
	 int a[]=new int[g];
	 System.out.println("enter the number of elements");
	 for(int i=0;i<=g-1;i++) {
		 a[i]=j.nextInt();
	 }
	 for(int y=0;y<=g-1;y++) {
		 
		  sum =sum+a[y];
	 } 
	 
	 System.out.println(" sum  "  +sum);
	
	int h[]= {1,2,3,};
	
	 for(int i=0;i<h.length-1;i++) {
		 
		  z=z+h[i];
		  
	 } 
	System.out.println("totall"  +z);
	
	
	
}
	}


