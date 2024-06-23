class Ponei {
    //definindo os atributos do ponei
    private int id;
    private String nome;
    private String genero;
    private String tipo_ponei;
    private String cor_pele;
    private String cor_olhos;
    private String cor_crina;
    private String tipo_crina;
    private String tipo_penteado;

    //método construtor padrão
    public Ponei() {
    }

    //método construtor parametrizado
    public Ponei(int id, String nome, String tipo_ponei, String cor_pele, String cor_olhos, String cor_crina, String tipo_crina, String tipo_penteado, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.tipo_ponei = tipo_ponei;
        this.cor_pele = cor_pele;
        this.cor_olhos = cor_olhos;
        this.cor_crina = cor_crina;
        this.tipo_crina = tipo_crina;
        this.tipo_penteado = tipo_penteado;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo_ponei() {
        return tipo_ponei;
    }

    public void setTipo_ponei(String tipo_ponei) {
        this.tipo_ponei = tipo_ponei;
    }

    public String getCor_pele() {
        return cor_pele;
    }

    public void setCor_pele(String cor_pele) {
        this.cor_pele = cor_pele;
    }

    public String getCor_olhos() {
        return cor_olhos;
    }

    public void setCor_olhos(String cor_olhos) {
        this.cor_olhos = cor_olhos;
    }

    public String getCor_crina() {
        return cor_crina;
    }

    public void setCor_crina(String cor_crina) {
        this.cor_crina = cor_crina;
    }

    public String getTipo_crina() {
        return tipo_crina;
    }

    public void setTipo_crina(String tipo_crina) {
        this.tipo_crina = tipo_crina;
    }

    public String getTipo_penteado() {
        return tipo_penteado;
    }

    public void setTipo_penteado(String tipo_penteado) {
        this.tipo_penteado = tipo_penteado;
    }

    @Override
    public String toString() {
        return "\nPonei: " +
                "\nID: " + id +
                "\nNome:" + nome + '\'' +
                "\nTipo do ponei: " + tipo_ponei +'\'' +
                "\nCor da pele: " + cor_pele +'\'' +
                "\nCor dos olhos: " + cor_olhos +'\'' +
                "\nCor das crina: " + cor_crina +'\'' +
                "\nTipo da crina: " + tipo_crina +'\'' +
                "\nTipo do penteado: " + tipo_penteado + '\'' +
                "\nGenero: " + genero;
    }
}
