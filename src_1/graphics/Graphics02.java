package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;

public class Graphics02 extends JFrame{

	private Graphics2D g2;
	
	private final int WIDTH  = 800;
	private final int HEIGHT = 600;
	
	public void configWindow() {
		setLayout(null);
		
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
		
		setBackground(new Color(234, 234, 234));
		getContentPane().setBackground(new Color(234, 234, 234));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void start() {
		setVisible(true);
	}
	
	@Override
	public void paint(java.awt.Graphics g) {
		super.paint(g);
		
		g2 = (Graphics2D) g;

		desenharCoordenadas();

		desenharLinhas();
		
		desenharTexto();

	}
	
	

	private void desenharCoordenadas() {
		for( int i = 0; i <= WIDTH; i +=100 ){
			for( int j = 0; j <= HEIGHT; j +=100 ){
				if( i < WIDTH && j < HEIGHT ){
					g2.drawString("( " + i + ", " + j + " )", i + 5, j + 40);
				}
			}
		}
	}
	
	
	
	private void desenharLinhas(){
		//										 X1   Y1   X2   Y2
		Line2D linhaDiagonal = new Line2D.Double(300, 300, 100, 500);
		g2.draw(linhaDiagonal);
		
		//			X1   Y1   X2   Y2
		g2.drawLine(100, 450, 100, 500);
		g2.drawLine(150, 500, 100, 500);
	}
	
	
	
	private void desenharTexto(){
		g2.setFont( new Font("Serif", Font.BOLD, 30) );
		g2.drawString("Naab!", 300, 290);	
	}
	
//	g2.setColor(Color.red);
//	g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));
}
