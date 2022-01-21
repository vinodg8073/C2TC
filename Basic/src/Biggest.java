import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
	Scanner sc = new Scanner ( System.in);	
    System.out.println("enter first value");
    int a=sc.nextInt();
    System.out.println("enter second value");
	int b=sc.nextInt();
	System.out.println("enter third value");
	int c=sc.nextInt();
	
	int big=a;
	if (b>big)
		big=b;
	if (c>big)
		big=c;
System.out.println(big);
	}

}
