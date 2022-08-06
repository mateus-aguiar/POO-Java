package Exemplo_Pratico02;

public interface Publicacao {

    // Métodos abstratos
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pagina);
    public abstract void avancarPag();
    public abstract void voltarPag();

}
