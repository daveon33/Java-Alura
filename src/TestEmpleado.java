
public class TestEmpleado {
	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Andrés");
		empleado.setDocumentoDeIdentidad("30044");
		empleado.setSalario(30000034);
		
		System.out.println(empleado.getBonificacion());
		
		Gerente gerente = new Gerente();
		gerente.setNombre("David");
		gerente.setDocumentoDeIdentidad("111002");
		gerente.setSalario(122993939);
		gerente.setContraseña(20384);
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.autenticar(20389));
	}
}
