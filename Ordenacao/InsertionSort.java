package Ordenacao;

import java.io.IOException;
import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) throws IOException {

		System.out.println("Insertion Sort in Java");
	    int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };

	    System.out.println(Arrays.toString(input));

	    insertionSort(input);

	    System.out.println(Arrays.toString(input));

	}
	public static void insertionSort( int [] vetor) {
		
		int troca = 0;
		for( int i = 0; i < vetor.length; i++) {
			for( int j = i; j > 0; j--) {
				if( vetor[j] < vetor[j-1]) {
					troca = vetor[j];
					vetor[j] = vetor[j-1];
					vetor[j-1] = troca;
				}
			}
		}
	}
}
