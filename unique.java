import java.util.Scanner;

public class unique {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		boolean[] same = new boolean[10];

		for(int i = 0; i < 10; i++) {
		    System.out.println("enter the numbers" );
		    n[i] = s.nextInt();
		    same[i] = true;
		    for(int j = 0; j < 10; j++) {
		        if(n[i] == n[j] && i != j) {
		            same[i] = false;
		        }
		    }
		}
System.out.println("\nThe uniqe numbers you entered were: \n");
		for(int i = 0; i < 10; i++) {
		    if(same[i]) {
		        System.out.println(n[i] + ", ");
		    }
		}s.close();
		
	}

}
