package Ordenacao;
import java.io.IOException;
import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) throws IOException {

	    System.out.println("Selection Sort in Java");
	    int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };
	    System.out.println(Arrays.toString(input));
	    selectionSort(input);
	    System.out.println(Arrays.toString(input));
	}	
	public static void selectionSort( int [] vetor) {		
		for( int i = 0; i < vetor.length - 1; i++) {
			int menor = i;
			for( int j = i + 1; j < vetor.length; j++) {
				if( vetor[menor] > vetor[j]) {
					menor = j;
				}
			}
			int troca = vetor[menor];
			vetor[menor] = vetor[i];
			vetor[i] = troca;
		}
	}
}
