package delios.psw.exer_16_3;

public class No_Pilha {
	No_Pilha anterior;
	Object obj;

	

	No_Pilha(){
		this.anterior = null;
		this.obj = null;
	}

	No_Pilha(Object obj){
		this.anterior = null;
		this.obj = obj;
	}

	No_Pilha(No_Pilha anterior, Object obj){
		this.anterior = anterior;
		this.obj = obj;
	}

}
