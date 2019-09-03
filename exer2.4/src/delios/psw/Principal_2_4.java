package delios.psw;

import java.util.Scanner;

public class Principal_2_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String b;
		Scanner sc = new Scanner (System.in);
		System.out.println(" \n");
			
		System.out.println("\t entre com tres inteiros para testa metodo do produto \n");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.printf("\t teste metodo produto %d\n",Metodo_static.produto(x, y, z));
		System.out.println(" \n");
		
		System.out.println("\t entre com dois inteiro e um operador para testar"
				+ "o metodo operador \n");
		 x = sc.nextInt();
		 y = sc.nextInt(); //sc.next();
		 b = sc.next();
		System.out.printf("\t teste metodo operador %d%s%d= %d\n",x,b,y,Metodo_static.operecao(x, y,b));
		
		System.out.println("\t entre com tres inteiros para testa metodo media \n");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		System.out.printf("\t teste metodo media %d\n",Metodo_static.media(x,y, z));
		
		System.out.println("\t entre com tres inteiros para testa metodo menor valor \n");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		System.out.printf("\t teste metodo o menor valor e %d\n",Metodo_static.menor_valor(x,y,z));
		
		System.out.println("\t entre com tres inteiros para testa metodo maior valor \n");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		System.out.printf("\t teste metodo o maior valor e %d\n",Metodo_static.maior_valor(x,y,z));
		
		System.out.println("\t entre com um valor de cinco digitos para testa metodo "
				+ "retorna invertido \n");
		x = sc.nextInt();
		System.out.printf("\t teste metodo o inverte numero e %s\n\n",Metodo_static.retorna_invertido(x));
		
		System.out.println("\t entre com um valor de cinco digitos para testa metodo "
				+ "ordena crecente \n");
		x = sc.nextInt();
		System.out.printf("\t teste metodo o ordena crescente numero e  \n",Metodo_static.retorna_ordem_crecente(x));
		
		System.out.println("\t entre com um inteiro para testa metodo "
				+ "verifica se e primo \n");
		x = sc.nextInt();
		System.out.printf("\t teste metodo o retorna se %d e primo e %s\n\n",x,Metodo_static.retorna_se_primo(x));		
		
	}
}