package exercicio;
public class Livro implements Publicacao{
    // Atributos
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setAberto(false);
        this.setPagAtual(0);
        this.leitor = leitor;
    }
    
    // Métodos Especiais
    public String detalhes() {
        return "### LIVRO ###\n" + "titulo: " + titulo + "\nautor: " + autor +
                "\ntotPaginas: " + totPaginas + "\npagAtual: " + pagAtual +
                "\naberto: " + aberto + "\nleitor: " + leitor.getNome() + "\n";
    }
    
    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotPaginas()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1);
    }
}
