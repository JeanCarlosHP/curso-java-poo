package projetoyoutube;
public class Visualizacao {
    // Atributos
    private Gafanhoto espectador;
    private Video filme;

    // Construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    // Métodos Especiais
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc) {
        int tot = 0;
        
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 80) {
            tot = 8;
        } else {
            tot = 10;
        }
        
        this.filme.setAvaliacao(tot);
    }
    
    // Getters e Setters
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "### VISUALIZAÇÃO ###\nespectador: " + espectador + "\nfilme: " + filme + '\n';
    }
    
    
    
}
