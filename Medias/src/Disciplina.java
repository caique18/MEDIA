class Disciplina {
    private ICalcMedia calculo;
    private String nome;
    private double p1;
    private double p2;
    public Disciplina(ICalcMedia calculo) {
        this.calculo = calculo;
    }
    public Disciplina() {
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getP1() {
        return p1;
    }
    public double getP2() {
        return p2;
    }
    public void setP1(double p1) {
        this.p1 = p1;
    }
    public void setP2(double p2) {
        this.p2 = p2;
    }
    public void calcularMedia(ICalcMedia calculo) {
        this.calculo = calculo;
    }
    public double getMedia() {
        return calculo.CalculaMedia();
    }
    public String getSituacao() {
        return calculo.Situacao();
    }
}