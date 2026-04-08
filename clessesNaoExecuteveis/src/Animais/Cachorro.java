package Animais;

public class Cachorro extends Animal {
    //atributos
    static int numeroCachorros;

    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    //construtores


    //construtores adicionados
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, altura, peso );
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroCachorros ++;
    }

    //metodos

    public static int getNumeroCachorros() {
        return numeroCachorros;
    }

    public static void setNumeroCachorros(int numeroCachorros) {
        Cachorro.numeroCachorros = numeroCachorros;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String pegar (){
        return "Bolinha";
    }
    public String interagir(String acao){
        //enum
        switch (acao){
            case "carinho" : this.estadoDeEspirito = "Feliz"; break;
            case "vai dormir!" : this.estadoDeEspirito = "Bravo"; break;
            case "pisar na patinha" : this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro"; break;
        }
         return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
    @Override
    public void soar(){
        System.out.println("AU AU!");
    }
}
