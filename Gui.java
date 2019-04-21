import javax.swing.*;
public class Gui{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JButton button = new JButton("submit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.setSize(500,400);
		frame.setVisible(true);
	}
}
