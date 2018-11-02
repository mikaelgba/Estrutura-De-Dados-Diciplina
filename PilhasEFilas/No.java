package PilhasEFilas;

public class No {
	
	private No prox; No ant;
	private Object item;
	
	public No(Object item) {
		this.item = item;
		prox = null;
		ant = null;
	}

	public No getProx() {
		return prox;
	}

	public No getAnt() {
		return ant;
	}

	public void setAnt(No ant) {
		this.ant = ant;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	

}
