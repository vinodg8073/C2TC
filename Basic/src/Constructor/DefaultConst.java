package Constructor;

public class DefaultConst {
	String model,clr;
	int price;
	
	public static void main(String[] args) {
		DefaultConst d= new DefaultConst();
		
		System.out.println(d.clr+" "+ d.model+" "+d.price);
		d.clr="orange";
		d.model="duke"
				+ ""
				+ "200";
		d.price=250000;
		System.out.println(d.clr+" "+ d.model+" "+d.price);
		
	}

}
