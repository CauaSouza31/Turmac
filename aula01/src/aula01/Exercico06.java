package aula01;

import java.util.Scanner;

public class Exercico06 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        
	        System.out.println("Digite um número (1-7) para ver o dia correspondente:");
	        int numero = input.nextInt();
	        
	        String dia;
	        
	        switch (numero) {
	            case 1:
	                dia = "Domingo";
	                break;
	            case 2:
	                dia = "Segunda-feira";
	                break;
	            case 3:
	                dia = "Terça-feira";
	                break;
	            case 4:
	                dia = "Quarta-feira";
	                break;
	            case 5:
	                dia = "Quinta-feira";
	                break;
	            case 6:
	                dia = "Sexta-feira";
	                break;
	            case 7:
	                dia = "Sábado";
	                break;
	            default:
	                dia = "Dia inválido";
	        }
	        
	        System.out.println("Dia da semana: " + dia);
	        input.close();
		

	}

}
