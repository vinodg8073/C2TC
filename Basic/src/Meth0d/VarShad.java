package Meth0d;

public class VarShad {
int id=150;
 void Stu() {
 int id=100;
 System.out.println(this.id);
}
public static void main(String[] args) {
	VarShad v=new VarShad();
	v.Stu();
}
}
