import java.util.Scanner;


public class TwoDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		
			
		if (x>=10 && x<=99  )
			System.out.println("two digit number");
		else if (x<=-10 && x>=-99)
			System.out.println("two digit number");
		else
			System.out.println("not a two digit number");
	}
}
