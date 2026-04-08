package Animais;

public class Passaro extends Animal{
    static int numeroPassaros;

    public Passaro(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
    }


    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }
    @Override
    public void soar() {
        System.out.println("PIAU PIAU!!");
    }
}
