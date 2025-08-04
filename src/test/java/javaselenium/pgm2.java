package javaselenium;

import java.util.Scanner;

public class pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("the given number is positive " + num);
		}
		else {
			System.out.println("the given number is negative " + num);
		}
	}

}
