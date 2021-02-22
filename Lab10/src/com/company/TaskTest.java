package com.company;

import java.util.ArrayList;

public class TaskTest {

    public static void main(String[] args) {
        ArrayList<Actor> listOfActors = new ArrayList<>();
        ArrayList<Film> listOfFilms = new ArrayList<>();

        Actor a1 = new Actor("Billie");
        Actor a2 = new Actor("Emma Watson");
        Actor a3 = new Actor("Undertaker");
        Actor a4 = new Actor("Джонни Депп");

        Film f1 = new Film("THUG FOR LIFE", a1, a2);
        Film f2 = new Film("13 shots", a2);
        Film f3 = new Film("Night of knifes", a3, a4, a1);
        Film f4 = new Film("NLO", a3);
        Film f5 = new Film("The north", a4, a2);

        listOfActors.add(a1);
        listOfActors.add(a2);
        listOfActors.add(a3);
        listOfActors.add(a4);


        listOfFilms.add(f1);
        listOfFilms.add(f2);
        listOfFilms.add(f3);
        listOfFilms.add(f4);
        listOfFilms.add(f5);

        FilmDB fb = new FilmDB(listOfActors, listOfFilms);

        System.out.print("Коллеги " + a4.getName() + " : ");
        for (Actor a : fb.getColleagueList(a4)) {

            System.out.print(a.getName() + " ");
        }
        System.out.println("\n");

        fb.isActorLoser();

        System.out.println("Фильмы, где больше всего актеров: " );
        for (Film f : fb.getTheBiggestFilm())
        {
            System.out.println(f.getMovieTitle());
        }
    }
}
