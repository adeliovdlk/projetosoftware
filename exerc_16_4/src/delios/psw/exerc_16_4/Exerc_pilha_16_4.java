package delios.psw.exerc_16_4;

public class Exerc_pilha_16_4 {
	 private Object[] pilha;
	 private int posicaoPilha;
	 
	    public Exerc_pilha_16_4() {
	        this.posicaoPilha = -1;// indica que esta nula, vazia, pois posição um indica que contém informação
	
	        this.pilha = new Object[1000];
	// criando uma pilha com 1000 posições
	    }
	 
	    public boolean pilhaVazia() {
	        //verifica se a pilha esta vazia
	        if (this.posicaoPilha == -1) {
	            return true;
	        }
	        return false;
	    }
	 
	    public int tamanho() {
	        //is
	        if (this.pilhaVazia()) {
	            return 0;
	        }
	        return this.posicaoPilha + 1;
	    }
	 
	    public Object mostraUltimoValor() {
	        //top
	        if (this.pilhaVazia()) {
	            return null;
	        }
	        return this.pilha[this.posicaoPilha];
	    }
	 
	    public Object desempilhar() {
	        //pop
	        if (pilhaVazia()) {
	            return null;
	        }
	        return this.pilha[this.posicaoPilha--];
	    }
	 
	    public void empilhar(Object valor) {
	        // push
	        if (this.posicaoPilha < this.pilha.length - 1) {
	            this.pilha[++posicaoPilha] = valor;
	        }
	    }
	 
	   
	    
}
