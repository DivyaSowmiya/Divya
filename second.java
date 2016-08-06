public class second {
	
		  public static void main(String[]args){

		  int[]a = {1,5,8,9};
		  int[]b = {6,9,8};
		  int[]c = merge(a,b);
		  int d=a.length+b.length;
		  for(int i=0;i<d;i++)
		  System.out.print(c[i]);
		
		}

		private static int[] merge(int[] a, int[] b) {
			 int[]c = new int[a.length+b.length];
			  int i;
			  for(i=0; i<a.length; i++)
			     c[i] = a[i];

			     for(int j=0; j<b.length; j++)
			        c[i++]=b[j];
			        return c;
		
			
		}
		}
