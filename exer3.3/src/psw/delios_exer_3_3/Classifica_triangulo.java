package psw.delios_exer_3_3;

public class Classifica_triangulo {
	public int x,y,z;

	public Classifica_triangulo(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Classifica_triangulo() {
		// TODO Auto-generated constructor stub
	}

	public String verifica_triangulo(int x, int y, int z){
		String trian="ESCALENO";
		if(x==y && y ==z)
			trian= "EQUILATERO";
		if (x==y && y!=z) 
			trian ="ISOCELES";
		return trian;
	}

}
