import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;


public class Tile {
	
	public BufferedImage tileImage = null;

	public Tile(String fileName) {
		try {
		      tileImage = ImageIO.read(new URL("file:" + fileName));
		    } catch (IOException e) {
		      System.out.println("Failed to load 'grass.png' image.");
		    }	
		}
	
	protected void draw(Graphics2D g2, int i, int j) {
	    g2.drawImage(tileImage, null, i * 64, j * 64);
	  }

}
