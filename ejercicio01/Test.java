package ejercicio01;

public class Test {

	public static void main(String[] args) {
		DivisionPorCero dpc = new DivisionPorCero();
		int resultado = dpc.division(10,0);
		if (resultado>=0)
			System.out.println("Resultado: "+resultado);
		System.out.println("\tVolviendo de main");
	}

}
