package Array;

import java.util.Scanner;

public class Arr1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" enter length of the array");
		int n=sc.nextInt();
		int a[]= new int[n];
		
		System.out.println(" enter the values");
		for (int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		
		int small= getSmallest (a);
				System.out.println("smallest number is : "+small );
		
	}
	
	static int getSmallest (int b[]) {
		
		int small=b[0];
		for (int i=1;i<b.length;i++) {
			if (b[i]<small) {
				small=b[i];}
			
		}
		return small;
		
	}

}
