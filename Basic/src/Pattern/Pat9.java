package Pattern;

import java.util.Scanner;

public class Pat9 {
	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.println( " enter the value");
		int n=a.nextInt();
		
		for (int i=n;i>=1;i--) {
		 for (int j=1;j<=n-i;j++) {
		 System.out.print(" ");
		 }
		 int k=i;
		 for (int j=1;j<=2*i-1;j++) {
			 System.out.print(k);
			 if (j<i)
				 k--;
			 else
				 k++
				 
				 ;
		 }
		 System.out.println();
		 
		 }
}
}
