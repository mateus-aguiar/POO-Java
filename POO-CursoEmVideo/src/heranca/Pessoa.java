package heranca;

public abstract class Pessoa {
    // Classe abstrata Raiz

    // Atributos
    protected String nome;
    protected int idade;
    protected char sexo;

    // Métodos públicos
    public void fazerAniv() {
        this.idade++;
    }

    // Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
