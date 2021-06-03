package aula10;
public class Bolsista extends Aluno {

    // Atributos
    private float bolsa;
    
    // Métodos Especiais
    public void renovarBolsa() {
        System.out.println("Bolsa renovada.");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagamento efetuado com sucesso.");
    }
    
    // Getters e Setters
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;

    }
    
}
