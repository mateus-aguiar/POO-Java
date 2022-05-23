package Exemplo_Prático01;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco () {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.tipo.equals("CC")) {
            this.setSaldo(50);
        } else if (this.tipo.equals("CP")) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(double valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Impossivel depositar conta não está aberta!");
        }
    }

    public void sacar(double valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
    }

    public void pagarMensal() {
        double valor = 0;
        if (this.getTipo().equals("CC")) {
            valor = 12;
        } else if (this.getTipo().equals("CP")) {
            valor = 20;
        }

        if (isStatus()) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar conta não aberta!");
        }
    }
}
