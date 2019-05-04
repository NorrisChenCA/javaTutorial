class Error{
	public static void main(String[] args){
		try{
			int[] array;
			array = new int[3];
			array[0] = 3;
			array[1] = 4;
			array[2] = 6;
			System.out.println(array[77]);
		}
		catch(IndexOutOfBoundsException er){
			System.out.println("Error");
		}
	}
}
