import java.util.Scanner;

public class Leap{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter numbers");
	int a=sc.nextInt();
	String x =(a%4==0 && a%100!=0) || (a%400==0)?"leap year":"not a leap year";
	System.out.println("it is"+x);
}
}
