package models;

public class GuardadorDeCuentas {
	
	private Cuenta[] referencias;
	private int freeIndex;
	
	public GuardadorDeCuentas() {
		this.referencias = new Cuenta[10];
		this.freeIndex = 0;
	}
	
	public void adicionar(Cuenta ref) {
		this.referencias[this.freeIndex] = ref;
		this.freeIndex++;
	}

	public int getCantidadDeElementos() {
		return this.freeIndex;
	}

	public Cuenta getReferencia(int i) {
		return this.referencias[i];
	}
	
	
	
	
}
