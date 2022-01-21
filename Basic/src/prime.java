import java.util.*;
public class prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("entre the value:");
	int a =sc.nextInt();
	
	int count=pp(a);
	System.out.println("Sum of prime number is : "+count +" in between "+a);
}
static int  pp(int n) {
	int count=0;
	 for(int i=0;i<n;i++) {
		 boolean rs=true;{
			 for(int j=2;j<=i/2;j++) {
				 if(i%j==0) {
					 rs=false;
					 break;
				 }
			 }
			 if(rs==true) {
				 //System.out.println(i);
              count=count+i;			
              }
		 }
	 } return count;
}
}
