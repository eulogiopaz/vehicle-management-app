

// Clase CocheNuevo que hereda de Coche e implementa Vendible
public class CocheNuevo extends Coche implements Vendible {

	
	// Atributo específico de los coches nuevos, que representa la garantía en años.
    private int garantia;

    /* El constructor de CocheNuevo recibe los parámetros necesarios para inicializar tanto los atributos heredados
       de la clase Coche como el atributo específico de garantía. 
	 Utiliza la palabra clave super para llamar al constructor de la clase padre (Coche)
	  y pasarle los valores correspondientes. Luego, asigna el valor de garantía al 
	  atributo específico de esta clase.*/
    public CocheNuevo(String matricula, String color, String modelo, double precio, int kilometros, int garantia) {
        super(matricula, color, modelo, precio, kilometros);
        this.garantia = garantia;
    }

    // Getters y Setters para el atributo garantía
    public int getGarantia() { return garantia; }
    public void setGarantia(int garantia) { this.garantia = garantia; }

    /* Implementación del método vender() de la interfaz Vendible. 
	   Este método se encarga de mostrar un mensaje indicando que el coche que se ha vendido,
       mostrando automáticamente el tipo de coche. */
    @Override
    public void vender() {
    	 System.out.println("El coche nuevo (" + modelo + " - " + matricula + ") se ha vendido");
    }

    // Sobrescribimos el método toString() para proporcionar una representación específica de los coches nuevos.
    @Override
    public String toString() {
        return "Coche Nuevo -> " + super.toString() + ", Garantía: " + garantia + " años";
    }
}