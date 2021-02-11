package com.company;


import java.util.HashSet;
import java.util.Objects;

public class Actor {
    private final String name;
    private HashSet<Film> listOfFilms = new HashSet<>();

    Actor(String name) {
        this.name = name;
    }

    public void addFilm(Film m) {
        listOfFilms.add(m);
    }

    public void removeFilm(Film m) {
        listOfFilms.remove(m);
    }

    public HashSet<Film> getListOfFilms() {
        return listOfFilms;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(name);
        str.append(": ");

        for (Film film : listOfFilms) {
            str.append(film.getMovieTitle());
            str.append(" | ");
        }

        return String.valueOf(str);
    }

    @Override
    public int hashCode() {
        char[] array = name.toCharArray();
        return array[0] + 17 * array.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name);
    }
}

