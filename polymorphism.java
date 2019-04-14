public class polymorphism{
	public static void main (String[] args){
		candy allcandy[] = new candy[2];
		allcandy[0] = new bluecandy();
		allcandy[1] = new yellowcandy();
		for (int A=0; A < 3; A++){
			allcandy[A].sweed();
		}
	}
}
