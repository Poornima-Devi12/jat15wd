package task8;

import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,t; // x and y are to swap
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("before swapping numbers:" + x + " " + y);
		//swapping
		
		t=x;
		x=y;
		y=t;
		
		System.out.println("After swapping: "+ x +" "+ y);
		System.out.println();

	}

}
