package models;

public class SistemaInterno {
	
	private int contraseña = 5465;
	
	public void autenticar(Autenticado g) {
		
		boolean autenticado = g.autenticar(this.contraseña);
		
		if(autenticado) {
			System.out.println("Puede entrar");
		} else {
			System.out.println("No puede entrar");
		}
	}
}
