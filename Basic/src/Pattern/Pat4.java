package Pattern;


import java.util.Scanner;

public class Pat4 {
public static void main(String[] args) {
	Scanner a =new Scanner(System.in);
	System.out.println( " enter the value");
	int b=a.nextInt();
	
	for (int i=1;i<=b;i++) {
		for( int j=1;j<=i;j++) {
			System.out.print(j);
		}
		
		System.out.println();
	}
	
}
}
