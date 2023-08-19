package Shashank;

import java.io.File;
import java.io.IOException;

public class File1 
{
	public static void main(String[] args) throws IOException
	{
		File f =new File("D://Java.pdf");
		if(f.mkdir())
		{
			System.out.println("folder is created");
		}
		else
		{
			System.out.println("Folder is not created");
		}
		if(f.exists())
		{
			System.out.println("folder is Existed");
		}
		else
		{
			System.out.println("Folder is not Existed");
		}
		if(f.delete())
		{
			System.out.println("folder is deleted");
			
		}
		else
		{
			System.out.println("folder is not deleted");
		}
	}

}
