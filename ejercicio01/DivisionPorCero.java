package ejercicio01;

public class DivisionPorCero {

	public int division(int num1, int num2) {
		int resultado = -1;
		try {
			if (num2 == 0) {
				throw new ExcepcionDeDivisionPorCero("/ por 0");
			} else {
				resultado = num1/num2;
			}
		} catch (ExcepcionDeDivisionPorCero e) {
			System.out.println("Trata ExcepcionDeDivisionPorCero: " + e.getMessage());
		} finally {
			System.out.println("Finally hecho");
		}
		System.out.println("Volviendo de división");
		return resultado;
	}

}
