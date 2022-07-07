import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FactoryComboJuguetes fac = FactoryComboJuguetes.getInstance();
        Comprable comboNavideno = fac.crearComboNavideno(223344);
        System.out.println("El precio del combo es: " + comboNavideno.getPrecio());
        System.out.println("El precio del combo es: " + comboNavideno.aplicarCupon());

    }
}