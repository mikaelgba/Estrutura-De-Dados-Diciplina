package PilhasEFilas;

public class ListaD {

	private No inicio = null;
	No fim = null;
	private int tamanho = 0;

	public void addInicio(Object item) {
		No novo = new No(item);
		if (isEmpty()) {
			inicio = novo;
			fim = novo;
		} else {
			inicio.setAnt(novo);// Novo vira o primeiro
			novo.setProx(inicio);//
			inicio = novo;
		}
		tamanho++;
	}

	public Object removeInicio() {

		if (isEmpty())
			return null;
		No aux = inicio;
		if (inicio.getProx() != null) {
			inicio = inicio.getProx();
			inicio.getAnt().setProx(null);
			inicio.setAnt(null);
		} else {
			inicio = null;
			fim = null;
		}
		tamanho--;
		return aux.getItem();
	}

	private boolean isEmpty() {
		return inicio == null;
	}

	public void addFim(Object item) {
		No novo = new No(item);
		if (isEmpty()) {
			inicio = novo;
			fim = novo;
		} else {
			novo.setAnt(fim);
			fim.setProx(novo);// novo recebe novo
			fim = novo;// inicio aponta para o prox // prox aponta para o fim
		}
		tamanho++;
	}

	public Object removeFim() {

		if (isEmpty())
			return null;
		No aux = fim;
		if (fim.getAnt() != null) {
			fim = fim.getAnt();
			fim.getProx().setAnt(null);
			fim.setProx(null);
		} else {
			inicio = null;
			fim = null;
		}
		tamanho--;
		return aux.getItem();
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
