
public class TestEmpleado {
	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Andrés");
		empleado.setDocumentoDeIdentidad("30044");
		empleado.setSalario(30000034);
		
		System.out.println(empleado.getBonificacion());
		
		Gerente g1 = new Gerente();
        g1.setNombre("Marco");
        g1.setDocumentoDeIdentidad("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNombre());
        System.out.println(g1.getDocumentoDeIdentidad());
        System.out.println(g1.getSalario());

        g1.setContraseña(2222);
        boolean autenticou = g1.autenticar(2222);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacion());
        
        EditorVideo julian = new EditorVideo();
        Designer andrea = new Designer();
        
        ControlBonificacion totalBonificaciones = new ControlBonificacion();
        
        totalBonificaciones.registrar(julian);
        totalBonificaciones.registrar(andrea);
        
        System.out.println("Total bonificaciones REGISTRADAS a la fecha: " + totalBonificaciones.getSuma());
	}
}
