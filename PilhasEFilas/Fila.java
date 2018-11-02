package PilhasEFilas;

public class Fila {
	
	private Object[] valores;
	private int primeiro;
	private int ultimo;
	private int total;
	
	public Fila(){
		this.valores = new  Object[100];
		this.primeiro = 0;
		this.ultimo = 0;
		this.total = 0;	
	}
	// Adiciona ao vetor
	public void inserir (  Object a ) {
		
		if(isFull()) throw new RuntimeException("Fila Cheia! ");
		this.valores[ultimo] =  a;
		this.ultimo = (ultimo + 1) % valores.length;
		this.total ++;	
	}
	//Retira do Vetor
	public Object retirar() {
		
		if(isEmpty()) throw new RuntimeException("Fila Vazia!");
		Object valor = valores[primeiro];
		this.primeiro = (primeiro + 1) % valores.length;
		this.total --;
		return valor;
	}
	//Verifica se esta vazia
	public boolean isEmpty() {
		
		return total==0;
	}
	//Verifica se esta cheira
	public boolean isFull() {
		
		return total==valores.length;
	}
	
	public static void main ( String[] args) {
		
		Fila f = new Fila();
		
		f.inserir(10);
		f.inserir("a");
		
		while(f.isEmpty() == false) {
			Object x = f.retirar();
			System.out.println(x);
		}
	}
	
}
