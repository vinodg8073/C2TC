
public class Car {
	int price;
	String brand;
	String clr;
	
	Car(int p, String b, String c ){
		this.price=p;
		this.brand=b;
		this.clr=c;
		}
	
	
	public static void main(String[] args) {
		
		Car c1=new Car( 1522512, "audi","red");
		Car c2=new Car( 16324844, "benz","silver");
		Car c3=new Car( 1895588, "alto","yellow");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.price+ " "+this.brand+ " "+ this.clr;
	}

}
