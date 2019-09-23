package delios.psw;

public class Principal_Ponto2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ponto2D p1= new Ponto2D();
		Ponto2D p2= new Ponto2D(1,1);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.printf(" %d %d\n",p1.getX(),p1.getY());
		System.out.printf("%d %d\n",p2.getX(),p2.getY());
		
		System.out.println("p1 esta no "+ p1.quadrante());
		System.out.println("p2 esta no "+ p2.quadrante());
		
		System.out.printf("A DISTANCIA ENTRE P1 E P2 E %f ",p1.distancia(p2));
		
		System.out.println( " p1 E P2 SAO "+
				(p1.equals(p2)?"iguais ":"diferentes"));
		System.out.println( " p1 E P2 SAO "+
				(p1.equals(p1)?"iguais ":"diferentes"));
		
}
	

}
