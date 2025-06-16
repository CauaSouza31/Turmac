package aula01;

import java.util.Scanner;

public class Exercico10 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int respostas = 0;

		        System.out.println("Responda com 'sim' ou 'não':");

		        System.out.print("Telefonou para a vítima? ");
		        if (scanner.nextLine().equalsIgnoreCase("sim")) respostas++;

		        System.out.print("Esteve no local do crime? ");
		        if (scanner.nextLine().equalsIgnoreCase("sim")) respostas++;

		        System.out.print("Mora perto da vítima? ");
		        if (scanner.nextLine().equalsIgnoreCase("sim")) respostas++;

		        System.out.print("Devia para a vítima? ");
		        if (scanner.nextLine().equalsIgnoreCase("sim")) respostas++;

		        System.out.print("Já trabalhou com a vítima? ");
		        if (scanner.nextLine().equalsIgnoreCase("sim")) respostas++;

		        if (respostas == 2) {
		            System.out.println("Suspeita");
		        } else if (respostas == 3 || respostas == 4) {
		            System.out.println("Cúmplice");
		        } else if (respostas == 5) {
		            System.out.println("Assassino");
		        } else {
		            System.out.println("Inocente");
		        }

		        scanner.close();
		    }
		    }
		}

	}

}
