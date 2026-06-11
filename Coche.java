
public abstract class Coche {
	
	/* Esta clase representa la estructura base de todos los tipos de coches
  del concesionario. Se define como abstracta porque no se van a crear
  objetos directamente*/

	//Atributos comunes a todos los coches
    protected String matricula;
    protected String color;
    protected String modelo;
    protected double precio;
    protected int kilometros;

    // Atributo de clase (static), lleva la cuenta del número total de coches en stock
    protected static int numCochesStock = 0;

    // Constructor, cada vez que se crea un coche, se incrementa el contador de coches en stock
    public Coche(String matricula, String color, String modelo, double precio, int kilometros) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometros = kilometros;
        numCochesStock++;
    }

    // Getters y Setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getKilometros() { return kilometros; }
    public void setKilometros(int kilometros) { this.kilometros = kilometros; }

    
    /* Método estático para obtener el número total de coches en stock.
      Al ser un método estático, se puede llamar sin necesidad de crear una instancia de Coche*/
 
    public static int getNumCochesStock() {
        return numCochesStock;
    }

    
    // Método toString, cada tipo de coche implementará su propia forma de mostrar su información
    @Override
    public String toString() {
        return "Matricula: " + matricula +
               ", Color: " + color +
               ", Modelo: " + modelo +
               ", Precio: " + precio +
               ", Km: " + kilometros;
    }
}