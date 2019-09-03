package psw.delios_exer_3_3;

import java.util.Scanner;

public class Principal_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Classifica_triangulo obj = new Classifica_triangulo();
		System.out.println(" \n");
		
		System.out.println("\t entre com tres inteiros \n");
		obj.x = sc.nextInt();
		obj.y = sc.nextInt();
		obj.z = sc.nextInt();
		
		System.out.printf("\t com os valores de %d %d %d o triangulo e %s \n",obj.x,obj.y,obj.z,obj.verifica_triangulo(obj.x, obj.y, obj.z));

	}

}
