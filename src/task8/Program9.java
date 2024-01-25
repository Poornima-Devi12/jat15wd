package task8;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To find senior citizen or not.
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age:");
		int age = sc.nextInt();
		// if condition is used to find whether senior citizen or not
		// if age is greater than or equal to 60 , then its a senior citizen
		// if age is less than 60 , then its not a senior citizen
		if ( age >= 60) {
			System.out.println("senior citizen");
		}else {
			System.out.println("Not a senior citizen");
		}
	}

}
