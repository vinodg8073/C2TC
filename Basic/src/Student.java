
public class Student {
   String name,Mname;
   int id;
   Student(String n, String Mn, int i ){
	   this.name=n;
			   this.Mname=Mn;
   this.id=i;
   }
	public static void main(String[] args) {
    Student s = new Student ("VINOD_G" , "UMADEVI", 17 );
    System.out.println( s.name + " "+ s.Mname+ " "+s.id);


	}

}
