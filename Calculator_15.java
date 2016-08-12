package logical_building;

import java.util.Scanner;

public class Calculator_15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 2 numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("enter the operation to be performed:");
		char op=s.next().charAt(0);
		switch(op)
		{
		case '+':
			System.out.println("additon:"+(a+b));
				break;
		case '-':
			System.out.println("subraction:"+(a-b));
			break;
		case '*':
			System.out.println("multiplication:"+(a*b));
			break;
		case '/':
			System.out.println("division:"+(a/b));
			break;
			default:
				System.out.println("invalid option");
				break;
		
		}
		s.close();
	}

}
