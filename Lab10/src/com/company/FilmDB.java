package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class FilmDB {

    private ArrayList<Actor> listOfActors;
    private ArrayList<Film> listOfFilms;

    FilmDB(ArrayList<Actor> listOfActors, ArrayList<Film> listOfFilms) {
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

    ArrayList<Actor> getColleagueList(Actor actor) {
        ArrayList<Actor> colleagueList = new ArrayList<>();

        Iterator films = listOfFilms.iterator();
        while (films.hasNext()) {
            Film film = (Film) films.next();
            if (film.getListOfActors().contains(actor)) {
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
