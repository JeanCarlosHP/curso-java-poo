package projetoyoutube;
public class Gafanhoto extends Pessoa {
    // Atributos
    private String login;
    private int totAssistindo;
    
    // Construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistindo = 0;
    }
    
    // Getters e Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "### GAFANHOTO ###\nlogin: " + login + "\n\n" + super.toString() +
                "\ntotAssistindo: " + totAssistindo + '\n';
    }
    
    
    
}
