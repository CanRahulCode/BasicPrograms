import java.util.Scanner;
public class CountVowels {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s = scn.nextLine();
		System.out.print("Vowels are:"+count(s));
		}
	public static int count(String s){
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				count++;
				}
			}
		return count;
    }sc.close();

}
/*
 Counting of  vowels from the String.
 */