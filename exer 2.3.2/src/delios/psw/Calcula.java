package delios.psw;
import java.util.Scanner;

public class Calcula {//exer 2_3_2
	
	public int x;
	public int y;
	
	public void  le_Calcula_Printa(){
    Scanner sc = new Scanner (System.in);
	Calcula obj = new Calcula();
	
	System.out.println("entre com dois valores \n");
	obj.x = sc.nextInt();
	obj.y = sc.nextInt();

			int soma= obj.x+obj.y;
			System.out.printf("\t a soma de     %d + %d e: \t %d \n",obj.x,obj.y,soma);
			
			 int produto;
			 produto = obj.x *obj.y;
			 System.out.printf("\t o produto de %d x %d e: \t %d \n",obj.x,obj.y,produto);
					
			int dif= obj.x-obj.y;
			System.out.printf("\t a diferenca de %d - %d e: \t %d \n",obj.x,obj.y,dif);
			
			int quo= obj.x/obj.y;
			System.out.printf("\t o quociente de %d / %d e: \t %d \n",obj.x,obj.y,quo);
			
		}
}
		
	



	/*
	public int retornaSoma(int x,int y){
		int soma= x+y;
		System.out.printf("\t a soma de     %d + %d e: \t %d \n",x,y,soma);
		return soma;
	}
	public int CalculaProduto(int x, int y){		
		
		 int produto;
		 produto = x *y;
		 System.out.printf("\t o produto de %d x %d e: \t %d \n",x,y,produto);
		 return produto;
	}
	public int retornaDiferenca(int x, int y){
		int dif= x-y;
		System.out.printf("\t a diferenca de %d - %d e: \t %d \n",x,y,dif);
		return dif;
		 
	}
	public int retornaQuociente(int x, int y){
		int quo= x/y;
		System.out.printf("\t o quociente de %d / %d e: \t %d \n",x,y,quo);
		return quo;
	}*/
	

