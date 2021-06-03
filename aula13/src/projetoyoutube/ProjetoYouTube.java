package projetoyoutube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        Visualizacao vis[] = new Visualizacao[5];
        
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "M", "creuzita");

        vis[0] = new Visualizacao(g[0], v[2]);
        vis[1] = new Visualizacao(g[0], v[1]);
        
        vis[0].avaliar();
        vis[1].avaliar(87f);

        System.out.println(vis[0].toString());
        
    }
    
}
