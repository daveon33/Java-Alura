
public class Gerente extends Empleado implements Autenticado {
	
	private int contraseña;
	
	@Override
	public boolean autenticar(int contraseña) {
		
		if(this.contraseña == contraseña) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacion() {
		return this.getSalario() + super.getBonificacion();
	}
	
	@Override
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
}
