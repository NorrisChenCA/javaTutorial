import java.util.ArrayList;
public class collections{
	public static void main(String[] args){
		ArrayList<Integer>food = new ArrayList<Integer>();
		food.add(23);
		food.add(43);
		System.out.println(food);
		food.remove(1);
		System.out.println(food);
	}
}
