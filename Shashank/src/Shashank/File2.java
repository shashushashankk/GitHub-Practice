package Shashank;
import java.io.File;
import java.io.IOException;

public class File2 
{
	public static void main(String[] args) throws IOException 
	{
		
		File s = new File("d://Shashank//Java.pdf");
		if(s.createNewFile())
		{
			System.out.println("File is created");
			
		}
		else
		{
			System.out.println("File is not crfeated");
		}
		
		
	}
}
