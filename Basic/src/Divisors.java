import java.util.Scanner;
public class Divisors {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("enter the number");
int a=sc.nextInt();
int count=0,i=1;
while (i<=a) {
	
	if (a%i==0) {
		System.out.println(i);
		count++;}
	 i++; 
}
	
System.out.println(count);


}
	
	
	
	
}
