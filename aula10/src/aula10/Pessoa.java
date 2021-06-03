package aula10;
public abstract class Pessoa {

    // Atributos
    private String nome, sexo;
    private int idade;
    
    // Métodos Especiais
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }
    
    // Getter e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "### PESSOA ###\nnome: " + nome + "\nsexo: " + sexo + "\nidade: " + idade + '\n';

    }
    
}
