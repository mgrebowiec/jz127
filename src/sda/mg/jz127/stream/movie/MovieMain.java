package sda.mg.jz127.stream.movie;

import java.util.List;

public class MovieMain {
    public static void main(String[] args) {
        MovieManager movieManager = createMovieManager();

        boolean isMovieExist = movieManager.existMovieDirectedBy("ala");
        System.out.println("Czy istnieje film dla rezysera ala: " + isMovieExist);

        isMovieExist = movieManager.existMovieDirectedBy("Alice");
        System.out.println("Czy istnieje film dla rezysera Alice: " + isMovieExist);

        isMovieExist = movieManager.existMovieDirectedBy("JOHN");
        System.out.println("Czy istnieje film dla rezysera JOHN: " + isMovieExist);

        movieManager.findLongestMovie().ifPresent(movie -> System.out.println("Najdluzszy film: " + movie));
        movieManager.findShortestMovie().ifPresent(movie -> System.out.println("najkrotszy film: " + movie));

        List<Movie> movies = movieManager.findMoviesWithCategory(Category.HORROR);
        System.out.println("Filmy z kategorii horror: " + movies);

        movies = movieManager.findMoviesWithCategory(Category.SCI_FI);
        System.out.println("Filmy z kategorii SCI_FI: " + movies);

        movies = movieManager.getAllMoviesSortedByDuration();
        System.out.println("Wszystkie filmy posortowane wg dlugosci: " + movies);

        movies = movieManager.getAllMoviesSortedByDurationDesc();
        System.out.println("Wszytskie filmy posortowane wg dlugosci malejaco: " + movies);

        System.out.println("Wszyscy rezyserzy: " + movieManager.getAllDirectors());

    }

    private static MovieManager createMovieManager() {
        MovieManager movieManager = new MovieManager();
        Director firstDirector = new Director("john", 32);
        Director secondDirector = new Director("alice", 22);
        movieManager.addMovie(new Movie("aaa", Category.HORROR, 94, firstDirector))
                .addMovie(new Movie("bbb", Category.COMEDY, 91, firstDirector))
                .addMovie(new Movie("ccc", Category.COMEDY, 87, firstDirector))
                .addMovie(new Movie("ddd", Category.THRILLER, 97, firstDirector))
                .addMovie(new Movie("aaaa", Category.HORROR, 94, secondDirector))
                .addMovie(new Movie("bbbb", Category.COMEDY, 91, secondDirector))
                .addMovie(new Movie("cccc", Category.COMEDY, 87, secondDirector))
                .addMovie(new Movie("dddd", Category.THRILLER, 97, secondDirector))
                .addMovie(new Movie("eeee", Category.SCI_FI, 107, secondDirector));

        return movieManager;
    }
}
