import java.util.Scanner;
public class PalindromeM {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		
		
		boolean v=palin(a);
		if (v==true)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		
			}
	
	static boolean palin(int x) {
		int t=x;
		int z=0;
		
		do {
			int y= x%10;
			z=z*10 + y;
			x=x/10;
			
		}while (x!=0);
		
		if (z==t)
			return true;
		else 
			return false;
		
	}
}
