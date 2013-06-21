package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedImage bi = new BufferedImage(350, 280, BufferedImage.TYPE_INT_ARGB);
		
		Graphics2D g2 = bi.createGraphics();
		
		g2.setColor(Color.BLACK);
		g2.drawLine(0, 0, 350, 280);
		
		ImageIO.write(bi, "PNG", new FileOutputStream("C:/java/imagem.png"));
	}
}
 