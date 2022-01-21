import java.util.Scanner;
public class Biggest4N {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the numbers");
	double a= sc.nextDouble();
	double b= sc.nextDouble();
	double c= sc.nextDouble();
	double d= sc.nextDouble();
	
	double big=(a>b )? a:b;
	big=(big>c)? big:c;
	big = (big>d)? big:d;
	
	
	System.out.println(big);
	
}
}
