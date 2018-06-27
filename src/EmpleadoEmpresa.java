import java.util.ArrayList;

public class EmpleadoEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado em1 = new Empleado("Pedro",20,30);
		Empleado em2 = new Empleado("Jose",25,30);
		Empleado em3 = new Empleado("Juan",30,30);
		Empleado em4 = new Empleado("Andres",35,30);
		Empleado em5 = new Empleado("Fabio",38,30);
		Empleado em6 = new Empleado("Pedro",42,30);
		
		ArrayList <Empleado> losEmpleados = new ArrayList<Empleado>();
		losEmpleados.add(em1);
		losEmpleados.add(em2);
		losEmpleados.add(em3);
		losEmpleados.add(em4);
		losEmpleados.add(em5);
		losEmpleados.add(em6);
		
		Empresa empresaGrande = new Empresa(losEmpleados);
		System.out.println("Toda la empresa   : ");
		empresaGrande.mostrarPorConsola();
		Empresa empresaDeSeniors = new Empresa(empresaGrande.getEmpleadosAdultos());
		System.out.println("Empresa de seniors: ");
		empresaDeSeniors.mostrarPorConsola();
	}

}

