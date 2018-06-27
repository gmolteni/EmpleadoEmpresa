public class Empleado {
	String nombre;
	int edad;
	float salario;
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public float getSalario() {
		return salario;
	}	
	public Empleado(String nombre, int edad, float salario)
	{
		this.nombre=nombre; this.edad = edad; this.salario = salario;
	}
	public boolean esMayorDeEdad()
	{
		return (edad>=30);
	}
}
