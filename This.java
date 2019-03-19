public class This {
	private int one;
	public This (int one){
		this.one=one;
	}
	public static void main (String[] args){
		This thisone = new This(54);
		System.out.println(thisone.one);
	}
}
