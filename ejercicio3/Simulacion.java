package ejercicio3;

import java.util.Random;

public class Simulacion {
	public static void main(String[] args) {
		Random r = new Random();
		int vecesCalor = 0;
		int vecesFrio = 0;
		double temp;
		do {
			try {
				Thread.sleep((int)(Math.random()*2000));
				temp = r.nextDouble(91);
				System.out.printf("Temperatura: %.2fº%n",temp);
				if (temp < 20) {
					throw new DemasiadoFrio("Se ha superado el límite: Demasiado frío: " + temp + "º");
				} else if (temp>50)
					throw new DemasiadoCalor("Se ha superado el límite: Demasiado calor: " + temp + "º");
			} catch (DemasiadoFrio e) {
				System.out.println(e.getMessage());
				vecesFrio++;
			} catch (DemasiadoCalor e) {
				System.out.println(e.getMessage());
				vecesCalor++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (vecesCalor<15 && vecesFrio<5);
		System.out.println("=======================");
		System.out.println("Alertas por frío: "+vecesFrio);
		System.out.println("Alertas por calor: "+vecesCalor);
	}

}
