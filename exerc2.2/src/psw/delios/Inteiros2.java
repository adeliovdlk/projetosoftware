package psw.delios;
import java.util.Scanner;
public class Inteiros2 {
	
	
	// metodo para leitura
	
 public static void main( String[] args ){
	Scanner sc = new Scanner (System.in);
	Inteiros obj = new Inteiros();
	
	System.out.println("entre com dois valores \n");
	
	obj.x = sc.nextInt();
	obj.y = sc.nextInt();

	
	System.out.printf( "o valor de x e:  %d \n o valor de y e: %d \n",obj.x,obj.y);
	System.out.printf("a soma e %d \n ",obj.retornaSoma(obj.x,obj.y));
	System.out.printf(" a diferenca e %d \n",obj.retornaDiferenca(obj.x,obj.y));
	
	
	
	
	
	
	
}

	
}
