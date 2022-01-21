import java.util.Scanner;

public class Smallest3 {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);	
	    System.out.println("enter first value");
	    double a=sc.nextDouble();
	    System.out.println("enter second value");
	    double b=sc.nextDouble();
		System.out.println("enter third value");
		double c=sc.nextDouble();
		
		double small=a;
		if (b<small)
			small=b;
		if (c<small)
			small=c;
	System.out.println(small);
		}

	}


