 package Testyentra;

public class RemovingDuplicate {
	public static void main(String[] args) {
		int a[]= {2,9,3,6,5,9,0,0,2,5,3,54,56,58};
		int c[]=new int[a.length];
		int k=0;
		 for(int j=0; j<a.length; j++)
		{
			 int var=a[j];
			int key=0;
			for (int i = j+1; i <a.length; i++) {
				if (var==a[i]) {
					key++;
					break;
				}
			}
			if(key==0) {
				c[k]=var;
				k++;
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.println(c[i]);
		}
		/*for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					a[j]=999999;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=999999)
			{
				System.out.println(a[i]);
			}
		}*/
	}
}
