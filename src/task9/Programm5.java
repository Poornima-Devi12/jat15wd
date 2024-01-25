package task9;
import java.util.Scanner;
public class Programm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to find out the grade system
		//here i've used if-else-if condition to find the grade
		Scanner sc = new Scanner (System.in);
		int marks = sc.nextInt();
		if (marks >= 100) {
			System.out.println("Grade S");
		}else if 
			 (marks <= 99 && marks >= 90){
			System.out.println("Grade A");
		}else if 
			 (marks <= 89 && marks >= 80){
			System.out.println("Grade B");
		}else if 
			 (marks <= 79 && marks >= 70){
			System.out.println("Grade C");
		}else if 
			 (marks <= 69 && marks >= 60){
			System.out.println("Grade D");
		}else if 
			 (marks <= 59 && marks >= 50){
			System.out.println("Grade E");
		}else if
			 (marks < 50) {
			System.out.println("Grade F");
}
		}
		
}