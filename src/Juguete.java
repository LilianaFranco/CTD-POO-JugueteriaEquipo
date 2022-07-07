public abstract class Juguete implements Comprable{

    //Atributos
    private Double precio;
    private Double cupon;


    //Constructor
    public Juguete(Double precio, Double cupon) {
        this.precio = precio;
        this.cupon = cupon;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
    }

    @Override
    public Double aplicarCupon(){
        return this.precio*this.cupon;
    }

    @Override
    public String toString() {
        return "El precio del juguete es: " + this.precio;
    }

    public Double getCupon() {
        return cupon;
    }
}
