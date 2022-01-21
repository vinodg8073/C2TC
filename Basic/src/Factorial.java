import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println(" enter the number");
int n=sc.nextInt();
int i,sum=0;
for(i=1;i<=n;i++)
{
	if(i%2==1)
		
	{
		 
		
		sum=sum+i; 
	}
}
	
System.out.println("sum of odd numbers upto"+n+"="+sum);
	


//System.out.println("factorial of"+n+"is:"+fact);

}
}
