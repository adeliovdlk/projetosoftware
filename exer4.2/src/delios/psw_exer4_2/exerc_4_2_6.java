package delios.psw_exer4_2;

public class exerc_4_2_6 {
 /*
	//Imprimir os valores dos fatoriais de 1 a 10.
	Aumente a quantidade de n´umeros que ter˜ao os fatoriais impressos, at´e 20, 30, 40. Em determinado
	momento, al´em desse calculo demorar, vai come¸car a mostrar respostas erradas. Por quˆe?
	Mude o tipo de vari´avel de int para long e verifique se ocorre alguma mudan¸ca.*/
	
	public static void main(String[] args) {
		long x=40;
		long f=x;
		
		while (x > 1){
			  f = f *(x-1); 
			  x--;
			  System.out.println(f);
		}
	}
}
