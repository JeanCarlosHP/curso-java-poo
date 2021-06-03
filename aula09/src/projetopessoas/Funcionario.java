package projetopessoas;
public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;
    
    // Métodos Especiais
    public void mudaTrabalho() {
        this.setTrabalhando(! this.isTrabalhando());
    }
    
    // Getters e Setters

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
