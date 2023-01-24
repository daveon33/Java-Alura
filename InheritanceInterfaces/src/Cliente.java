
public class Cliente implements Autenticado {
	
	private int contraseña;
	
	@Override
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public boolean autenticar(int contraseña) {
		if(this.contraseña == contraseña) {
			return true;
		} else {
			return false;
		}
	}

}
