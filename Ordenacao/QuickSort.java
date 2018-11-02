package Ordenacao;

import java.io.IOException;
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) throws IOException {

		System.out.println("Quick Sort in Java");
		int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };

		System.out.println(Arrays.toString(input));

		quickSort(input, 0, (input.length)-1);

		System.out.println(Arrays.toString(input));

	}
	private static void quickSort(int[] vetor, int inicio, int fim) {

		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}
	private static int separar(int vetor[], int inicio, int fim){
		
		int pivo = vetor[fim];
		int aux = inicio - 1; 
	    for( int j = inicio; j < fim; j++) {
	    	if( pivo >= vetor[j]) {
	    		aux++;
	    		int troca = vetor[aux];
	    		vetor[aux] = vetor[j];
	    		vetor[j] = troca;
	    	}
	    }
	    int troca = vetor[aux+1];
	    vetor[aux+1] = vetor[fim];
	    vetor[fim] = troca;
	    return aux +1;
	}
}