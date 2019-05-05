class ErrorB{
	public static void main(String [] args){
		try{
			int[] array;
			array = new int[2];
			array[0] = 2;
			array[1] = 3;
			System.out.println(array[6]);
		}
		catch(Exception er){
			System.out.println("Error");
		}
		try{
			int x = 1 / 0;
			System.out.println(x);
		}
		catch(Exception er){
			System.out.println("Error");
		}
	}
}
