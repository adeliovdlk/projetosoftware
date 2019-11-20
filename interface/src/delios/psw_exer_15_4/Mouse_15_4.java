package delios.psw_exer_15_4;
import java.io.IOException;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mouse_15_4 extends JFrame {

	private static int POINT_SIZE = 3;



	

	private static final long serialVersionUID = 1L;

	private JPanel mousePanel;
	private String message;
	private int origemX,origemY;
	private int raioX, raioY;
	private double raio, area;


	public Mouse_15_4() {
		super("Tratamento dos eventos de mouse");

		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		mousePanel = new JPanel();
		add(mousePanel, BorderLayout.CENTER);

		JLabel status = new JLabel("Mensagens de evento do mouse");
		add(status, BorderLayout.SOUTH);

		mousePanel.addMouseListener(new MouseListener() {
			

			@Override
			public void mouseClicked(MouseEvent event) {
				String detalhe;
				if (event.isMetaDown()) // botão direito do mouse
					detalhe = " com botão direito";
				else if (event.isAltDown()) // botão do meio do mouse
					detalhe = " com botão do meio";
				else // botão esquerdo do mouse
					detalhe = " com botão esquerdo";
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				
				// TODO Auto-generated method stub
				origemX = arg0.getX();
				origemY = arg0.getY();
				
				
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				// TODO Auto-generated method stub

				
				
			}
		});
		mousePanel.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				raioX = arg0.getX();
				raioY = arg0.getY();
				//message = String.format("A ORINGEM ATUAL E   (%d ) (%d )  E O RAIO E (%d) (%d)  ",origemX,origemY,raioX,raioY);
				//status.setText(message);
				int x = Math.abs(origemX - raioX);
				int y = Math.abs(origemY - raioY);
				
				raio = Math.sqrt(x*x)+(y*y);
				
				double area = Math.PI*  raio *raio;
				double circunferencia = Math.PI *2 * raio;
				
				
				message = String.format("A ORINGEM ATUAL E   (%d ) (%d )  E O RAIO E (%d) (%d)+"
						+ " A AREA E [%.2f] A CIRCUNFERENCIA  E [%f] ",origemX,origemY,raioX,raioY,area,circunferencia);
				status.setText(message);
				
				
				
				
				
			}

			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				message = String.format("posicao atual   (%d ) (%d )  ",arg0.getX(),arg0.getY());
				status.setText(message);
				
			}
			
			
			
		});
		setVisible(true);
	}
	
}
	
	class Painel extends JPanel{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		
		
		public void paint (Graphics g){
			
			super.paintComponent(g);
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
		
	
				