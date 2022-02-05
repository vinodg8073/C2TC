package Meth0d;

public class MOverL {

	void payBill(String upi) {
		System.out.println("google pay : "+upi);
	}
	void payBill(long cNo,String expd) {
		System.out.println("Card details : "+cNo+", "+expd);
		
	}
	void payBill(String uid, String pwd) {
		System.out.println("Website : "+uid+", "+pwd);
	}
	static void Payment() { 
		MOverL m=new MOverL ();
	m.payBill(123784596554L, "01jan2026");
	
	}
public static void main(String[] args) {
	Payment();
}
}
