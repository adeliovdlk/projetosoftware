package delios.psw.exec_4_3;

public class Exerc_4_3 {

	public int x;

	public Exerc_4_3(){
		this.x=0;
	}
	public void decrementa(int x){
		//System.out.println(x)
		while(x != 1) {
			if(x % 2 ==0) {
				x = x / 2;
			}else {
				x = ((2 * x) / 3) + 1;
			}
			System.out.println(x);		
		}
	}
	public void printa(int x){
		System.out.println(x);
	}
}
	
