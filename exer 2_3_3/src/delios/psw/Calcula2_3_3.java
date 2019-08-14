package delios.psw;
import java.util.Scanner;
public class Calcula2_3_3 {
	public int x;
	public int y;
	public int z;

	public void le_Calcula_printa(){
		
		Scanner sc = new Scanner (System.in);
		Calcula2_3_3 obj = new Calcula2_3_3();
		System.out.println(" \n");
		
		System.out.println("\t entre com tre inteiros \n");
		obj.x = sc.nextInt();
		obj.y = sc.nextInt();
		obj.z = sc.nextInt();
		
		int soma= obj.x+obj.y+obj.z;
		System.out.printf("\t a soma de %d +%d + %d e: \t %d \n",obj.x,obj.y,obj.z,soma);
		
		
		int media= (obj.x+obj.y+obj.z)/3;
		System.out.printf(" \t a media de %d + %d + %d e: \t %d \n",obj.x,obj.y,obj.z,media);
		 
		
		
		int produto = obj.x *obj.y*obj.z;
		System.out.printf("\t o produto de %d x %d x %d e: \t %d \n",obj.x,obj.y,obj.z,produto);
		
		//maior
					
		if ( obj.x > obj.y &&obj.x >obj.z)
			System.out.printf("\t o  %d e o maior valor\n",obj.x);
		
		if (obj.y > obj.x && obj.y >obj.z)		
			System.out.printf("\t o  %d e o maior valor\n",obj.y);
		
		if (obj.z> obj.x && obj.z >obj.y)
			System.out.printf("\t o  %d e o maior valor\n",obj.z);
		
		//menor
		if ( obj.x < obj.y &&obj.x <obj.z)
			System.out.printf("\t o  %d e o menor valor\n",obj.x);
		
		if (obj.y < obj.x && obj.y <obj.z)		
			System.out.printf("\t o  %d e o menor valor\n",obj.y);
		
		if (obj.z< obj.x && obj.z <obj.y)
			System.out.printf("\t o  %d e o menor valor\n",obj.z);
		
					
			
	}
		 
}
	
	
	
		

	
	
	
	
	
	


