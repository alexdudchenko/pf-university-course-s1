package lab13;

import java.util.HashSet;
import java.util.Objects;

public class Film {

    private final String movieTitle;
    private final HashSet<Actor> listOfActors = new HashSet<>();

    Film(String movieTitle, Actor... a) {
        this.movieTitle = movieTitle;
        for (Actor actor : a) {
            listOfActors.add(actor);
            actor.getListOfFilms().add(this);
        }
    }

    public void addActor(Actor a) {
    	if (a == null) {
            throw new NullPointerException("Попытка добавить пустого актера, выбросили NullPointerException");
        }
        listOfActors.add(a);
    }


    public void removeActor(Actor a) {
        listOfActors.remove(a);
    }


    public String getMovieTitle() {
        return movieTitle;
    }


    public HashSet<Actor> getListOfActors() {
        return listOfActors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(movieTitle, film.movieTitle) &&
                Objects.equals(listOfActors, film.listOfActors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieTitle);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(movieTitle);
        str.append(": ");

        for (Actor actor : listOfActors) {
            str.append(actor.getName());
            str.append(" | ");
        }

        return String.valueOf(str);
    }
}
