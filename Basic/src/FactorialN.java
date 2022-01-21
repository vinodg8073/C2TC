import java.util.Scanner;
public class FactorialN {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println(" Enter the number");
	int a= sc.nextInt();
	int b=fact(a); 
	 System.out.println(b);
}

static int fact(int c) {
	int b=1;
	while (c>0) {
		b=b*c;
		c--;
		
	}
	return b;
}
}
