import org.junit.Test;
import static org.junit.Assert.*;

public class PadraoFlyWeightTest {

    @Test
    public void testeCriacaoFormas() {
        Forma circulo1 = FormaFabrica.getForma("circulo");
        Forma quadrado1 = FormaFabrica.getForma("quadrado");

        assertNotNull(circulo1);
        assertNotNull(quadrado1);
        assertTrue(circulo1 instanceof Circulo);
        assertTrue(quadrado1 instanceof Quadrado);
    }

    @Test
    public void testeDesenhoFormas() {
        Forma circulo1 = FormaFabrica.getForma("circulo");
        Forma quadrado1 = FormaFabrica.getForma("quadrado");

        circulo1.desenhar("vermelho");
        quadrado1.desenhar("azul");
    }

    @Test
    public void testeCompartilhamentoFormas() {
        Forma circulo1 = FormaFabrica.getForma("circulo");
        Forma circulo2 = FormaFabrica.getForma("circulo");
        Forma quadrado1 = FormaFabrica.getForma("quadrado");
        Forma quadrado2 = FormaFabrica.getForma("quadrado");

        assertSame(circulo1, circulo2);
        assertSame(quadrado1, quadrado2);
    }

    @Test
    public void testePerformance() {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            Forma forma = FormaFabrica.getForma("circulo");
            forma.desenhar("verde");
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo total: " + (fim - inicio) + "ms");
    }

    @Test
    public void testeAlteracaoCor() {
        Forma quadrado1 = FormaFabrica.getForma("quadrado");
        quadrado1.desenhar("vermelho");
        quadrado1.desenhar("azul");
    }
}
