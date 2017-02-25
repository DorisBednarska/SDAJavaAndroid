package pl.sda.filmBuilder;

import java.time.LocalDate;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {

        FilmBuilder personBuilder = new FilmBuilder();
        Film film = new Film();
        film.setTittle("Inception");
        film.setDirector("Christopher Nolan");
        film.setType("Thriller");
        film.setProduction("USA");
        film.setPremiere(LocalDate.of(2010, 02, 23));

        System.out.println(film.toString());
    }
}
