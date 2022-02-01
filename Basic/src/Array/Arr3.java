package Array;

import java.util.Scanner;

public class Arr3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		
		int a[]= new int[n];
		System.out.println("enter integer numbers");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int b[]= returned (a);
		System.out.println(" sum of even numbers in array : "+b[1]);
		System.out.println(" sum of odd numbers in array : "+b[0]);
}
	
static int [] returned (int []c) {
	int sume=0,sumo=0;
	
	for (int i=0; i<c.length; i++) {
	
	if ( c[i]%2==1) {
		sumo=sumo+c[i];
			}
	else {
		sume=sume+c[i];
	}
	


   
    }int d[]= {sumo,sume};
	return d;
}
}
