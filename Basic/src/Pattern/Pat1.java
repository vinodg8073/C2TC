package Pattern;

import java.util.Scanner;
public class Pat1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		
		for (int i=n; i>=1;i--) {
			for (int j=1;j<=n-i ;j++) {
				System.out.print(" ");
			}
			for (int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
