package delios.psw_exer4_2;

public class Exerc_4_2_3 {
	//Imprimir todos os inteiros m´ultiplos de 3 entre 1000 e 1200, utilizando o comando for.
	public static void main(String[] args) {
		
		for (int i=1000;i < 1200; i++){
			int resto =i%3;
			if( resto==0){
				System.out.printf("\t\t%d\n",i);
			}
		}
	}

}
