package projetopessoas;
public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;
    
    // Métodos Especiais
    public void receberAum(float aum) {
        this.setSalario(this.getSalario() + aum);
    }
    
    // Getters e Setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
