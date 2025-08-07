
package Lab3Main;

import java.util.Scanner;

public class PersonMain_3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter your name");
		String Name = sc.next();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		Person_3_2 person = new Person_3_2(Name, age);
		
		person.display();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}