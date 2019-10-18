package delios.psw.exer_8_5;
import java.util.Scanner;

public class Principal_Aluno {
	private static Scanner sc;

	public static void main(String[] args) {
		Aluno al1 = new Aluno();
		sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.printf("Digite a %d° nota: ",i + 1);
			al1.notas[i] = sc.nextFloat();
			
		}
		System.out.println("Digite o nome do seu curso: ");
		al1.nomeDoCurso = sc.next();
		
		
		if(al1.aprovadoOuReprovado()) 
			System.out.println("Você está aprovado!");
		else
			System.out.println("Você está reprovado!");
	}


}
