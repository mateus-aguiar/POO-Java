package heranca;

public class Aluno extends Pessoa {
    // Herança para diferença

    // Atributos
    private int mat;
    private String curso;

    // Métodos públicos
    public void cancelarMat() {
        System.out.println("Matrícula será cancelada");
    }


    // Método final não podem ser sobrescritos
    public final void   pagarMensalidade() {
        System.out.println("Mensalidade paga");
    }

    // Métodos especiais
    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
