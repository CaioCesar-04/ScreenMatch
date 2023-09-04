package screenmatch.modelos;

public class Title {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public Title(){

    }
    public Title(String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos ){

        setNome(nome);
        setAnoDeLancamento(anoDeLancamento);
        setIncluidoNoPlano(incluidoNoPlano);
        setDuracaoEmMinutos(duracaoEmMinutos);
    }
    
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void exibeFicha(){
        System.out.println("Nome do filme:"+ getNome());
        System.out.println("Ano de lançamento:"+ getAnoDeLancamento());
        System.out.println("Avaliação:"+ mediaAvaliacao());
        System.out.println("Total de avaliações:"+ getTotalDeAvaliacoes());

    }
    public void avalia(double nota){
        setSomaDasAvaliacoes(somaDasAvaliacoes +=nota);
        this.totalDeAvaliacoes=this.totalDeAvaliacoes +1;
    }
    public double mediaAvaliacao(){
        return this.somaDasAvaliacoes /totalDeAvaliacoes;
    }
}
