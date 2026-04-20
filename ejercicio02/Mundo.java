package ejercicio02;

public class Mundo {
	private String nombre;
	private float diametro;
	private boolean habitable;
	
	public Mundo() {
		super();
		nombre="";
		diametro=0.0F;
		habitable=false;
	}

	public Mundo(String n, float d, boolean h) {
		super();
		this.nombre = n;
		this.diametro = d;
		this.habitable = h;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}

	public boolean isHabitable() {
		return habitable;
	}

	public void setHabitable(boolean habitable) {
		this.habitable = habitable;
	}

	@Override
	public String toString() {
		return "Mundo [nombre=" + nombre + ", diametro=" + diametro + ", habitable=" + habitable + "]";
	}

	
}
