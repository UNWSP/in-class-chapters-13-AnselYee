package inclass13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DisplaySavedCustomerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path file=Paths.get("C:\\Users\\63264\\Documents\\GitHub\\in-class-chapters-13-AnselYee\\record.txt");
		String []array=new String[4];
		String s="";
		String delimiter=",";
		try
		{
			InputStream input=new BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader=new BufferedReader(new InputStreamReader(input));
			s=reader.readLine();
			while(s!=null)
			{
				array=s.split(delimiter);
				for(int x=0;x<array.length;++x)
				{
					System.out.print(array[x]+" ");
					System.out.println();
					s=reader.readLine();
					
				}
				reader.close();
			}
		}
		catch(Exception e) {
			System.out.println("Error:: "+ e.getMessage());
		}
	}

}
