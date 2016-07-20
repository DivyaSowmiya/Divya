import java.util.Scanner;

public class Positive1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	if(n>0)
	{
		System.out.println("positive number");
	}
	else if(n<0)
	{
		System.out.println("negative number");
	}else if(n==0){
		System.out.println("neither positive nor negative");
	}
	else{
		System.out.println("a integer number as arugument is expected");
	}s.close();

	}

}
