package delios.psw.exer7_2;

public class Retangulo {
	private float comprimento = 1;
	private float largura = 1;
	
	public Retangulo () {
		
	}
	public Retangulo( float x, float y) {
		this.comprimento = x;
		this.largura = y;
	}
	
	public float getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(float comprimento) {
		if(verificarNumero(comprimento))
			this.comprimento = comprimento;
		else
			this.comprimento = 1;
	}
	
	public float getLargura() {
		return largura;
	}
	
	public void setLargura(float largura) {
		if(verificarNumero(largura))
			this.largura = largura;
		else
			this.largura = 1;
	}
	
	public boolean verificarNumero(float num) {
		if(num > 0 && num < 20) {
			return true;
		}
		return false;
	}
	
	public float perimetroNum() {
		return 2 * (comprimento  + largura);
	}
	
	public float areaNum() {
		return comprimento * largura;
    }
	
}