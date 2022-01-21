import java.util.Scanner;

public class Zero {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	if (a==0)
		System.out.println("Number is zero");
	else
		System.out.println("number is non zero");
}
}
