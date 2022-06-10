package address.book1.com.adrees.book1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Search {
	
	public static void name_search() throws IOException, FileNotFoundException{
		Scanner input= new Scanner(System.in);
		String f1,f2;
		System.out.println("Give Input: ");
		f1 = input.nextLine();
		/*
		 * System.out.println("Give Surname: "); f2 = input.nextLine();
		 */
		File file = new File(System.getProperty("user.dir")+"/src/main/java/contacts.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String currentLine;
		boolean first = false;
		String[] fields = new String[0];
		while((currentLine = reader.readLine()) !=null) {
			if(!first) {
				fields = currentLine.split(",");
				first = true;
			}
			else {//if both fields that the user gave match a contact i show contact's info
				String[] info=currentLine.split(",");
				if(info[0].equalsIgnoreCase(f1) || info[1].equalsIgnoreCase(f1) || info[2].equalsIgnoreCase(f1) || info[3].equalsIgnoreCase(f1) || info[4].equalsIgnoreCase(f1) || info[5].equalsIgnoreCase(f1)) {
					System.out.println("----There is a address information you ----");
					for (int i = 0; i < fields.length; i++ ) {
						System.out.println(fields[i] +": "+ info[i]);					
					}
				}
						
			}
		}
		System.out.println("-------------------");
		reader.close();
		

	}
}
	
	