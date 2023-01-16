
public class Empleado {
	
	//Attributes
	
	private String nombre;
	private String documentoDeIdentidad;
	private double salario;
	
	//Método principal
	
	public double getBonificacion() {
		return this.salario * 0.1;
	}
	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumentoDeIdentidad() {
		return documentoDeIdentidad;
	}
	public void setDocumentoDeIdentidad(String documentoDeIdentidad) {
		this.documentoDeIdentidad = documentoDeIdentidad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
