package delios.psw;
import java.util.Scanner;

public class Nome_Digitos_3_1 {
	public int numero;
	public int x;
	public Nome_Digitos_3_1(){
		this.numero=0;
	}
	
	
	
	public int escreveDigitos(int numero){
		String aux2="";
		aux2+=numero;
		int vet[]= new int[5];
		String vet2[] = new String[5];
		
			for(int i =0;i<aux2.length();i++){
	            vet[i] = aux2.charAt(i)-48;		
			
				if(vet[i]==1){
					vet2[i]="Um,";
					System.out.printf(vet2[i]);
				}
				if(vet[i] ==2){
				vet2[i]="DOIS,";
				System.out.printf(vet2[i]);
				}
				if(vet[i] ==3){
				vet2[i]="TRES,";
				System.out.printf(vet2[i]);
				
			}
				if(vet[i] ==4){
					vet2[i]="QUATRO,";
					System.out.printf(vet2[i]);
				}
				if(vet[i] ==5){
					vet2[i]="CINCO,";
					System.out.printf(vet2[i]);
				}
				if(vet[i] ==6){
					vet2[i]="SEIS,";
					System.out.printf(vet2[i]);
				}
				if(vet[i] ==7){
					vet2[i]="SETE,";
					System.out.printf(vet2[i]);
				}
				if(vet[i] ==8){
					vet2[i]="OITO,";
					System.out.printf(vet2[i]);
				}
				if(vet[i] ==9){
					vet2[i]="NOVE,";
					System.out.printf(vet2[i]);
				}
				if(vet[i] ==0){
					vet2[i]="ZERO,";
					System.out.printf(vet2[i]);
				}
		

		}
	
	return 1;
	}
}
