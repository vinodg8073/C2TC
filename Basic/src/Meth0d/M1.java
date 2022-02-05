package Meth0d;

public class M1 {
	
	void div() {
		int i=10;
		String name="Vinod G";
		System.out.println("Details : "+i+" "+name);
	}
	
	static void div1() {
		M1 m=new M1();
		m.div();
	}
	public static void main(String[] args) {
		div1();
	}

}
