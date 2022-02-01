package Pattern;

import java.util.Scanner;

public class Pat13 {
	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.println( " enter the value");
		int n=a.nextInt();
	int num=n,sp=0;
	for (int i=1; i<=n;i++) {
		for (int j=1;j<=sp;j++) {
			System.out.print(" ");
		}
		int k=num/2+1;
		for (int j=1; j<=num; j++) {
			
			System.out.print((char)(64+k));
			
			
			if (j<=num/2) {
				k--;
						}
			else 
			{
				k++;
				}
		
		}
		System.out.println();
		if (i<=n/2) {
			sp++;
			num=num-2;
		}
		else {
			sp--;
			num=num+2;
		}
	}
	}
}
