import java.util.ArrayList;

public class FactoryComboJuguetes {

    //Atributo
    private static FactoryComboJuguetes instance;

    //Constructor privado
    public static FactoryComboJuguetes getInstance(){
        if(instance == null){
            instance = new FactoryComboJuguetes();
        }
        return instance;
    }

    public ComboComposite crearComboNavideno(Integer codigo) {
        switch (codigo) {
            case 223344:
                ArrayList<Comprable> articulos = new ArrayList<>();
                Juguete juegoDeMesa = new JuegoDeMesa(50.0, 0.85, "Life", 2, 6);
                Juguete figura1 = new JugueteGenerico(40.0, 0.70, "Spiderman", 5);
                Juguete figura2 = new JugueteGenerico(40.0, 0.70, "Spiderman", 5);
                Juguete disfraz = new Disfraz(20.0, 0.85, "Iron Man", "M");
                articulos.add(juegoDeMesa);
                articulos.add(figura1);
                articulos.add(figura2);
                articulos.add(disfraz);
                ComboComposite comboNavideno = new ComboComposite(0.85,0.70, 223344, articulos);
                return comboNavideno;
            default:{
                return null;
            }
        }
    }
}
