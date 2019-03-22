public class subclassB extends superclassB{
	int a;
	int b;
	public subclassB (int x,int y){
		super(3,4);
		a=x;
		b=y;
	}
	public static void main(String[] args){
		subclassB obj1 = new subclassB(1,2);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		System.out.println(obj1.d);
	}
}
