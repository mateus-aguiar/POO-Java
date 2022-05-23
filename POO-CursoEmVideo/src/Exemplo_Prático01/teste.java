package Exemplo_Prático01;

public class teste {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();

        conta.abrirConta("CP");
        conta.depositar(100);
        System.out.println(conta.getSaldo());
        conta.sacar(100);
        System.out.println(conta.getSaldo());
        conta.pagarMensal();
        System.out.println(conta.getSaldo());
        conta.sacar(100);
        System.out.println(conta.getSaldo());
        conta.sacar(30);
        conta.fecharConta();
        System.out.println(conta.isStatus());
    }
}
