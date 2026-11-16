import java.io.Serializable;
import java.time.LocalDate;

public class cromos implements Serializable {
    private static final long serialVersionUID = 1L;

    private int numero;
    private String nome;
    private String categoria;
    private String localizacao;
    private LocalDate dataAquisicao;
    private String estadoConservacao;
    private boolean emprestado;
    private boolean desaparecido;

    public cromos(int numero, String nome, String categoria, String localizacao, LocalDate dataAquisicao) {
        this.numero = numero;
        this.nome = nome;
        this.categoria = categoria;
        this.localizacao = localizacao;
        this.dataAquisicao = dataAquisicao;
        this.emprestado = false;
        this.desaparecido = false;
    }

    //Getters e Setters
    public int getNumero(){ return this.numero; }
    public void setNumero(int numero) {this.numero = numero; }

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCategoria() { return this.categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public LocalDate getDataAquisicao() { return dataAquisicao; }
    public void setDataAquisicao(LocalDate dataAquisicao) { this.dataAquisicao = dataAquisicao; }

    public boolean isEmprestado() { return emprestado; }
    public void setEmprestado(boolean emprestado) { this.emprestado = emprestado; }

    public boolean isDesaparecido() { return desaparecido; }
    public void setDesaparecido(boolean desaparecido) { this.desaparecido = desaparecido; }

    @Override
    public String toString() {
        return "Cromo #" + this.numero +
                " - " + this.nome +
                "\nCategoria: " + this.categoria
                + "\nLocal: " + this.localizacao
                + "\nAdquirido em " + this.dataAquisicao
                + "\nEstado de Conservação: " + this.estadoConservacao
                + "\n";
    }

}
