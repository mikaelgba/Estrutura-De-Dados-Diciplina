package Ordenacao;

import java.io.IOException;
import java.util.Arrays;

public class BuscaBinaria {

	public static void main(String[] args) throws IOException {

		System.out.println("Busca Binaria in Java");
		int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };

		System.out.println(Arrays.toString(input));
		SelectionSort.selectionSort(input);

		System.out.println(Arrays.toString(input));
		System.out.println(buscaBinaria(input, 20));

	}
	public static boolean buscaBinaria(int[] input, int k) {

		int meio;
		int inicio = 0;
		int fim = (input.length) - 1;
		
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (k < input[meio]) {
				fim = meio - 1;
			} else if (k > input[meio]) {
				inicio = meio + 1;
			} else {
				return true;
			}
		}
		return false;
	}
}
