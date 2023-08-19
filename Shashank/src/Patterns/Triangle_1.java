package Patterns;

public class Triangle_1 {

	public static void main(String[] args) 
	{
		int space= 4;
		int star =1;
		for(int l =1; l<=5;l++)
		{

			for(int i=1; i<=space; i++)
			{
				System.out.print(" ");
			}
			for (int k =1; k<=star; k++)
			{
			System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}

	}

}
