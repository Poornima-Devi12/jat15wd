package task9;
import java.util.*;
public class Programm3 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int n = 4;

		int counter = 1;
		//Loop to iterate over each row
		for(int i=1;i<=n;i++){
			//Loop to iterate over each column
			for(int j=1;j<=i;j++){
				System.out.print(counter+ " ");
				counter++; 
			}
			System.out.println();

}
}
}