package inclass13;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Scanner;

public class WriteCustomerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path file=Paths.get("C:\\Users\\63264\\Documents\\GitHub\\in-class-chapters-13-AnselYee\\record.txt");
		Scanner input=new Scanner(System.in);
		String quit="quit";
		String s="";
		try {
		OutputStream output=new BufferedOutputStream(Files.newOutputStream(file));
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(output));
		System.out.println("Enter the id number or 'quit' to quit");
		String id=input.next();
		while(!id.equals(quit)) {
		System.out.println("Enter the first name");
		String fname=input.next();
		System.out.println("Enter the last name");
		String lname=input.next();
		System.out.println("Enter the balance owed");
		String balance=input.next();
		s=id+" "+fname+" "+lname+" "+balance+" ";
		writer.write(s,0,s.length());
		System.out.println("Enter the id number or 'quit' to quit");
		id=input.next();
		}
		writer.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error:: "+e.getMessage());
		}
		
				
		
		
		}
}
