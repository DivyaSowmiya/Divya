import java.util.Scanner;

public class array1 {

	    void display(int arr[], int size) 
	    {
	        int i, j;
	        int flag=0;
	        System.out.println("Repeated Elements are :");
	        for (i = 0; i < size-1; i++) 
	        {
	            for (j = i + 1; j < size; j++) 
	            {
	                if (arr[i] == arr[j]) {
	                    System.out.print(arr[i] + " ");
	               flag=1;
	                }else  
	                	continue;  
	            }
	        }if(flag==0){
	        	System.out.println("no repeated numbers are present");
	        }
	    }
	 
	    public static void main(String[] args) 
	    {   Scanner s=new Scanner(System.in);
	        System.out.println("enter the array limit:");
	        int n=s.nextInt();
	        array1 a = new array1();
	        System.out.println("enter the elements:");
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=s.nextInt();
	        }
	        
	        int arr_size = arr.length;
	        a.display(arr, arr_size);
	        s.close();
	    }
	}
