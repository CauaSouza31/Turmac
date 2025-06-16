package Fundamentos02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
{
		        int[] a = new int[4];
		        int[] b = new int[4];
		        int[] c = new int[4];
		        int[] d = new int[4];


		        for (int i = 0; i < a.length; i++) {
		        	System.out.printf("Digite o item %d de a");
		            a[i] = input.nextInt(); 
		            System.out.printf("Digite o item %d de b");
		            b[i] = input.nextInt();       
		            System.out.printf("Digite o item %d de c");
		            c[i] = input.nextInt();
		            System.out.printf("Digite o item %d de d");
		            d[i] = input.nextInt();

		            if (i == 0) d[i] = 3;
		            else if (i == 1) d[i] = 4;
		            else d[i] = d[i - 1] + d[i - 2]; 
		        }

		        
		        System.out.println(Arrays.toString(a));
		        System.out.println(Arrays.toString(b));
		        System.out.println(Arrays.toString(c));
		        System.out.println(Arrays.toString(d));
		    }
		}

	}
