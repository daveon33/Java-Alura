package models;

public class Gerente extends Empleado implements Autenticado {
	
	private AutenticacionUtil auth = new AutenticacionUtil();
	
	public double getBonificacion() {
		return this.getSalario() + super.getBonificacion();
	}
	
	@Override
	public void setContraseña(int contraseña) {
		this.auth.setContraseña(contraseña);
	}

	@Override
	public boolean autenticar(int contraseña) {
		return this.auth.autenticar(contraseña);
	}
}
