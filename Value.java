public class Value{
	private int x;
	public Value(){
		x=70;
	}
	public int ValueA(){
		x=15;
		return x;
	}
	public int ValueB(int B){
		this.x=this.x + B;
		return x; 
	}
	public static void main(String[] args){
		Value A1 = new Value();
		System.out.println(A1.ValueB(54));
	}
}
