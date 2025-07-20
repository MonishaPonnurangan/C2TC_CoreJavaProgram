package day1.basics;

import java.util.Scanner;

public class AdditionUsingScanner {

	public static void main(String[] args) {
       int a,b,c;
       Scanner s=new Scanner(System.in);
       a=s.nextInt();
       b=s.nextInt();
	   c=a+b;
	   System.out.println("addition of a= " + a+ "and b= " +b+ " is " +c);

	}

}
