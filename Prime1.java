import java.util.Scanner;

public class Prime1 {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int count=0;
	int n=s.nextInt();
	int flag=0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0){
			System.out.println("not prime");
			flag=1;}
		else{
			System.out.println("prime");
		}
	}if(flag==1)
	{
		count++;
	}System.out.println(count);
}
}
