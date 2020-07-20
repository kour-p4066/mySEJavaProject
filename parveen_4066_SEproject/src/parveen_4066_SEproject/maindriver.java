package parveen_4066_SEproject;

import java.util.Scanner;

public class maindriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int id1;
		String name1,phone_number,email_id;
		System.out.println("Enter user ID: ");
		 id1 = scan.nextInt();
		System.out.println("Enter user name: ");
		 name1 = scan.nextLine();
		System.out.println("Enter user's phone number: ");
		phone_number = scan.nextLine();
		System.out.println("Enter user's email id: ");
		email_id = scan.nextLine();
		User u = new User(id1, name1, phone_number, email_id);
		System.out.println("The users ID is: " +u.getUserId());
		System.out.println("The users name is: " +u.getUserName());
		System.out.println("The users phone number is: " +u.getPhoneNum());
		System.out.println("The users email id is: "+u.getUser_emailId());
		
		

		
	}

}
