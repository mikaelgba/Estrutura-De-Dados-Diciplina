package PilhasEFilas;

public class Pilha {

	public Object[] vetor;
	public int ponteiro;

	// Contrutor da Pilha
	public Pilha() {

		this.ponteiro = -1;
		this.vetor = new Object[100];
	}

	// Metodo para Verificar se a pilha estavazia
	public boolean isEmpty() {

		if (this.ponteiro == -1)
			return true;
		return false;
	}

	// Metodo para dizer o tamanho do ponteiro Vetor
	public int size() {

		if (this.isEmpty())
			return 0;
		return this.ponteiro + 1;
	}

	// Metodo que retorna o ultimo valor empilhado sem tirar ele
	public Object top() {

		if (this.isEmpty())
			return null;
		return this.vetor[this.ponteiro];
	}

	// Metodo que retira um item no vetor
	public Object pop() {

		if (this.isEmpty())
			return null;
		return this.vetor[this.ponteiro--];
	}

	// Metodo que adiciona algo ao vetor
	public void push(Object valor) {

		if (this.ponteiro < this.vetor.length - 1)
			this.vetor[++ponteiro] = valor;
	}
	public static void main(String[] args) {
		
		Pilha p = new Pilha();
		p.push(10);
		p.push("1");
		
		while(p.isEmpty() == false) {
			System.out.println(p.pop());
		}
	}
}
