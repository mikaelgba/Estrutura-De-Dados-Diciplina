package PilhasEFilas;

public class ListaS {
	
	private No inicio = null; No fim = null;
	private int tamanho = 0;
	
	public void addInicio(Object item) {
		No novo = new No(item);
		if(isEmpty()) {
			inicio = novo;
			fim = novo;
		}else {
			novo.setProx(inicio);// novo recebe novo
			inicio = novo;//inicio aponta para o prox // prox aponta para o fim	
		}
		tamanho ++;
	}
	public Object removeInicio() {
		
		if (isEmpty()) return null;
		No aux = inicio;
		inicio = aux.getProx(); // inicio = prox
		aux.setProx(null);
		tamanho --;
		return aux.getItem();
	}
	
	private boolean isEmpty() {
		return inicio == null;
	}
	
	public void addFim(Object item) {
		No novo = new No(item);
		if(isEmpty()) {
			inicio = novo;
			fim = novo;
		}else {
			fim.setProx(novo);// novo recebe novo
			fim = novo;//inicio aponta para o prox // prox aponta para o fim	
		}
		tamanho ++;
	}
	
	public Object removeFim() {
		
		if (isEmpty()) return null;
		No aux = inicio;
		while(aux != null) {
			if(aux.getProx().getProx() == null) { // verifica se o proximo do ultimo esta vazio
				No aux2 = fim;
				fim = aux;
				fim.setProx(null);// elimita a ligação ao ultimo No
				return aux2.getItem();
			}
			return aux.getItem();
		}
		return null;
	}
	
	public No getInicio() {
		return inicio;
	}
	public void setInicio(No inicio) {
		this.inicio = inicio;
	}
	public No getFim() {
		return fim;
	}
	public void setFim(No fim) {
		this.fim = fim;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
