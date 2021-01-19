package cadastrolivroarrayliststatic_;

public class CadastroLivro { 
    
    private String titulo;
    private String autor;
    private String genero;
    private double preco;

    public CadastroLivro () { }

    public CadastroLivro(String titulo, String autor, String genero, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
    }

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String imprimir() {
        return "\nTÍTULO: " + " " + titulo + "\nAUTOR: " + " " + autor + "\nGÊNERO: " + " " + genero + String.format("\nPREÇO: R$ %.2f", preco);
    }

}
