package heranca;

// Classe final não pode ter filhos
public final class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void cancelarMat() {
        super.cancelarMat();
    }
}
