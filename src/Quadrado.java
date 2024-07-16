public class Quadrado implements Forma {
    private String tipo;
    private int lado;

    public Quadrado(String tipo) {
        this.tipo = tipo;
        this.lado = 10;
    }

    @Override
    public void desenhar(String cor) {
        System.out.println("Desenhando um quadrado " + tipo + " com lado " + lado + " na cor " + cor);
    }
}
