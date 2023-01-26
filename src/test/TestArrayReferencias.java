package test;

import models.*;

public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		
		CuentaCorriente cc1 = new CuentaCorriente(2, 10);
		CuentaCorriente cc2 = new CuentaCorriente(3, 11);
		
		cuentas[0] = cc1;
		cuentas[1] = cc2;
		
		System.out.println(cuentas[0].getNumero());
	}
}
