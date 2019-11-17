package delios.psw.exerc_16_5_fila;



public class No_fila {
	
		No_fila anterior;
		Object obj;

		No_fila() {
			this.anterior = null;
			this.obj = null;
		}

		No_fila(Object obj) {
			this.anterior = null;
			this.obj = obj;
		}

		No_fila(No_fila anterior, Object obj) {
			this.anterior = anterior;
			this.obj = obj;
		}

}
