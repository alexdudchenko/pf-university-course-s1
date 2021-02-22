package com.company;

import java.util.Comparator;

public class FilmComparator implements Comparator<Film> {

    @Override
    public int compare(Film o1, Film o2) {
        return o1.getMovieTitle().compareTo(o2.getMovieTitle());
    }
}
