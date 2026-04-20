package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionEmpleados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre="";
		double salarioBase, bonificacion;
		List<Empleado> lista = new ArrayList<Empleado>();
		do {
			try {
			System.out.print("Nombre del empleado (o 'FIN' para salir): ");
			nombre=sc.next();
			if (!nombre.equalsIgnoreCase("fin")) {
				System.out.print("Salario Base: ");
				salarioBase=sc.nextDouble();
				if (salarioBase<=0)
					throw new SalarioInvalidoException("Error: El salario debe ser positivo");
				System.out.print("Bonificación: ");
				bonificacion=sc.nextDouble();
				if (bonificacion>salarioBase*0.5)
					throw new BonificacionInvalidaException("Error: La bonificación no puede superar el 50% del salario base");
				lista.add(new Empleado(nombre, salarioBase, bonificacion));
			}
			}catch (SalarioInvalidoException | BonificacionInvalidaException e) {
				System.out.println(e.getMessage());
				System.out.println("Introduzca los datos de nuevo");
			}
		}while (!nombre.equalsIgnoreCase("fin"));
		
		for (Empleado e: lista) {
			System.out.println(e);
		}
		
		sc.close();

	}

}
