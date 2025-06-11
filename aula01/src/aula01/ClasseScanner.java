package aula01;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp = input.nextDouble();
		System.out.println(resp);
	}

}
