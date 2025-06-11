package aula01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		
		 System.out.println("Digite o 1 numero: ");
		 num1 = input.nextInt();
		 System.out.println("Digite o 2 numero: ");
	     num2 = input.nextInt();
	     System.out.println("Digite o 3 numero: ");
	     num3 = input.nextInt();
	     
	     int maior;
	     if (num1 >= num2 && num1 >= num3) {
	         maior = num1;
	     } else if (num2 >= num1 && num2 >= num3) {
	         maior = num2;
	     } else {
	         maior = num3;
	     }

	    int menor;
	    if (num1 <= num2 && num1 <= num3) {
	    	menor = num1;
	    } else if (num2 <= num1 && num2 <= num3) {
	        menor = num2;
	    } else {
	    	menor = num3;
	    }
	    
	    System.out.println("Maior numero: "+maior);
	    System.out.println("Menor numero: "+menor);
	    
	    input.close();
	}

}
