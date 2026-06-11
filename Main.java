
// Clase principal para probar la aplicación de coches
public class Main {

    public static void main(String[] args) {

        // Crear objetos
        CocheKm0 cocheKm0 = new CocheKm0("1111AAA", "Rojo", "Seat Ibiza", 15000.0, 10);
        CocheNuevo cocheNuevo = new CocheNuevo("2222BBB", "Azul", "Ford Focus", 22000.0, 0, 3);
        CocheSegundaMano coche2Mano = new CocheSegundaMano("3333CCC", "Negro", "BMW Serie 3", 18000.0, 80000, "Eulogio Paz");

        // Mostrar información
        System.out.println(cocheKm0);
        System.out.println(cocheNuevo);
        System.out.println(coche2Mano);

        System.out.println("------------------------");

        // Acciones
        cocheKm0.alquilar();
        cocheNuevo.vender();
        coche2Mano.vender();

        System.out.println("------------------------");

        // Mostrar total coches
        System.out.println("Total coches en stock: " + Coche.getNumCochesStock());
    }
}