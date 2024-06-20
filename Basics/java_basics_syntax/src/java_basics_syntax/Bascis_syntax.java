package java_basics_syntax;
import java. util.*;
public class Bascis_syntax {
	public static void main(String[] args) {
		//Scanner to scan the number and letters
		int age =99;
		double salary =999999.999;
		String First_name="Suchith";
		char Last_Name='P';
		System.out.println("The name is" +First_name+Last_Name);
		Scanner y=new Scanner(System.in);
		System.out.println("enter the Statement THE STATEMENTS");
		String j=y.nextLine();
		System.out.println("PRINTING THE STATEMENTS     " +j);
		  int n1,n2;
		  System.out.println("Enter the num1");
		  n1=y.nextInt();
		  System.out.println("Enter the num2");
		  n2=y.nextInt();
		  int sum,sub,div,mul;
		  sum =n1+n2;
		  sub =n1-n2;
		  mul =n1*n2;
		  div =n1/n2;
		  System.out.println("ADDED ANS"+sum);
		  System.out.println("SUBTRACTED ANS"+sub);
		  System.out.println("MULTIPLED ANS"+mul);
		  System.out.println("DIVIDED ANS"+div);
		  ////////////////////////////????
		  for(int i=0;i<=10;i++) {
		  System.out.println("numbers"+i);
	}  
		  int k=10;
		  while(k<8){
			  System.out.println(" while num"+k);
			  k++; 
		  }
		  int h=0;
		  do {
			  System.out.println("DO while"+h);
			  h++;
		  }while(h<9);
		  /////////////////////////////////////////////////
		  int qs=10;
		  if(qs<19) {
			  
			  System.out.println(" it' if the number is less than 19 ");
		  }
		  System.out.println("num");
		  int as=y.nextInt();
		  if(as<45){
			System.out.println("IT'S A less then 45");   
		  }
		  if(as==45) {
			  System.out.println("IT'S A equal to 45");  
		  }
		  else {
			  System.out.println("itsgreter then 45 ");
		  }
		  System.out.println("EFFERENCE BETWEEN IF AND ELSE IF "); 
		  int yh=100;
		  if(yh<20) {
			  System.out.println("IT'S LESS THAN 100");
		  }
           if(yh<30) {
        	   System.out.println("IT'S LESS THAN 100");
		  }
          if(yh<23) {
        	  System.out.println("IT'S LESS THAN 100");
                   }
         if(yh<24) {
        	 System.out.println("IT'S LESS THAN 100");
                  }
            if(yh<29) {
            	 System.out.println("IT'S LESS THAN 100");
                  }
             if(yh<230) {
            	 System.out.println("IT'S greater  THAN 100");
                   }
             int yt=23;
   		  if(yt<20) {
   			  System.out.println("IT'S LESS THAN 20");
   		  }
   		  else if(yt<30) {
          	   System.out.println("IT'S LESS THAN 30");
   		  }
   		  else if(yt<40) {
          	  System.out.println("IT'S LESS THAN  40 ");
                     }
   		  else  if(yt<50) {
          	 System.out.println("IT'S LESS THAN 50 ");
                    }
   		  else   if(yt<60) {
              	 System.out.println("IT'S LESS THAN 60");
                    }
   		  else  if(yt<70) {
              	 System.out.println("IT'S less  THAN 70");
                     }
   		 int ot=239;
		  if(ot>20000) {
			  System.out.println("IT'S LESS THAN 20");
		  }
		  else if(ot>30) {
       	   System.out.println(" elseif 30");
		  }
		   if(ot>40) {
       	  System.out.println("  40 ");
                  }
		  if(ot>50) {
       	  System.out.println("  50 ");
                  }
		  
		  else   if(ot>60) {
           	 System.out.println("elseif 60");
                 }
		 else   if(ot>80) {
       	 System.out.println("  elseif80");
             }
		 else   if(ot<900) {
       	 System.out.println("IT' elseif 900");
             }
		   if(ot>90) {
           	 System.out.println(" 90");
                  }
		  else {
			  System.out.println("else");
		  }
   		 System.out.println("DEFFERENCE BETWEEN IF:WILL CONTINUE THE COMPAREING AFTER THEBECOME TRUE and ELSE IF : WILL STOP THE PROCEE ONCE IT BECAME TRUE ");
		  System.out.println("::SWITCH STATMENTS::");
		  try {
			  System.err.println("::SWITCH_STATMENTS:: with ;; TRY_CATCH ;;");
				 System.out.println("::WITHIN 1 TO 9 ;;");
				 int order1=y.nextInt();
			  switch(order1) {
			  case 1:
				  System.out.println("PULLIOGARE");
				  break;
			  case 2:
				  System.out.println("POORI");
				  break;
			  case 3:
				  System.out.println("DOSA");
					  break;
			  case 4:
				  System.out.println("EDLI");
				  break;
			  case 5:
				  System.out.println("CHAPATI");
				  break;
			  case 6:
				  System.out.println("PALLAV");
				  break;
			  case 7:
				  System.out.println("BISIBELEBATH");
				  break;
			  case 8:
				  System.out.println("CHITRANNA");
				  break;
			  case 9:
				  System.out.println("TOMMOTO_BATH");
				  break; 
			  default :
				  System.err.println("plase select within above orders");
			  }   
		  }
		  catch(Exception e) {
			 System.out.println(" PLASE ENTER THE VALID INPUT");
		  }
		  int asa=y.nextInt();
		  if(asa<102){
			System.out.println("IT'S A less then 102");   
		  }
		  if(asa>102) {
			  System.out.println("the number is   GRETER THAN 102");
		  }
		  else { 
			  System.out.println("its EQUAL TO 102  ;'ELSE PART'; ");
		  }
		  System.out.println("ENTER THE MARKS");
		  int marks=y.nextInt();
			System.err.println("DEFFERENCE BETWEEN IF AND ELSE IF "); 
			  if(marks>35) {
				  System.out.println("IT'S A greter  than to 35 only IF"); 
			  }
	          if(marks>55) {
	        	  System.out.println("IT'S A greter to 55 only IF"); 
			  }
	         if(marks>80) {
	        	 System.out.println("IT'S A greter to 80 only IF"); 
	                  }
	        if(marks==100) {
	       	 System.out.println("IT'S Equals  100 only IF");
	                 }
	        else {
	        	System.out.println("::  ENTER THE VALID MARKS  ::");
	        }
	        System.err.println(":*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:*:*");
	        
			  if(marks<=35) {
				  System.out.println("IT'S A greter  than to 35 ELSE IF"); 
			  }
			  else if(marks>55) {
	        	  System.out.println("IT'S A greter to 55 ELSE IF"); 
			  }
			  else if(marks>80) {
	        	 System.out.println("IT'S A greter to 80 ELSE IF"); 
	                  }
			  else if(marks==100) {
	       	 System.out.println("IT'S Equals  100 ELSE IF");
	                 }
	        else {
	        	
	        	System.out.println("::  ENTER THE VALID MARKS  ::");
	        }
		 System.err.println("useing only if will continues the comparing but else if will stop the camparing once the value got true");
		  
			System.out.println("ENTER THE NAME");
			String s=y.nextLine();
			System.out.println(""+s.length());
			System.out.println(""+s.charAt(4));
			System.out.println(""+s.toUpperCase());
			System.out.println(""+s.toLowerCase());
			System.out.println("PRE DEFINED NAME");
			String sp="Suchith P";
			System.out.println("leave the space "+sp.indent(1));
			System.out.println(" PRINTS THE INDEX NUM OF i"+sp.indexOf("i"));
			System.out.println("HERE ::s;; IS SMALL LETTER "+sp.contains("suchi"));
			System.out.println("HERE ::S;; IS BIG LETTER "+sp.contains("Suchi"));
			System.out.println(""+sp.length());
			System.out.println(""+sp.charAt(4));
			System.out.println(""+sp.toUpperCase());
			System.out.println(""+sp.toLowerCase());
			
			System.out.println(":::::MATH CLASS;;;;;;");
			int expnum =8;
			System.out.println("Example number is multipled"+expnum*5);
			System.out.println("converts to positive"+Math.abs(-99));
			System.out.println("Example number is powerd by 3"+Math.pow(expnum, 3));
			System.out.println("SQUARE ROOT OF 64"+Math.sqrt(64));
			System.out.println("campare and prints the minmum number "+Math.min(5, expnum));
			System.out.println("campare and prints the maxmum number "+Math.max(5, expnum));
			System.out.println(" prints the given number roundfiger "+Math.round(6.73));
			System.out.println("prints the randon number form 0 to infinity "+Math.random());
			
			int [] m;
			m= new int[4];
			m[0]=12;
			m[1]=23;
			m[2]=34;
			m[3]=45;
            System.out.println(m);
			int [ ] ary =new int[4];// memory allocation
		    ary[0]=120;
		    ary[1]=435;
		    ary[2]=543;
		    ary[3]=345;
		    ary[0]=102;// it can be change
		    System.out.println(ary[2]);
 			int ar[]= {45,54,54,23,54,54,};// declear +initialization
 			 System.out.println(ar[5]);
 			 System.out.println(ary);
 			for(int arb=0;arb< m.length;arb++) {
 				System.err.println(" ##### PRINTING THE ALL THE ARRAY ELEMENT ##### ");
 				System.out.println(" "+m[arb]);
 			}
 			for(int arbd=0;arbd< ary.length;arbd++) {
 				System.err.println(" ##### PRINTING THE ALL THE ARRAY ELEMENT ##### ");
 				System.out.println(" "+ary[arbd]);
 			}
 			 
 			
	}
}
;