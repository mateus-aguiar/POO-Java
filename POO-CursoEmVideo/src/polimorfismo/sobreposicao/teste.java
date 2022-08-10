package polimorfismo.sobreposicao;

public class teste {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Tartaruga t = new Tartaruga();

        // Mesmo os métodos tendo o mesmo nome, a funcionalidade de cada um é diferente
        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();
        c.locomover();
        t.locomover();

    }
}
