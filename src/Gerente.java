
public class Gerente extends Empleado {
	
	private int contraseña;
	
	public boolean autenticar(int contraseña) {
		
		if(this.contraseña == contraseña) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
}
