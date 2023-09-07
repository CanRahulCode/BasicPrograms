import java.util.Scanner;

public class ReverseofNumber {

	public static void main(String[] args) {
		int n,reverse=0;
		System.out.print("Enter numbers:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			reverse= reverse * 10;
			reverse= reverse + n%10;
			n=n/10;
		}
		System.out.println("Reverse of the Number is " + reverse);

	}

}

/*
 Question 
 Printing Reverse of given Number using Scanner class
 */