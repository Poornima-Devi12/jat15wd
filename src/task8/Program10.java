package task8;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here i've used count keyword to find how many digit of numbers is given
		int count = 0, num = 12345678;
		// here i've used for loop .
	    for (; num != 0; num /= 10, ++count) {
	    }

	    System.out.println("Number of digits: " + count);
	}

}
