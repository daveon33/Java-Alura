package test;

import models.*;

public class TestGuardadorCuentas {
	
	public static void main(String[] args) {
		
		GuardadorDeCuentas guardador = new GuardadorDeCuentas();
		
		Cuenta cc = new CuentaCorriente(21, 34);
		guardador.adicionar(cc);
		
		Cuenta cc2 = new CuentaCorriente(21, 33);
		guardador.adicionar(cc2);
		
		int currentSize = guardador.getCantidadDeElementos();
		System.out.println(currentSize);
		
		Cuenta ref = (Cuenta) guardador.getReferencia(0);
		System.out.println(ref.getNumero());
		
	}
}
