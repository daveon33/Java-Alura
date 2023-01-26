package models;

public abstract class Cuenta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Cuenta() {
		this.agencia = 1;
		this.titular = new Cliente();
	}
	
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = new Cliente();
		Cuenta.total++;
	}
	
	public abstract void depositar(double valor);
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfiere(double valor, Cuenta destino) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	//Getters and setters
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero > 0) {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
	
	
	
}
