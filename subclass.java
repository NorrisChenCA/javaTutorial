public class subclass extends superclass{
	public void printsomething(){
		super.printsomthing();
	}	
	public static void main(String[] args){
		subclass test1 = new subclass();
		test1.printsomething();
	}
}
