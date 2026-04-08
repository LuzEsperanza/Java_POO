import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Loja.Petshop;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Puppy", "marron", 25, 5.5, 5,"nada");
        System.out.println(cachorro1.getNumeroCachorros());
        Cachorro cachorro2 = new Cachorro("Rex", "marron", 25, 5.5, 5,"nada");
        System.out.println(cachorro2.getNumeroCachorros());

        Gato gato = new Gato("Felix", "Preto", 5,4.5);
        Animal gato1 = new Gato("Felix", "Preto", 5,4.5);
        Animal animal = new Passaro("Felix", "Preto", 5,4.5);
        Passaro passaro = new Passaro("Frajola", "Azul", 5,0.5);
        Petshop petshop = new Petshop();
        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato);
        System.out.println(gato.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());


        cachorro1.soar();
        passaro.soar();
        gato.soar();


        //cachorro1.latir();
        System.out.println(cachorro1.getNumeroCachorros());

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());

        //System.out.println("O cachrro pegou uma " + cachorro1.pegar());
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
        cachorro2 = cachorro1;
        System.out.println("---------------");
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
        /*
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        */
        int _$teste_$ = 2;
        double _____ = 23.3;
        int inteiro;// int, long, byte = 0;
        float $$;//double e float = 0.0
        boolean $87;//boolean tem como default false
        char ch;// char vazio
        String teste;// valor default de qualquer objeto é null

        double d = 5.5d;
        float f= 3.00f;

        float x= f + (float) d;
        System.out.println(x);
        int a = 23_943_490;

    }

}
