package delios.psw.exer_25_6;


	import javax.swing.JPanel;

	import edu.udc.psw.modelo.FormaGeometrica;
	import edu.udc.psw.modelo.Linha;
	import edu.udc.psw.modelo.Ponto2D;
	import edu.udc.psw.modelo.manipulador.ManipuladorFormaGeometrica;
	import edu.udc.psw.colecao.Iterador;
	import edu.udc.psw.colecao.ListaEncadeada;

	import java.awt.Graphics;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import java.awt.event.MouseMotionListener;

	public class Exerc_25_6  extends JPanel 
			implements MouseListener, MouseMotionListener {
		private static final long serialVersionUID = 1L;

		private boolean desenhando = false;
		private ManipulandoFormaGeometricas manipulador;

		//private Ponto2D ponto;
		//private Linha linha;
		private FormasGeometricas forma;
		
		private ListaEncadeada<FormaGeometricas> listaFormaGeometrica;

		/**
		 * Create the panel.
		 */
		public PainelDesenho() {
			
			listaFormaGeometrica = new ListaEncadeada<FormaGeometrica>();
			
			addMouseListener(this);
			addMouseMotionListener(this);

		}
		
		public void setFormaGeometrica(FormaGeometrica forma) {
			this.forma = forma;
			manipulador = forma.getManipulador();
		}

		public boolean isDesenhando() {
			return desenhando;
		}

		public void setDesenhando(boolean desenhando) {
			this.desenhando = desenhando;
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			if(forma != null)
				manipulador.paint(g);
			
			FormaGeometrica formaAux;
			Iterador<FormaGeometrica> it = listaFormaGeometrica.getInicio();
			
			formaAux = it.getObjeto();
			while(formaAux != null) {
				formaAux.getManipulador().paint(g);
				formaAux = it.proximo();
			}	
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			if (manipulador != null) {
				manipulador.click(e.getX(), e.getY());
				
				repaint();
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (manipulador != null) {
				manipulador.press(e.getX(), e.getY());

				desenhando = true;
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if(desenhando) {
				manipulador.release(e.getX(), e.getY());
				
				listaFormaGeometrica.inserirFim(forma);
				
				desenhando = false;
				
				forma = forma.clone();
				manipulador = forma.getManipulador();
				
				repaint();
			}
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
		public void mouseDragged(MouseEvent e) {
			if(desenhando) {
				manipulador.drag(e.getX(), e.getY());
				
				repaint();
			}
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

}
