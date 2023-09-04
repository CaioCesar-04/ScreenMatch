package app;

import screenmatch.modelos.Movie;
import screenmatch.modelos.Title;

public class Main {
    public static void main(String[] args) {
        Movie filme = new Movie("o poderoso chefão",1980,true,180,"caio");
        filme.avalia(5);
        filme.avalia(6);
        System.out.println(filme.getTotalDeAvaliacoes());
        filme.exibeFicha();

    }
}
