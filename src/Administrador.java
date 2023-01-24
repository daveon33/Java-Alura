
public class Administrador extends Empleado implements Autenticado {
	
	private int contraseña;
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return super.getBonificacion();
	}
	
	public int getContraseña() {
		return this.contraseña;
	}
	
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
