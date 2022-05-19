package Criando_Classes_E_Objetos;
public class Caneta {
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // Metódos
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        }   else {
            System.out.println("Estou Rabiscando!");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
