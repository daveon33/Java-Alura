package models;

public class GuardadorDeCuentas {
	
	private Object[] referencias;
	private int freeIndex;
	
	public GuardadorDeCuentas() {
		this.referencias = new Object[10];
		this.freeIndex = 0;
	}
	
	public void adicionar(Object ref) {
		this.referencias[this.freeIndex] = ref;
		this.freeIndex++;
	}

	public int getCantidadDeElementos() {
		return this.freeIndex;
	}

	public Object getReferencia(int i) {
		return this.referencias[i];
	}
	
	
	
	
}
