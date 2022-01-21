import java.util.Scanner;

public class Smallest {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	System.out.println("enter first value");
	double a =sc.nextDouble();
		System.out.println("enter second value");
		double b=sc.nextDouble();
		double small=a;
		if (b<small)
small=b;
		System.out.println("smallest number is: "+ small);
}
}
