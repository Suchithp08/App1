package Logics;
import java.util.*;
public class Swapingabwithoutextranum {

	public static void main(String[] args) {
		Scanner h =new Scanner(System.in);
		System.out.println("enter the num 1 =");
		int m =h.nextInt();
	System.out.println(" num num1="+m);
	System.out.println("enter the num2  =");
	int k =h.nextInt();
System.out.println(" num 2="+k);
System.out.println("After Swaping numbers");
int l,z;

k=m-k;
m=m-k;
System.out.println( "the val of num1"+m);
System.out.println( "the val of num2"+k);

		int a=10;
		int b=20;
 a=a+b;
 b=a-b;
 a=a-b;
		System.out.println( "the val of a"+a);
		System.out.println( "the val of b"+b);
	}

}
