class ErrorC {
	public static void main(String[] args){
		try{
			int x = 1 / 0;
			int [] array = new int[2];
			array[0] = 6;
			array[1] = 5;
			System.out.println(array[9]);
			System.out.println(x);
 		}
		catch(IndexOutOfBoundsException er){
			System.out.println("Array Error");
		}
		catch(Exception er){
			System.out.println("Error");
		}
	}
}
