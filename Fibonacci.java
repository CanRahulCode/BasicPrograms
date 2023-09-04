import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of terms:");
		int n=sc.nextInt();
		int i=0,j=1,m;
		System.out.println("Fibonacci series is ");
		for(int c=0;c<n;c++)
		{
		if(c<=1)
		m=c;
		else
		{
		m=i+j;
		i=j;
		j=m;
		}
		System.out.println(m);
		}
        sc.close();
	}
}
/*
 Finding the fibonacci digits using scanner class. 
 */
