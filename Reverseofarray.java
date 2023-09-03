
import java.util.Scanner;
public class Reverseofarray {
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the numbers:");
	        int b=sc.nextInt();
	        int[] arr=new int[b];
	        for(int i=0;i<b;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        System.out.print("Reverse of Array:");
	        for(int i=b-1; i>=0; i--)
	        System.out.print(arr[i]+" ");
	    }
	}