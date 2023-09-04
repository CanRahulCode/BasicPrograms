
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int num,rev=0,rem,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		num=sc.nextInt();
		temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
		

	}

}

/*
 Print of palindrome using Scanner class
 */
