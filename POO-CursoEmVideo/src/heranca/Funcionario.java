package heranca;

public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;

    // Métodos público
    public void mudaTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }

    // Métodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
