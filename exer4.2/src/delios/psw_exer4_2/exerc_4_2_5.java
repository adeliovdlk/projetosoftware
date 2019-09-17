package delios.psw_exer4_2;

public class exerc_4_2_5 {
//Imprimir todos os inteiros m´ultiplos de 3 entre 1000 e 1200, utilizando o comando do while.
	public static void main(String[] args) {
		
		int i=1000;
		do{
			int resto =i%3;
			if( resto==0)
				System.out.printf("\t\t%d\n",i);
				
				i++;
		}while (i < 1200);
				
		
	}

}
