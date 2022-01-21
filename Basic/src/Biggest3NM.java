import java.util.Scanner;
public class Biggest3NM {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 3 no");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big = biggi(a,b,c);
		
		System.out.println(big);
		
	}
	
	static int biggi(int x, int y, int z) {
		int big=x;
		
		if (big<y)
			big =y;
		if (big <z)
			big =z;
		return big;
		
	}

}
