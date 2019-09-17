package delios.psw_exer4_2;

public class Exerc_4_2_4 {
		//Imprimir todos os inteiros m´ultiplos de 3 entre 1000 e 1200, utilizando o comando while.
	public static void main(String[] args) {
		int i=1000;
		while (i < 1200){
			int resto =i%3;
			if( resto==0)
				System.out.printf("\t\t%d\n",i);
				
				i++;
		}
	}

}
