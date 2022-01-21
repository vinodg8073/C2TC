import java.util.Scanner;
public class SpecialNumber {
	public static void main(String[] args) {
		//SpecialNumber sn=new SpecialNumber();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	boolean rs=Phalindrome(n);
	if(rs==true)
	System.out.println("it is palindrome");
	else
		System.out.println("it is not palindrome");
	}
	//class Maspec{
		static boolean Phalindrome(int x) {
			int sum=0,t=x;
			do {
				int a=x%10;
				sum=sum*10+a;
				 int n=x/10;
			}
			if(x!=0)
				return true;
				else
			    return false;
			}
}
				
				
			
				


	


