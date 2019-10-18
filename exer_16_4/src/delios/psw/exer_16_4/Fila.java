package delios.psw.exer_16_4;

public class Fila {
	NoFila inicio;
	NoFila fim;

	int tamanho;

	public Fila() {
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
		NoFila no = new NoFila(obj);

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

	public NoFila dequeue() {

		if (tamanho > 0) {
			NoFila no = fim;
			fim = no.anterior;

			tamanho--;
			return no;
		}

		else return null;
	}

}
