package Ordenacao;

import java.util.Arrays;

public class CoutingSort {
	
	public static void main(String[] args) {

	    System.out.println("Counting sort in Java");
	    int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };
	    int k = 60;

	    System.out.println(Arrays.toString(input));

	    countingSort(input, k);

	   
	    System.out.println(Arrays.toString(input));

	  }
	public static void countingSort( int [] vetor, int k) {
		
		int [] aux = new int[k+1];
		for( int i: vetor) {
			aux[i]++;
		}
		int aux2 = 0;
		for( int j = 0; j < vetor.length; j++) {
			while(aux[j] > 0) {
				vetor[aux2] = j;
				aux[j]--;	
			}
		}
	}
}
