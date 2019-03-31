public class set{
	private int A;
	public void setA(int A){
		if(A < 18){
			this.A=A;
			System.out.println("ok");
		}
		else{
			System.out.println("no");
		}
		
	}
	public int getA(){
		return A;
	}
}
