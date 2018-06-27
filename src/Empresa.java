import java.util.ArrayList;

public class Empresa {
	ArrayList<Empleado> empleados;
	public Empresa(ArrayList<Empleado> empleados)
	{
		this.empleados = empleados;
	}
	public void mostrarPorConsola()
	{
		float suma=0;
		for (Empleado item : empleados)
			{
			System.out.println("Nombre : "+item.getNombre());
			System.out.println("Edad   : "+item.getEdad());
			System.out.println("Salario: "+item.getSalario());
			System.out.println();
			suma+=item.getSalario();
			}
		System.out.println("");
		System.out.println("Suma salarios: "+suma);
	}
	public ArrayList<Empleado> getEmpleadosAdultos() {
		ArrayList<Empleado> listaMayores = new ArrayList<Empleado>();
		for (Empleado e : empleados)
		{
			if (e.esMayorDeEdad())
			{
				listaMayores.add(e);
			}
		}
		return listaMayores;
	}
}
