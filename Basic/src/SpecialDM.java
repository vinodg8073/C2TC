import java.util.Scanner;
public class SpecialDM {
public static void main(String[] args) 
	
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	//int t=a;
	boolean b= special(a);
	
	if (b==true)
		System.out.println(a+" is a Special two digit number");
	else
		System.out.println(a+" is not a special two digit number");
//System.out.println(t);
}

static boolean special(int n) {
	int y = n%10;
	int x = n/10;
	
	int z= y+x+(y*x);
	
	if (z==n)
		return true;
	else
		return false;
	
}
}
