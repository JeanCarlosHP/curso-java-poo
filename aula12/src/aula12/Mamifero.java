package aula12;
public class Mamifero extends Animal {

    // Atributos
    protected String corPelo;
    
    // Sobreposição
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
}
