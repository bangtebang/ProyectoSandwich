package YourSandwich;

public class Vacuno extends Rojas {

	public Vacuno(String nombre, String color, String colorRojo, String tipo, double peso) {
		super(nombre, color, colorRojo, tipo, peso);
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}