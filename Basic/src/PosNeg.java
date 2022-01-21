import java.util.Scanner;
class PosNeg {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	
	int a = sc.nextInt();
	String b = (a>=0)? "Positive":"Negative";
	System.out.println(b);
			}
}
