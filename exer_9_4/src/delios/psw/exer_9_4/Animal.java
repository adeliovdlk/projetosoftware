package delios.psw.exer_9_4;

public abstract class Animal {
private boolean vertebrado;

	
	public Animal(boolean vertebrado) {
		super();
		this.vertebrado = true;
	}
	
	@Override
	public String toString() {
		return "\nVertebrado: " + vertebrado + super.toString();
	}	
}
