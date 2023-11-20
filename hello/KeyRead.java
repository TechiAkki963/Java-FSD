import java.lang.*;
import java.util.*;  //Java Utility Package

public class KeyRead{
	public static void main(String arg[]){
	
	Scanner s = new Scanner (System.in);  // 'System.in' is for Keyboard input
	//Scanner is user to provide input
	
//	int a,b,c;
//	System.out.println("Enter 2 numbers");
	
//	a = s.nextInt();
//	b = s.nextInt();
//	c = a + b;
//	System.out.println("Sum of 2 number :" + c);    


		String name;
		System.out.println("May i know your name");
		name = s.nextLine();
		System.out.println("Welcome " + name);
		
	}

}

//** to find method of a particular class
//** suppose we need to find method for Scanner in cmd - javap java.util.Scanner **

// Class Scanner 
// nextInt() - for Integer
// nextFloat() - for Float
// nextDouble() - for Decimal Values
// next() - to ready word 
// nextLine()** - to read line or multiple words

//nextByte() - for Byte values
//nextShort() - for Short values
//nextLong() - for Long Values
//nextBoolean() - for Boolean Values

//hasNextInt()  - to check the next Value coming from the source is an Integer or Not - it shows as True or False.
//hasNextFloat() - to check the next Value coming from the source is an Integer or Not - it shows as True or False.

