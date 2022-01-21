import java.util.Scanner;
public class PrimeNM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		
		int j=2;
		int sum= 0;
		do{
			int c= a%10;
			
			if (j<=a/2) {
				int d=c;
				sum = sum +d;
				
				
			}
			
			a=a/10;
			j++;
		} while (a!=0);
		System.out.println(sum);
	}

}
