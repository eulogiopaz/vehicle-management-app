

 // Clase que representa un coche de segunda mano, que hereda de Coche e implementa Vendible.
public class CocheSegundaMano extends Coche implements Vendible {

	// Atributo específico de los coches de segunda mano, que representa el nombre del propietario anterior.
    private String propietarioAnterior;

    // El constructor de CocheSegundaMano recibe los parámetros necesarios para inicializar tanto los atributos heredados
    public CocheSegundaMano(String matricula, String color, String modelo, double precio, int kilometros, String propietarioAnterior) {
        super(matricula, color, modelo, precio, kilometros);
        this.propietarioAnterior = propietarioAnterior;
    }

    // Getters y Setters para el atributo propietarioAnterior
    public String getPropietarioAnterior() { return propietarioAnterior; }
    public void setPropietarioAnterior(String propietarioAnterior) {
        this.propietarioAnterior = propietarioAnterior;
    }

    // Implementación del método vender() de la interfaz Vendible.
    @Override
    public void vender() {
    	System.out.println("El coche de segunda mano (" + modelo + " - " + matricula + ") se ha vendido");
    }

    // Sobrescribimos el método toString() para proporcionar una representación específica de los coches de segunda mano, incluyendo el propietario anterior.
    @Override
    public String toString() {
        return "Coche Segunda Mano -> " + super.toString() +
               ", Propietario anterior: " + propietarioAnterior;
    }
}