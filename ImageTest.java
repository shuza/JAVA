import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] arg) throws Exception{
		File sourceImage = new File("01.png");
		Image image = ImageIO.read(sourceImage);
		JFrame frame = new JFrame();
		JLabel label = new JLabel(new ImageIcon(image));
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}