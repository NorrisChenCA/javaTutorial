public class overload{
	public int over(int a,int b){
		return a + b;
	}
	public int over(int a,int b,int c){
		return a + b + c;
	}
	public static void main(String[] args){
		overload overload1 = new overload();
		overload overload2 = new overload();
		System.out.println(overload1.over(12,54));
		System.out.println(overload2.over(12,45,76));
	}
}
