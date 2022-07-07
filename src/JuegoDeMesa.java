public class JuegoDeMesa extends Juguete{

    //Atributos
    private String nombre;
    private int numeroJugMin;
    private int numeroJugMax;

    //Constructor

    public JuegoDeMesa(Double precio, Double cupon, String nombre, int numeroJugMin, int numeroJugMax) {
        super(precio, cupon);
        this.nombre = nombre;
        this.numeroJugMin = numeroJugMin;
        this.numeroJugMax = numeroJugMax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroJugMin() {
        return numeroJugMin;
    }

    public void setNumeroJugMin(int numeroJugMin) {
        this.numeroJugMin = numeroJugMin;
    }

    public int getNumeroJugMax() {
        return numeroJugMax;
    }

    public void setNumeroJugMax(int numeroJugMax) {
        this.numeroJugMax = numeroJugMax;
    }
}
