package Array;

import java.util.Scanner;

public class Arr2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		
		String a[]= new String[n];
		System.out.println(" enter the strings");
		     sc.nextLine();
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextLine();
		}
		
		String b=highestS (a);
		System.out.println("Highest length string is : "+b);
	}

	static String highestS ( String []x) {
		 String hl=x[0];
		 for (int i=1;i<x.length;i++)
		 {
			 if (hl.length()<x[i].length())
				 hl=x[i];
			 
		 }
		 return hl;
	}
}
