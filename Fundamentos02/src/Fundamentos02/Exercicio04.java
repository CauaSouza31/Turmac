package Fundamentos02;

public class Exercicio04 {

	public static void main(String[] args) {
      int somaMultiplos3 = 0;
	  int somaMultiplos5 = 0;
	  int somaTotal = 0;
	  
	  for (int i = 1; i <= 20; i++) {
          somaTotal += i;

          if (i % 3 == 0) {
              somaMultiplos3 += i;
          }

          if (i % 5 == 0) {
              somaMultiplos5 += i;
          }
      }

      int somaAmbos = somaMultiplos3 + somaMultiplos5;

      System.out.println("Soma dos multiplos de 3: " + somaMultiplos3);
      System.out.println("Soma dos multiplos de 5: " + somaMultiplos5);
      System.out.println("Soma dos multiplos de 3 + 5 (com duplicação): " + somaAmbos);
      System.out.println("Soma total de 1 a 20: " + somaTotal);
  }
}

		    