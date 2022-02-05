package CollectionF;

public class Student {
	String name;
	int id,p,c,m,b;
	double per;
	public Student(int i, String s,int p, int m, int b, int c){
		super();
		this.id=i;
		this.name=s;
		this.b=b;
		this.c=c;
		this.p=p;
		this.m=m;
		this.per=(p+c+m+b)/4;
	}
	String getResult() {
		if (p<=35||b<=35||c<=35||m<=35)
			return "fail";
		if (per>=85)
return "distinct";
		if (per>=65)
			return "firstclass";
		if (per>=65)
		
			return "secondclass";
		else
			return "pass";
}
	@Override
	public String toString() {
		return "Student name=" + name + ", id=" + id + ", physics=" + p + ", chemistry=" + c + ", maths=" + m + ", biology=" + b + ", Total percentage="
				+ per + "";
	}
	

}
