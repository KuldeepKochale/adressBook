package address.book1.com.adrees.book1;

import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		int exit = 0;
		int answer;
		//we will loop until user wants to exit the application
		do {
			System.out.println("--------Welcome to Address Book---------");
			System.out.println("Enter '1' to Search Address");
			System.out.println("Enter '2' to Print Address");
			System.out.println("Enter '0' to Exit");
			System.out.println("Do you want to print Address, search for Address?");
			System.out.println("Answer with '1', '2','0' to exit application.");	
			try {//we handle the input of the user
				answer = input.nextInt();
			} catch (NumberFormatException e) {
			    //e.printStackTrace();
				answer = -1;
			}
			if(answer == 1)//according to user's input we go to each class
				Search.name_search();
			else if(answer == 2)
				Print.show_contacts();	
			
		}while(answer != exit);
		System.out.println("Application terminating...");
	}
}
