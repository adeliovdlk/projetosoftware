package delios.psw.exer_8_5;

public class Aluno extends Pessoa{
	String nomeDoCurso;
	 float notas[] = new float[4];
	 
	 public Aluno() {
		 
	 }
	 
	 public Aluno(float vet[], String curso) {
		 for(int i = 0; i < 4; i++) {
			 this.notas[i] = vet[i];
		 }
		 this.nomeDoCurso = curso;		
	 }
	 
	 public boolean aprovadoOuReprovado() {
		 float soma = 0;
		 
		 for(int i = 0; i < 4; i++) {
			 soma += notas[i];
		 }
		 System.out.printf("Sua média é: %.1f\n",soma/4);
		 if(soma/4 > 7)
			 return true;
		 else
			 return false;

}
