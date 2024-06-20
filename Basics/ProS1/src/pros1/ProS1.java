package pros1;
import java.util.*;
public class ProS1 {

	public static void main(String[] args) {/////////////MAIN
		// TODO Auto-generated method stub
		System.out.println("1.EVEN AND ODD");
		System.out.println("2.LEAP YEAR");
		System.out.println("3.SUM NTH NATURAL NUMBER OR FIRST N OR UPTO 5");
		System.out.println("4.string revers");
		System.err.println("______________________________________________");
		System.err.println("________1________");      
		System.err.println("even and odd");
		Scanner y=new Scanner(System.in); 
		System.out.println("enter the number ");
		 int j=y.nextInt();
		
if(j>0) {//// use this to find out its negative or positive
 if(j%2==0){
	 System.out.println("its even "+j);
 }
 else {
	 System.out.println("its odd "+j); 
 }
}
else {
	System.out.println("ur enterd negavive number");
}
System.err.println("_________2________");
	 System.err.println("enter the year to find out wheter it yeap year or not");
	 
	 int year;
	year =y.nextInt();
	if(year%400==0||year%4==0&&year%100!=0) {
		System.out.println("it leap year"+year);
	}
	else {
		System.out.println("it's not a leap year"+year);
	}
	   
	 System.err.println("_________3________");
	   System.err.println("TO FIND SUM OF FIRST N NATURAL NUMBER 1+2+3+4+5.......N");
 int n=5,i;
 int sum=0;
 for(i=0;i<=n;i++) {
	 sum=sum+i;
 }
 System.out.println("ans"+sum);

 
 
 System.err.println("_________4________");
 System.out.println(" String reverse");
 
 String sz="hello";
     String rv="";
for(int o = sz.length()-1;o>=0;o--) {
rv =rv+sz.charAt(o);
}
System.out.println(" string revesrd    "+rv);
 
System.err.println("________5_________");
System.out.println(" NUMBER reversing reverse");
int in=102;
 int rn = 0;
 
 while(in!=0) {
	 int dig=in%10;
	 rn=rn*10+dig;
	 in =in/10;
 }
 System.out.println("reversed number is "+rn);
 
 System.err.println("________5_________");
 System.out.println(" Palindrome for string copy the reverse code and compaire by creating temp");
 System.out.println(" Palindrome for num copy the reverse code and compaire by creating temp");
 
 
 
 
	}////////////

	
}
