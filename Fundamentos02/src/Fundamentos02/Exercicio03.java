package Fundamentos02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos alunos tem na sala? ");
        int totalAlunos = input.nextInt();
        double somaNotas = 0;
        for (int i = 1; i <= totalAlunos; i++) {
         System.out.print("Digite a nota do aluno " +i+":");
          double nota = input.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / totalAlunos;
        System.out.println("Média da turma: " + media);

        input.close();
		

	}

}
