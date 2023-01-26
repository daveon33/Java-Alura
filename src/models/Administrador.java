package models;

public class Administrador extends Empleado implements Autenticado {

	private AutenticacionUtil auth;
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return super.getBonificacion();
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
