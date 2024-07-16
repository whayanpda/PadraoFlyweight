import java.util.HashMap;
import java.util.Map;

public class FormaFabrica {
    private static final Map<String, Forma> formas = new HashMap<>();

    public static Forma getForma(String tipo) {
        Forma forma = formas.get(tipo);

        if (forma == null) {
            switch (tipo) {
                case "circulo":
                    forma = new Circulo("padrao");
                    break;
                case "quadrado":
                    forma = new Quadrado("padrao");
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de forma não suportado: " + tipo);
            }
            formas.put(tipo, forma);
        }

        return forma;
    }
}
