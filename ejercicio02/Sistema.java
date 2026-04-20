package ejercicio02;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		final int TAMANHO = 10;
		Mundo[] planetas = new Mundo[TAMANHO];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < TAMANHO; i++) {
			System.out.print("Nombre del planeta: ");
			String nombre = sc.nextLine();
			try {
				System.out.print("Diámetro del planeta: ");
				float diametro = Float.parseFloat(sc.nextLine());
				if (diametro <= 0)
					throw new ValorNegativoException("Valor:" + diametro);
				planetas[i] = new Mundo(nombre, diametro, false);
			} catch (NumberFormatException e) {
				i--;
				System.out.println("Debe introducir un número");
			} catch (ValorNegativoException e) {
				i--;
				System.out.println("Debe introducir un número positivo");
			}
		}
		sc.close();
		int indice = 0;
		boolean encontrado=false;
		while (!encontrado) {
			try {
				if (planetas[indice].getDiametro() < 20)
					throw new DiametroInferiorException("Valor inferior a 20Km: " + planetas[indice].getDiametro());
				else if (planetas[indice].getDiametro() > 100)
					throw new DiametroSuperiorException("Valor superior a 100km: "+ planetas[indice].getDiametro());
				System.out.println(planetas[indice]);
			} catch (DiametroInferiorException e) {
				System.out.println(e.getMessage());
				System.out.println(planetas[indice]);
			} catch (DiametroSuperiorException e) {
				System.out.println(e.getMessage());
				encontrado=true;
				System.out.println(planetas[indice]);
			} catch (Exception e) {
				System.out.println("HA OCURRIDO UNA EXCEPCIÓN");
			} finally {
				indice++;
			}
		}
	}

}
