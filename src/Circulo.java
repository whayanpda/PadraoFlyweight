public class Circulo implements Forma {
    private String tipo;
    private int raio;

    public Circulo(String tipo) {
        this.tipo = tipo;
        this.raio = 10;
    }

    @Override
    public void desenhar(String cor) {
        System.out.println("Desenhando um círculo " + tipo + " com raio " + raio + " na cor " + cor);
    }
}
