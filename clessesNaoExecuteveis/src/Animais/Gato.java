package Animais;

public class Gato extends Animal {
    static int numeroGato;

    public Gato(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("MIAU MIAU!");
    }
}

