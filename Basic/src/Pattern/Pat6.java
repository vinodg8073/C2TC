package Pattern;

import java.util.Scanner;

public class Pat6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int n=sc.nextInt();
	
	for (int i=1;i<=n;i++) {
		for (int a=1; a<=n-i;a++ ) {
			System.out.print (" ");
		}
			
		for (int j=1;j<=i;j++) {
			System.out.print(j);
			if (j<i) {
			System.out.print("*");
			}
		}
		
		
		System.out.println();
	}
	
}
}
