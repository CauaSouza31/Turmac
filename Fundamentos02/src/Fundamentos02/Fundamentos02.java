package Fundamentos02;

import java.util.Scanner;

public class Fundamentos02 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Digite a quantidade de alunos que tem na sala: ");
	     int alunosRestantes = input.nextInt();
	     double SomaNotas=0;
	     int contador=0;
	     
	     while(contador < alunosRestantes) {  
	    	 System.out.print("Digite a nota de um aluno: ");
	    	 double nota = input.nextDouble();
	         SomaNotas += nota;
	         contador++;
	     }
	     double media = SomaNotas / alunosRestantes;
	     System.out.println(media>= 7 ? "Turma aprovada":"turma");
	     
	     

		
	}

}
