public class PowerofNumber {
	
	public static void main(String args[]) {
		int base=5,x=3;
		System.out.println("Required Power is "+ power(base,x));
	}
	static int power(int base,int x) {
		int result = 1;
		while(x > 0) {
			result *=base;
			x--;
		}
		return result;
	}

}

/*
 Question 
 Power the  given number.
 */