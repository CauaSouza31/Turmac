package aula01;

import java.util.Scanner;

public class Exercico10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int respostas = 0;

        System.out.println("Responda com sim ou não:");

        System.out.print("Telefonou para a vítima? ");
         r1 = scanner.next().toUpperCase();
        if (r1 == 'sim') respostas++;

        System.out.print("Esteve no local do crime? ");
        char r2 = scanner.next().toUpperCase().charAt(0);
        if (r2 == 'sim') respostas++;

        System.out.print("Mora perto da vítima? ");
        char r3 = scanner.next().toUpperCase().charAt(0);
        if (r3 == '') respostas++;

        System.out.print("Devia para a vítima? ");
        char r4 = scanner.next().toUpperCase().charAt(0);
        if (r4 == 'S') respostas++;

        System.out.print("Já trabalhou com a vítima? ");
        char r5 = scanner.next().toUpperCase().charAt(0);
        if (r5 == 'S') respostas++;

        if (respostas == 2) {
            System.out.println("Suspeita");
        } else if (respostas == 3 && respostas == 4) {
            System.out.println("Cúmplice");
        } else if (respostas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        scanner.close();

	
	}

}
