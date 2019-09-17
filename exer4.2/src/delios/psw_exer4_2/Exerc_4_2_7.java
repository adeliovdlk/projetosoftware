package delios.psw_exer4_2;

public class Exerc_4_2_7 {

	public static void main(String[] args) {
		int F=0,ant=0;
		
		for (int i = 1; i <= 100; i++) {
			  
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
            System.out.printf("%d\n",F);
        }   
    }	
}


