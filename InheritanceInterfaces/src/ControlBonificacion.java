
public class ControlBonificacion {
	
	private double suma;

	public double getSuma() {
		return suma;
	}
	
	public void registrar(Empleado e) {
		this.suma += e.getBonificacion();
	}
}
