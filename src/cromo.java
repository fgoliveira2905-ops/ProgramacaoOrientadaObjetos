import java.io.Serializable;
import java.time.LocalDate;

public class cromo implements Serializable {
    private static final long serialVersionUID = 1L;

    private int numero;
    private String nome;
    private String categoria;
    private String localizacao;
    private LocalDate dataAquisicao;
    private String estadoConservacao;
    private boolean emprestado;
    private boolean desaparecido;

    public cromo(int numero, String nome, String categoria,
                  String localizacao, LocalDate dataAquisicao, String estadoConservacao)
    {
        this.numero = numero;
        this.nome = nome;
        this.categoria = categoria;
        this.localizacao = localizacao;
        this.dataAquisicao = dataAquisicao;
        this.estadoConservacao = estadoConservacao;
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
    public void setDataAquisicao(LocalDate dataAquisicao) {
        if (dataAquisicao == null) {
            throw new IllegalArgumentException("A data não pode estar vazia");
        }
        if (dataAquisicao.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("A data de aquisição não pode ser no futuro.");
        }
        this.dataAquisicao = dataAquisicao;
    }

    public String getEstadoConservacao() { return this.estadoConservacao; }
    public void setEstadoConservacao(String EstadoConservacao) {
        this.estadoConservacao = EstadoConservacao;
    }

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
