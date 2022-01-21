import java.util.Scanner;
public class EqualN {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter first number");
	int a=sc.nextInt();
	System.out.println("enter second number");
	int b=sc.nextInt();
	
	String c = (a==b)? "EQUAL":"NOT EQUAL";
	System.out.println(c);
}
}
