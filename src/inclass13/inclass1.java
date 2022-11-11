package inclass13;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class inclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path txtPath=Paths.get("C:\\Users\\63264\\Documents\\GitHub\\in-class-chapters-13-AnselYee\\song.txt");
		Path MSPath=Paths.get("C:\\Users\\63264\\Documents\\GitHub\\in-class-chapters-13-AnselYee\\songMS.docx");
		try {
			BasicFileAttributes txtAttr=Files.readAttributes(txtPath, BasicFileAttributes.class);
			double txtsize=txtAttr.size();
			System.out.println("The size of txt file is: "+txtsize);
			BasicFileAttributes MsAttr=Files.readAttributes(MSPath, BasicFileAttributes.class);
			double MSsize=MsAttr.size();
			System.out.println("The size of MS file is: "+MSsize);
			double ratio=txtsize/MSsize;
			System.out.println("The ratio of two files is: "+ratio);
		}
		catch(IOException e) {
			System.out.println("Error:: "+e.getMessage());
		}
	}

}
