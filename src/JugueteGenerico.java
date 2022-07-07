public class JugueteGenerico extends Juguete{

    //Atributos
    private String nombre;
    private int aptoParaEdad;

    //Constructor
    public JugueteGenerico(Double precio, Double cupon, String nombre, int aptoParaEdad) {
        super(precio, cupon);
        this.nombre = nombre;
        this.aptoParaEdad = aptoParaEdad;
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAptoParaEdad() {
        return aptoParaEdad;
    }

    public void setAptoParaEdad(int aptoParaEdad) {
        this.aptoParaEdad = aptoParaEdad;
    }
}
