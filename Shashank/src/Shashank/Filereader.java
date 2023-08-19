package Shashank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filereader 
{
	public static void main(String[] args) throws IOException
	{
		
	
	File f =new File("C:\\Users\\Shashank Shetty\\Desktop\\studies\\geotech engg\\Permeability, Effective stress & Flownets.pdf");
	FileReader fr =new FileReader(f);
	BufferedReader bw = new BufferedReader(fr);
	String z =bw.readLine();
	while(z!=null)
	{
	System.out.println(z);
	z=bw.readLine();
	}
	}
}
