package Pattern;

import java.util.Scanner;

public class Pat12 {
	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.println( " enter the value");
		int n=a.nextInt();
	
	for (int i=1; i<=n;i++) {
		for (int j=1;j<=n;j++) {
			if (i==1||i==n||j==1||j==n||j==n/2+1||i==n/2+1)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}System.out.println();
	}
	
	
	}

}
