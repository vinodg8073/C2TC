package Pattern;

import java.util.Scanner;

public class Pat10 {
	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.println( " enter the value");
		int n=a.nextInt();
		int num=1,space=n/2;
		
		for (int i=1;i<=n;i++) {
		 
			for (int j=1;j<=space;j++) {
		 System.out.print(" ");
		 }
		 int k=1;
		 for (int j=1;j<=num;j++) {
			 System.out.print((char)(64+k));
			 if (j<=num/2)
				 k++;
			 else
				 k--;
				 
		 }
		 System.out.println();
		 if (i<=n/2)
		 {
			 space--;
			 num=num+2;
			 
		 }
		 else
		 {
			 space++;
			 num=num-2;
		 }
		 
		 }
	}}
