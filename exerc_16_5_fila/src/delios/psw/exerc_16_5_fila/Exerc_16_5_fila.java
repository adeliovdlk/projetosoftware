package delios.psw.exerc_16_5_fila;

public class Exerc_16_5_fila extends No_fila {
		Exerc_16_5_fila inicio;
		Exerc_16_5_fila fim;

		int tamanho;

		public Exerc_16_5_fila(Object obj) {
			inicio = null;
			fim = null;

			tamanho = 0;
		}

		public int getTamanho() { 
			return tamanho;
		}

		public boolean isVazia() {//é vazia? 

			if (tamanho == 0) return true;
			else return false;
		}

		public boolean queue(Object obj) { // Inserir no começo da fila
			Exerc_16_5_fila no = new Exerc_16_5_fila(obj);

			if (tamanho == 0) { 
				inicio = no;
				fim = no;

				tamanho++;
				return true;
			}

			else {
				inicio.anterior = no;
				inicio = no;
				no.anterior = null;

				tamanho++;
				return true;
			}
		}

		public Exerc_16_5_fila dequeue() {

			if (tamanho > 0) {
				Exerc_16_5_fila no = fim;
				fim = no.anterior;

				tamanho--;
				return no;
			}

			else return null;
		}

}
