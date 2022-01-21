import java.util.Scanner;
public class MonthDays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month number");
		int a = sc.nextInt();
		
				if (a==1|| a==3||a==5|| a==7||a==8|| a==10||a==12)
			System.out.println("31 days in a month");
		else if (a==4|| a==6||a==9|| a==11)
			
			System.out.println("30 days in a month");
		else if (a==2)
			System.out.println(" febraury month has 28 days");
		else 
			System.out.println("entered number is noth in range");
}
}
