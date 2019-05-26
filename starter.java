import pkg.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;


//IMPLEMENT THIS CODE IN GAMEDRIVER?
public class starter
{
	public static void main(String args[])
	{
		NFrame frame = new NFrame("GUI", 1280, 720);
		
		JPanel panel = new JPanel();
		// panel.setBackground(Color.RED);
		JButton ez = new JButton("easy");
		
		panel.add(ez);
		frame.add(panel);
		ez.addActionListener((ActionEvent e) -> {
			System.out.println("easy");
		});
	}
	
}