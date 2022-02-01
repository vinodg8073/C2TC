package Pattern;

import java.util.Scanner;

public class Pat5 {
	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.println( " enter the value");
		int n=a.nextInt();
		
		for (int i=1;i<=n;i++) {
		 for (int j=i;j>=1;j--)
		 {
			 System.out.print((char) (64+j));
		 }
		 System.out.println();
		}
		}
}
