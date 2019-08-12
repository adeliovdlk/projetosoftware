//exer 2.3
package psw.delios;

import java.util.Scanner;


public class Produto {
	public int x;
	public int y;
	public int z;

 
 public int Le_CalculaProduto(){		
	 int produto;
	 Scanner sc = new Scanner (System.in);
		Produto obj = new Produto();
		System.out.println("entre com tres valores \n");
		
		obj.x = sc.nextInt();
		obj.y = sc.nextInt();
		obj.z = sc.nextInt();
	 
	 produto = obj.x *obj.y*obj.z;
	 System.out.printf("o produto de %d x %d x %d e: \t %d \n",obj.x,obj.y,obj.z,produto);
	 return produto;
 }

}
