public class Disfraz extends Juguete{

    //Atributos
    private String descripcion;
    private String talla;

    //Constructor

    public Disfraz(Double precio, Double cupon, String descripcion, String talla) {
        super(precio, cupon);
        this.descripcion = descripcion;
        this.talla = talla;
    }

    //Getter and setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
