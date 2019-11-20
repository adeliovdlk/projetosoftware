package delios.psw.exerc_16_4;


	import java.util.Iterator;

	import delios.psw.colecao;
	public class Exerc_pilha_16_4 <B> implements Iterable<B>{
		

		private class NoLista {
			NoLista proximo;
			B obj;

			/* Construtores */

			NoLista(){
				this.proximo = null;
				this.obj = null;
			}

			NoLista(B obj){
				this.proximo = null;
				this.obj = obj;
			}
		}


		private class Iterador implements InteradorAbstrato<B> {
			private NoLista noAtual;

			Iterador(NoLista no) {
				noAtual = no;
			}

			@Override
			public boolean proximo() {
				if(noAtual == null)
					return false;

				noAtual = noAtual.proximo;
				return true;
			}

			@Override
			public boolean anterior() {
				return false;
			}

			@Override
			public E dadoAtual() {
				if(noAtual == null)
					return null;
				return noAtual.obj;
			}

		}

		/* Classe privativa derivada do Collection */

		private class IteradorJava implements Iterator<E> {
			private NoLista noAtual;
			private NoLista noAnterior;

			IteradorJava(NoLista no) {
				noAtual = no;
				noAnterior = new NoLista();
				noAnterior.proximo = no;
			}

			@Override
			public boolean hasNext(){
				if(noAtual.proximo == null)
					return false;

				return true;
			}

			@Override
			public E next(){
				if(noAtual.proximo == null){
					if (noAnterior.proximo == null)
						return null;

					else 
						noAtual = noAnterior.proximo;
				}

				else {
					noAnterior = noAtual;
					noAtual = noAtual.proximo;
				}
				
				return noAtual.obj;
			}

			@Override
			public void remove(){
				if (noAtual != null){
					noAnterior.proximo = noAtual.proximo;

					noAtual = null;
				}
			}

		}

		/* Objetos */

		NoLista topo;

		int tamanho;

		/* Construtores */

		public Pilha() {
			topo = null;

			tamanho = 0;
		}

		/* Getters e Setters */

		public int getTamanho() { return tamanho; }

		/* M�todos */

		public boolean isVazia() { 
			/* Verifica��o de exist�ncia de n�s na lista */
			if (tamanho == 0) return true;
			else return false;
		}

		public IteradorAbstrato<E> getIteradorInicio() {
			Iterador it = new Iterador(topo);
			return it;
		}
		
		public IteradorAbstrato<E> getIteradorFim() {
			return new Iterador(topo);
		}

		public Iterator<E> iterator(){
			return new IteradorJava(topo);
		}

		public boolean inserir(E obj) {

			NoLista n = new NoLista(obj);
			
			/* Primeira inser��o */
			if (tamanho == 0) { 

				topo = n;

				tamanho++;
				return true;
			}

			/* Inser��o no topo da pilha */
			else { 
				
				n.proximo = topo;			
				topo = n;

				tamanho++;
				return true;
			}

		}

		public boolean remover() {
			boolean flag = false; /* Vari�vel para controle de remo��o */

			/* Remo��o em lista vazia */
			if (tamanho == 0)
				return flag;

			/* Busca pela posi��o do objeto espec�fico */
			else { 
				NoLista it = topo;
				
				/* Remo��o em lista unit�ria */
				if (tamanho == 1) {
					topo = null;
				}

				/* Remo��o do topo */
				else if (it == topo) {
					topo = topo.proximo;
				}

				tamanho--;
				flag = true;
			}

			return flag;

		}
	}
