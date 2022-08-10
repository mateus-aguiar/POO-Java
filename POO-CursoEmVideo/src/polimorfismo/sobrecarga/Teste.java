package polimorfismo.sobrecarga;

public class Teste {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        m.emitirSom();
        l.emitirSom();
        c.emitirSom();

        c.reagir("Toma comida");
        c.reagir(11, 45);
        c.reagir(true);
        c.reagir(10, 11f);
    }
}
