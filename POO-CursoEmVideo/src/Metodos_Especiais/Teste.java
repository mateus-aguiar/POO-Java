package Metodos_Especiais;
public class Teste {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        c1.setPonta(0.5f);

        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

        Caneta c2 = new Caneta("Bic", "Vermelha", 1.0f);

        c2.status();
    }
}
