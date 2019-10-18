package delios.psw.exer_9_4;

public class Cachorro extends Animal{
	private String cor;
	private float peso;
	private String nascimento;
	private String falecimento;
	private static int contador;
	
	
	public Cao(boolean vertebrado, String cor, float peso) {
		super(vertebrado);
		this.cor = cor;
		this.peso = peso;
	}
	
	@Override
	public void extinguir() {
		extinto = true;			
		
	}
	@Override
	public void nascer(String Data) {
		setNascimento(Data);
		setContador(getContador() +1);
	}
	@Override
	public void morrer(String Data) {
		setFalecimento(Data);
		setContador(getContador() -1);
		
		if(getContador() == 0)
			extinguir();
	}
	
	public int porte() {
		if(getPeso() > 5) 
			return 0;
		
		if (getPeso() > 5 && getPeso()< 20)
			return 1;
		
		return 2;
	}		
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getFalecimento() {
		return falecimento;
	}

	public void setFalecimento(String falecimento) {
		this.falecimento = falecimento;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Cachorro.contador = contador;
	}

	@Override
	public String toString() {
		return "Cor do cão:" + cor + "\nNascimento: " + nascimento + "\nFalecimento: " + falecimento + "\nPorte: "
				+ porte() + super.toString();
	}

}
