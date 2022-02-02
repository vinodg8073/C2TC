package Constructor;

public class CityP {
	String name;
	int pincode;
	CityP(String b,int c){
		name=b;
		pincode=c;
	}
	public static void main(String[] args) {
		CityP a=new CityP( "vinod g", 572107);
		CityP a1=new CityP("arun",560074);
		System.out.println(a);	
		System.out.println(a1);
	}
	public String toString() {
		return name+" "+pincode;
	}

}
