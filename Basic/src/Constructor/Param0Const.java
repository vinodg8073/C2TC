package Constructor;

public class Param0Const {
	int id;
	String name;
	double per;
	
	void display() {
		System.out.println(id+" "+name+" "+per);
	}
	
	public static void main(String[] args) {
		Param0Const s=new Param0Const();
		System.out.println(s.id+" "+s.name+" "+s.per);
		s.display();
	}
	Param0Const(){
	name="Vinod G";
	id=11;
	per=78.1;
	}

}
