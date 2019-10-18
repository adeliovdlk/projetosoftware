package delios.psw.exer_16_3;

public class Pilha {

	No_Pilha topo;

	int tamanho;

	public Pilha() { //Construtor
		topo = null;
		tamanho = 0;
	}
	
	public int getTamanho() { 
		return tamanho; 
	}

	public boolean isVazia() { 
		/* Verificação de existência de nós na pilha */
		if (tamanho == 0) return true;
		else return false;
	}

	public boolean push(Object obj) { /* Inserir no topo da pilha */
		No_Pilha n = new No_Pilha(obj);

		/* Verificar se a pilha é vazia ou não */
		if (tamanho == 0) {
			topo = n;
			n.anterior = null;

			tamanho++;
			return true;
		}

		else {
			n.anterior = topo;
			topo = n;

			tamanho++;
			return true;
		}

	}

	public No_Pilha pop() { /* Remover do topo da pilha */
		
		/* Verificar a existência de nós no topo da pilha*/
		if (tamanho > 0) { 
			No_Pilha n = topo;
			topo = n.anterior;

			tamanho--;
			return n;
		}

		/* Pilha vazia */
		else return null;
	}
}
