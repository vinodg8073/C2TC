import java.util.Scanner;
public class SumSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b =a%10;
		int c=a/10;
		a=b*b+(c*c);
		System.out.println("Sum of square : "+a);
		
}
}
