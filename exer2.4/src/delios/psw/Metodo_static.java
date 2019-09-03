package delios.psw;

import java.math.*;

public class Metodo_static {
	public String operador="";

	public static int produto(int x, int y, int z) {
		int aux = x * y * z;
		return aux;
	}

	public static int operecao(int x, int y,String operador) {
		int aux = 0;
		String adicao="+",subtracao = "-", multiplicacao = "*",divisao = "/";
		//System.out.println(operador);
		if (operador.equals(adicao)) {
			aux = x + y;
		}
		if (operador.equalsIgnoreCase(subtracao)) {
			aux = x - y;
		}
		if (operador.equalsIgnoreCase(multiplicacao)) {
			aux = x * y;
		}
		if (operador.equalsIgnoreCase(divisao)) {
			aux = (x / y);
		}
		return aux;
	}

	public static int media(int x, int y, int z) {
		int aux = (x + y + z) / 3;
		return aux;

	}

	public static int menor_valor(int x, int y, int z) {
		int aux = 0;
		if (x < y && x < z) {
			return aux = x;
		}

		if (y < x && y < z) {
			return aux = y;
		}

		if (z < x && z < y) {
			return aux = z;
		}
		return aux;

	}

	public static int maior_valor(int x, int y, int z) {
		int aux = 0;
		if (x > y && x > z) {
			return aux = x;
		}
		if (y > x && y > z) {
			return aux = y;
		}
		if (z > x && z > y) {
			return aux = z;
		}
		return aux;

	}

	public static String retorna_invertido(int valor){
		String aux ="";

		String aux2=""+valor;
		System.out.printf("\to numer para inverter \n %d",valor);
		for (int i=aux2.length(); i > 0; i--) {
			aux += aux2.substring(i - 1, i);
		}
		return aux;
	}
	public static int retorna_ordem_crecente(int num){
		String aux2=""+num;
		int vet [] = new int [5],j=0,i=0;
		int invert[]= new int[5];
		for( i =0;i<aux2.length();i++){
			vet[i] = aux2.charAt(i)-48;	

			invert[i]= Integer.valueOf(vet[i]);
		}
		for (  i = vet.length; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				if (invert[j - 1] > invert[j]) {
					int aux = invert[j];
		                    invert[j] = invert[j - 1];
		                    invert[j - 1] = aux;
		                }
		            }
		        
		        }
			
			for(i=0;i<5;i++){
			 System.out.printf("%d",invert[i]);
			}
	return 1;	
			
}

	public static boolean retorna_se_primo( int x){
	
		for(int i=2; i< x;i++){
			if(x%i== 0){
				System.out.printf("o numero %d nao e primo",x);
				return false;
			}
		}
		System.out.printf("o %d e primo",x);
		
		return true;
	}
	
}








