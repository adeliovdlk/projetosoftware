package delios.psw.exerc_8_5;



	import java.util.Scanner;

	public class Principal_exerc_8_5 {

		private static Scanner sc;

		public static void main(String[] args) {
			Exerc_8_5_Aluno obj = new Exerc_8_5_Aluno();
			
			
			sc = new Scanner(System.in);
			
			for(int i = 0; i < 4; i++) {
				System.out.printf("Digite a %d° nota: ",i + 1);
				obj.notas[i] = sc.nextFloat();
				
			}
			System.out.println("Digite o nome do seu curso: ");
			obj.curso = sc.next();
			
			
			if(obj.situcao()) 
				System.out.println("Você está aprovado!");
			else
				System.out.println("Você está reprovado!");
		}

	

}


