
public class TestEmpleado {
	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Andrés");
		empleado.setDocumentoDeIdentidad("30044");
		empleado.setSalario(1500);
		
		System.out.println(empleado.getBonificacion());
		
		Gerente g1 = new Gerente();
        g1.setNombre("Marco");
        g1.setDocumentoDeIdentidad("235568413");
        g1.setSalario(5000.0);

        System.out.println("Nombre del empleado: " + g1.getNombre());
        System.out.println("Documento del empleado: " + g1.getDocumentoDeIdentidad());
        System.out.println("Salario del empleado: " + g1.getSalario());

        g1.setContraseña(2222);
        boolean autenticou = g1.autenticar(2222);

        System.out.println(autenticou);

        System.out.println("La bonificación de Marco es: " + g1.getBonificacion());
        
        EditorVideo julian = new EditorVideo();
        Designer andrea = new Designer();
        
        ControlBonificacion totalBonificaciones = new ControlBonificacion();
        
        totalBonificaciones.registrar(julian);
        totalBonificaciones.registrar(andrea);
        
        System.out.println("Total bonificaciones REGISTRADAS a la fecha: " + totalBonificaciones.getSuma());
        
        Gerente rodrigo = new Gerente();
        rodrigo.setContraseña(5465);
        
        SistemaInterno sistema = new SistemaInterno();
        sistema.autenticar(rodrigo);
        
        Autenticado referencia1 = new Gerente();

        Autenticado referencia2 = new Cliente();

        Autenticado referencia3 = new Administrador();
        
        referencia1.setContraseña(443);
        referencia2.setContraseña(5465);
        
        sistema.autenticar(referencia1);
        sistema.autenticar(referencia2);
        
	}
}
