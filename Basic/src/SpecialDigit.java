import java.util.Scanner;
public class SpecialDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter two digit number");
	
	int a= sc.nextInt();
	
	int b= a%10;
	int c=a/10;
	 int ss= b + c + b*c;
	 if (ss==a)
	 System.out.println(" entered num is Special digit");
	 else
		 System.out.println(" not a Special digit number");
	
}
}
