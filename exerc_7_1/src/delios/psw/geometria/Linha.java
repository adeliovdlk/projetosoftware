package delios.psw.geometria;

public class Linha {
	private Ponto2D a;
	private Ponto2D b;
	
	public Linha(){
		a= new Ponto2D();
		b= new Ponto2D();
	}
	
	public Linha(Ponto2D a, Ponto2D b){  /// esse e um jeito de melhorar o encapsulamento e e um 
		// exemplo de relacionamento de composicao
		this.a = new Ponto2D(a.getX(), a.getY());
		this.b = new Ponto2D(b.getX(), b.getY());
		
	}
	public Ponto2D getA(){
		return new Ponto2D(a.getX(),a.getY());				}
	}
