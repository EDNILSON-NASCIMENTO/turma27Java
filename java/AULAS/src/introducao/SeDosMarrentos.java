package introducao;

import java.util.Scanner;

public class SeDosMarrentos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		int valor = leia.nextInt();
		
		
		System.out.println( ((valor%2)==0)?"NUMERO � PAR!!!":"NUMERO � IMPAR");
		//LAMBDA
				
		/*
		if ((valor%2)==0) {
			System.out.println("Numero � par!!!");
		} 
		else {
			System.out.println("Numero � impar!!!");
		}
		*/
		

		
	}

}
