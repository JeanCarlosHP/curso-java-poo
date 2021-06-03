package exercicio;
public class Pessoa {
    // Atributos
    private String nome, sexo;
    private int idade;
    
    // Métodos Especiais
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }
    
    // Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    
    // Getter e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
