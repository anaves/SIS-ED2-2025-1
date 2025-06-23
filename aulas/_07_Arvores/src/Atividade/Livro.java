package Atividade;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private Integer ano;
    
    public Livro(){

    }

    public Livro(String titulo, String autor, Integer ano) {
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
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

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro [getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor() + ", getAno()=" + getAno() + "]";
    }

    private String geraChave(){
        String chave = (this.getTitulo()+this.getAno()).toLowerCase();
        return chave;
    }
    @Override
    public int compareTo(Livro outroLivro) {
        String chaveThis = this.geraChave();
        String outroLivroAutorTituloAno = outroLivro.geraChave();
        return chaveThis.compareTo(outroLivroAutorTituloAno);
    }
}