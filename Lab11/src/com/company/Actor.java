package com.company;


import java.util.TreeSet;

public class Actor implements Comparable<Actor>{
    private FilmComparator fc = new FilmComparator();
    private String name;
    private TreeSet<Film> listOfFilms = new TreeSet<>(fc);

    Actor(String name)
    {
        this.name = name;
    }

    public void addFilm(Film m)
    {
        if (!listOfFilms.contains(m))
        {
            listOfFilms.add(m);
        }
    }
    public void removeFilm(Film m)
    {
        if (listOfFilms.contains(m))
        {
            listOfFilms.remove(m);
        }
    }

    public TreeSet<Film> getListOfFilms() {
        return listOfFilms;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Actor o) {
        return name.compareTo(o.getName());
    }
}
