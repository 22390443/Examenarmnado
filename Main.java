import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Vuelos vuelo = new Vuelos("Hector", "TRV025", "Mexico", "Japon", LocalTime.of(10, 30), LocalTime.of(23, 0));
        vuelo.mostrarVuelo();
    }
}