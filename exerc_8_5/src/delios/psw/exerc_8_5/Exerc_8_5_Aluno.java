package delios.psw.exerc_8_5;

public class Exerc_8_5_Aluno {

		public String curso;
		
	 float notas[] = new float[4];
	 
	 public Exerc_8_5_Aluno() {
			// TODO Auto-generated constructor stub
		}
	 
	 public Exerc_8_5_Aluno(String curso, float[] notas) {
		super();
		this.curso = curso;
		this.notas = notas;
	}

	public Exerc_8_5_Aluno(float vet[], String curso) {
		 for(int i = 0; i < 4; i++) {
			 this.notas[i] = vet[i];
		 }
		 this.curso = curso;		
	 }
	 
	

	public boolean situcao() {
		 float soma = 0;
		 
		 for(int i = 0; i < 4; i++) {
			 soma += notas[i];
		 }
		 System.out.printf("A MEDIA E : %.1f\n",soma/4);
		 if(soma/4 > 7)
			 return true;
		 else
			 return false;
	 }

}
