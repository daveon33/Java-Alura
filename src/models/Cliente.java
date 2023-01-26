package models;

public class Cliente implements Autenticado {
	
	private AutenticacionUtil auth;
	
	public Cliente() {
		this.auth = new AutenticacionUtil();
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
