package delios.psw.aplicacao;

import delios.psw.colecao.*;

import java.awt.List;

import delios.psw.geometria.Ponto2D;

	public class Aplicacao {

		public static void main(String[] args) {
			
			ListaEncadeada lista = new ListaEncadeada();
			
			
			Ponto2D ponto = new Ponto2D(5,5);
			lista.inserir(ponto, 0);
			
			ponto = new Ponto2D(6,7);
			lista.inserir(ponto, 1);
			
			System.out.println("Tamanho " + lista.getTamanho());
			System.out.println("Pos 0 - " + lista.pesquisar(0));
			System.out.println("Pos 1 - " + lista.pesquisar(1));
			
			lista.remover(0);
			
			System.out.println("Tamanho " + lista.getTamanho());
			System.out.println("Pos 0 - " + lista.pesquisar(0));
			
			lista.remover(0);
			
			System.out.println("Tamanho " + lista.getTamanho());
			
			for(int i = 10; i < 25; i++) {
				ponto = new Ponto2D(i, i+55);
				lista.inserir(ponto, 0);
			}
			
			InteradorAbstrato <PONTO2D> it = lista.getIteradorInicio();
			do {
				System.out.println(it.dadoAtual());
			} while(it.proximo());
			List <Ponto2D> i= new LinkedList<PONTO2D>();
			i.add(new Ponto2D(1,1));
			i.add(new Ponto2D(1,2));
			i.add(new Ponto2D(1,3));
			for (Ponto2D p :i )
				System.out.println(p);	
			
		}

}
