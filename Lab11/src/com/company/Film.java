package com.company;

import java.util.TreeSet;

public class Film {
    private String movieTitle;
    private TreeSet<Actor> listOfActors = new TreeSet<>();

    Film(String movieTitle, Actor... a) {
        this.movieTitle = movieTitle;
        for (Actor actor : a) {
            if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
            }
            actor.getListOfFilms().add(this);
        }
    }

    public void addActor(Actor a)
    {
        if (!listOfActors.contains(a))
        {
            listOfActors.add(a);
        }
    }
    public void removeActor(Actor a)
    {
        if (listOfActors.contains(a))
        {
            listOfActors.remove(a);
        }
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public TreeSet<Actor> getListOfActors() {
        return listOfActors;
    }
}
