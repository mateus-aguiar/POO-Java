package Exemplo_Pratico02;

public class teste {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Mateus", 19, 'M');
        pessoa[1] = new Pessoa("Fulana", 19, 'F');

        livro[0] = new Livro("Java", "Fulano", 300, pessoa[1]);
        livro[1] = new Livro("POO", "Ciclano", 600, pessoa[0]);
        livro[2] = new Livro("SPRING", "Beltrano", 900, pessoa[1]);

        livro[1].abrir();

        livro[1].folhear(600);

        livro[1].avancarPag();

        System.out.println(livro[1].detalhes());

    }
}
