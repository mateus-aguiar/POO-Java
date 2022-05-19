package Criando_Classes_E_Objetos;
public class Teste {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // Criação do novo objeto (Instanciar)

        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();

        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();

        c2.modelo = "Bic";
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        c2.destampar();

        c2.status();
        c2.rabiscar();
    }
}
