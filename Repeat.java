import java.util.Scanner;

public class Repeat {

	
	public static void main(String[] args) {
	 int[] n=new int[10];
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the numbers:");
	 for(int i=0;i<10;i++)
	 {
		 n[i]=s.nextInt();
	 }for(int i=0;i<10;i++)
	 {
		 for(int j=i+1;j<10;j++)
		 {
			 if(n[i]==n[j])
			 {
				 System.out.println(n[j]);
			 }
		 }
	 }s.close();

	}

}
