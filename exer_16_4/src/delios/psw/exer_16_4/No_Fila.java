package delios.psw.exer_16_4;

public class No_Fila {
	No_Fila anterior;
	Object obj;

	No_Fila() {
		this.anterior = null;
		this.obj = null;
	}

	No_Fila(Object obj) {
		this.anterior = null;
		this.obj = obj;
	}

	No_Fila(No_Fila anterior, Object obj) {
		this.anterior = anterior;
		this.obj = obj;
	}

}
