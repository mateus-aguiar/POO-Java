package projeto_final;

public class Teste {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 02 de POO");
        v[2] = new Video("Aula 03 de POO");

        Gafanhoto[] g = new Gafanhoto[2];

        g[0] = new Gafanhoto("Junior", 20, 'M', "Arroz");
        g[1] = new Gafanhoto("Julia", 22, 'F', "Feijão");


        Visualizacao visu[] = new Visualizacao[3];

        visu[0] = new Visualizacao(g[0], v[0]); // Junior assiste Aula 01
        visu[0].avaliar();
        System.out.println(visu[0].toString());

        visu[1] = new Visualizacao(g[0], v[1]); // Junior assiste aula 02
        visu[1].avaliar(87.0f);
        System.out.println(visu[1].toString());

    }
}
