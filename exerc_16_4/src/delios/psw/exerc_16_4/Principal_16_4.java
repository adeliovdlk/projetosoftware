package delios.psw.exerc_16_4;

public class Principal_16_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Exerc_pilha_16_4 p = new Exerc_pilha_16_4();
		        p.empilhar("primeiro ");
		        p.empilhar("segundo ");
		        p.empilhar("terceiro ");
		        p.empilhar("Quarto ");
		        p.empilhar("Quinto ");
		        p.empilhar(10);
		                while (p.pilhaVazia() == false) {
		            System.out.println(p.desempilhar());
		        }

	}

}
