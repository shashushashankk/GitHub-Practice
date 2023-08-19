package Shashank;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriter1
{
	public static void main(String[] args) throws IOException 
	{
	File f = new File("d://Shashank//Java.pdf");
	FileWriter fs = new FileWriter(f);
	fs.write("Hii' File is nothing but collection of similler kind of data");
	fs.flush();
	
		System.out.println("Data eritten successfully");

	}
}