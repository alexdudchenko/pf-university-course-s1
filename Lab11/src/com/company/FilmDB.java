package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class FilmDB {

    private TreeSet<Actor> listOfActors;
    private TreeSet<Film> listOfFilms;

    FilmDB(TreeSet<Actor> listOfActors, TreeSet<Film> listOfFilms) {
        this.listOfActors = listOfActors;
        this.listOfFilms = listOfFilms;
    }

    void isActorLoser() {
        boolean isLoser = false;
        Iterator<Actor> actors = listOfActors.iterator();
        while (actors.hasNext()) {
            if (actors.next().getListOfFilms().isEmpty()) {
                isLoser = true;
            }
        }

        if (isLoser) {
            System.out.println("Есть актеры, не сыгравшие ни в одном фильме" + "\n");
        } else {
            System.out.println("Нет актеров, не сыгравших ни в одном фильме" + "\n");
        }

    }

    TreeSet<Actor> getColleagueList(Actor actor) {
        TreeSet<Actor> colleagueList = new TreeSet<>();

        @SuppressWarnings("rawtypes")
        Iterator films = listOfFilms.iterator();
        while (films.hasNext()) {
            Film film = (Film) films.next();
            if (film.getListOfActors().contains(actor)) {
                @SuppressWarnings("rawtypes")
                Iterator filmChecker = film.getListOfActors().iterator();
                while (filmChecker.hasNext()) {
                    Actor actory = (Actor) filmChecker.next();
                    if (actory.equals(actor))
                        continue;
                    if (!colleagueList.contains(actory)) {
                        colleagueList.add(actory);
                    }
                }
            }
        }
        return colleagueList;
    }

    Film[] getTheBiggestFilm() {
        int countOfActors = 0;
        int sizeOfArray = 0;

        for (Film f : listOfFilms) {
            if (countOfActors <= f.getListOfActors().size()) {
                countOfActors = f.getListOfActors().size();

            }
        }
        for (Film f : listOfFilms) {
            if (f.getListOfActors().size() == countOfActors) {
                sizeOfArray++;
            }
        }
        Film film[] = new Film[sizeOfArray];
        int index = 0;
        for (Film f : listOfFilms) {
            if (f.getListOfActors().size() == countOfActors) {
                film[index] = f;
                index++;
            }
        }
        return film;
    }
}

