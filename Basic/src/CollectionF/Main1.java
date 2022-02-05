package CollectionF;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		List<Student> slist=new ArrayList();
		do {
			System.out.println("enter Student id, name and four subject marks");
			int id=sc.nextInt();
			String name=sc.next();
			int p=sc.nextInt();
			int c=sc.nextInt();
			int m=sc.nextInt();
			int b=sc.nextInt();
			Student stu=new Student (id,name,p,m,b,c);
			slist.add(stu);
			System.out.println("Succesfully Added");
			System.out.println("Do you have more student");
			String rs=sc.next();
			if (rs.equalsIgnoreCase("no"))
			break;
			
		}while(true);
		
		System.out.println("<-------------Student Information--------------->");
		for (Student st: slist)
		{
			System.out.println(st);
			
		}
		
		System.out.println("<-------------Statistic----------------->");
		printStatics(slist);
		
	System.out.println("<-----------Failed Students------------->");
	slist.stream().filter(s->s.getResult().equalsIgnoreCase("fail")).forEach(x->System.out.println(x));
	
	System.out.println("<-----------Distinction Students------------->");
	slist.stream().filter(s->s.getResult().equalsIgnoreCase("distinct")).forEach(x->System.out.println(x));
	
	System.out.println("<-----------First Class Students------------->");
	slist.stream().filter(s->s.getResult().equalsIgnoreCase("firstclass")).forEach(x->System.out.println(x));
		System.out.println("<-----------Second Class Students------------->");
	slist.stream().filter(s->s.getResult().equalsIgnoreCase("secondclass")).forEach(x->System.out.println(x));
	
	System.out.println("<-----------Just Pass Students------------->");
	slist.stream().filter(s->s.getResult().equalsIgnoreCase("pass")).forEach(x->System.out.println(x));
	}
	

	private static void printStatics(List<Student> slist) {
		int dc=0,fc=0,sc=0,jc=0,flc=0;
		
		for(Student st: slist)
		{
			if(st.getResult().equalsIgnoreCase("distinct"))
				dc++;
			else if(st.getResult().equalsIgnoreCase("firstclass"))
				fc++;
			else if(st.getResult().equalsIgnoreCase("secondclass"))
				fc++;
			else if(st.getResult().equalsIgnoreCase("pass"))
				fc++;
			else
				flc++;
			
		}
		
		System.out.println("Distinction Students  :  "+dc);
		
		System.out.println("First class Students  :  "+fc);
		
		System.out.println("Second class Students :  "+sc);
		
		System.out.println("Just pass Students    :  "+jc);
		
		System.out.println("Failed Students       :  "+flc);
			}

}
