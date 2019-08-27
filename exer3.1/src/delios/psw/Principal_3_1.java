package delios.psw;

import java.util.Scanner;

public class Principal_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub0
		Nome_Digitos_3_1 obj= new Nome_Digitos_3_1();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter com um numero de cinco digitos\n");
		obj.x=sc.nextInt();
		obj.escreveDigitos(obj.x);
	}

}
