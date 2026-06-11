

// implementa la interfaz Alquilable, lo que significa que se puede alquilar. 
  
public class CocheKm0 extends Coche implements Alquilable {

	
	// utilizamos el constructor de la clase padre para inicializar los atributos heredados.
    public CocheKm0(String matricula, String color, String modelo, double precio, int kilometros) {
        super(matricula, color, modelo, precio, kilometros);
    }

    
    // Implementación del método alquilar() de la interfaz Alquilable.
    @Override
    public void alquilar() {
    	System.out.println("El coche Km0 (" + modelo + " - " + matricula + ") se ha alquilado");
    }

    
    // Sobrescribimos el método toString() para proporcionar una representación específica de los coches Km0.
    @Override
    public String toString() {
        return "Coche Km0 -> " + super.toString();
    }
}