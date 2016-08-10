import java.util.Scanner;

public class Tower{

	   public void solve(int n, String start, String auxiliary, String end) {
	       if (n == 1) {
	           System.out.println(start + " -> " + end);
	       } else {
	           solve(n - 1, start, end, auxiliary);
	           System.out.println(start + " -> " + end);
	           solve(n - 1, auxiliary, start, end);
	       }
	   }

	   public static void main(String[] args) {
	       Tower t = new Tower();
	       System.out.print("Enter number of discs: ");
	       Scanner s = new Scanner(System.in);
	       int discs = s.nextInt();
	       t.solve(discs, "A", "B", "C");
	   }
	}
