package com.company;

import java.util.ArrayList;

public class Actor {
    private String name;
    private ArrayList<Film> listOfFilms = new ArrayList<>();

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

    public ArrayList<Film> getListOfFilms() {
        return listOfFilms;
    }

    public String getName() {
        return name;
    }
}
