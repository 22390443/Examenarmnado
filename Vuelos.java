import java.time.LocalTime;
public class Vuelos {
    public String nombreCapitan, nAvion, origen, destino;
    public LocalTime hSalida, hLlegada;

    public Vuelos(String nombreCapitan, String nAvion, String origen, String destino, LocalTime hSalida, LocalTime hLlegada){
        this.nombreCapitan=nombreCapitan;
        this.nAvion=nAvion;
        this.origen=origen;
        this.destino=destino;
        this.hSalida=hSalida;
        this.hLlegada=hLlegada;
    }
    public void mostrarVuelo(){
        System.out.println("Nombre del capitan: "+nombreCapitan);
        System.out.println("Modelo Avion: "+nAvion);
        System.out.println("Ciudad Origen: "+origen);
        System.out.println("Ciudad Destino: "+destino);
        System.out.println("Hora de salida: "+hSalida);
        System.out.println("Hora de llegada: "+hLlegada);
    }
}
