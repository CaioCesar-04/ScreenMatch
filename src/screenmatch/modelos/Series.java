package screenmatch.modelos;

public class Series extends Title{
    private int temporadas;
    private boolean ativa;
    private int episodiosTemp;
    private int minutosEpisodio;

    public int getEpisodiosTemp() {
        return episodiosTemp;
    }

    public void setEpisodiosTemp(int episodiosTemp) {
        this.episodiosTemp = episodiosTemp;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }
}
