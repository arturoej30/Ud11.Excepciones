package ejercicio4;

public class Empleado {
	private String nombre;
	private double salarioBase;
	private double bonificacion;
	
	public Empleado(String nombre, double salarioBase, double bonificacion) {
		super();
		this.nombre = nombre;
		this.salarioBase = salarioBase;
		this.bonificacion = bonificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}

	@Override
	public String toString() {
		return "Empleado: "+this.nombre+"\nSalario Base: "+this.salarioBase+"\nBonificación: "+this.bonificacion+
				"\nSalario Total: "+(salarioBase+bonificacion);
	}

}
