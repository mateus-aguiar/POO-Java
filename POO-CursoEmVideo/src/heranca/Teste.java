package heranca;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Visitante();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Mateus");
        p2.setNome("Henrique");
        p3.setNome("Aguiar");
        p4.setNome("Tato");

        p1.setSexo('M');
        p2.setSexo('F');
        p3.setIdade(18);
        p4.setIdade(19);

        p2.setCurso("Informática");
        p3.setSalario(500.75f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
