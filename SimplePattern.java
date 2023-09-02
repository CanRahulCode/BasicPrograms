
import java.util.Scanner;
public class SimplePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows:");
		int r=sc.nextInt();
		System.out.print("Enter Columns:");

        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}
}

/*
Rectangle  Pattern Using Scanner class. 
 */



    
    
       