import java.util.Scanner;

public class Sq {
public static void main(String[] args)
{Scanner s=new Scanner(System.in);
int i,j;
	int[] a=new int[10];
System.out.println("enter a:");
for(i=0;i<10;i++)
{
	a[i]=s.nextInt();
}
int[] b=new int[10];
System.out.println("enter a:");
for( j=0;j<10;j++)
{
	b[j]=s.nextInt();
}
	if(a[i]==b[i])
	{
		System.out.println("this can form square");
	}else{
		System.out.println("this cannot form square");
	}
}
}
