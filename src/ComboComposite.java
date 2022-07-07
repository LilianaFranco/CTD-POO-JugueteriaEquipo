import java.util.ArrayList;

public class ComboComposite implements Comprable{

    //Atributos
    private Integer codigo;
    private ArrayList<Comprable> articulos;
    private Double cuponCombo;
    private Double cuponAcumulativo;
    //Constructor
    public ComboComposite(Double cuponCombo, Double cuponAcumulativo, Integer codigo, ArrayList<Comprable> articulos) {
        this.codigo = codigo;
        this.cuponCombo = cuponCombo;
        this.articulos = articulos;
        this.cuponAcumulativo = cuponAcumulativo;
    }

    @Override
    public Double getPrecio() {
        double total = 0.0;
        for(Comprable c: this.articulos){
            total += c.getPrecio();
        }
        return total*this.cuponCombo;
    }

    @Override
    public Double aplicarCupon() {
        double total = 0.0;
        for(Comprable c: this.articulos){
            total =  c.getPrecio();
        }
        Double descuentos = this.cuponAcumulativo+this.cuponCombo;
        return total*descuentos;
    }

    //Getter and setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Comprable> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Comprable> articulos) {
        this.articulos = articulos;
    }

    public Double getCuponCombo() {
        return cuponCombo;
    }

    public void setCuponCombo(Double cuponCombo) {
        this.cuponCombo = cuponCombo;
    }

    public Double getCuponAcumulativo() {
        return cuponAcumulativo;
    }

    public void setCuponAcumulativo(Double cuponAcumulativo) {
        this.cuponAcumulativo = cuponAcumulativo;
    }

    @Override
    public String toString() {
        return "Estos son los articulos: " + this.articulos;
    }
}
