import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		
		int a=x%2;
		
		if (a>=1)
			System.out.println("odd");
		else
			System.out.println("even");
	}
}
