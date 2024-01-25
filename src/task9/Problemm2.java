package task9;
import java.io.*;
import java.util.Scanner;

public class Problemm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Guvi", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Guvi"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
	}

}
