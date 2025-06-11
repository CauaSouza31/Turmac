package aula01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Digite 'F' para feminino ou 'M' para masculino: ");
		 char letra = input.nextLine().toUpperCase().charAt(0);
		 
		 if (letra == 'F') {
			 System.out.println("F - Feminino");
		 }
		 else if(letra == 'M'){
	        System.out.println("M - Masculino");
		 }
	        else {
	            System.out.println("Entrada inválida! Digite apenas F ou M.");
	        }
		 input.close();
		 
		 
	

	}

}
