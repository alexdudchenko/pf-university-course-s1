package com.company;

import java.util.HashSet;

public class TestTask {

    public static void main(String[] args) {
        HashSet<Actor> listOfActors = new HashSet<>();
        HashSet<Film> listOfFilms = new HashSet<>();

        Actor a1 = new Actor("Billie");
        Actor a2 = new Actor("Emma Watson");
        Actor a3 = new Actor("Undertaker");
        Actor a4 = new Actor("Джонни Депп");
        Actor a5 = new Actor("Daniel Radcliffe");
        Actor a6 = new Actor("Джонни Депп");

        Film f1 = new Film("THUG FOR LIFE", a1, a2);
        Film f2 = new Film("13 shots", a2);
        Film f3 = new Film("Night of knives", a3, a4, a1);
        Film f4 = new Film("NLO");
        Film f5 = new Film("The north", a4, a2);

        a1.addFilm(f4);
        System.out.println(a1);
        a1.removeFilm(f1);
        System.out.println(a1);

        listOfActors.add(a1);
        listOfActors.add(a2);
        listOfActors.add(a3);
        listOfActors.add(a4);
        listOfActors.add(a5);
        listOfActors.add(a6);

        listOfFilms.add(f1);
        listOfFilms.add(f2);
        listOfFilms.add(f3);
        listOfFilms.add(f4);
        listOfFilms.add(f5);

        FilmDB fb = new FilmDB(listOfActors, listOfFilms);

        System.out.print("Коллеги " + a4.getName() + " : ");
        for (Actor a : fb.getColleaguesOf(a4)) {
            System.out.print(a.getName() + " | ");
        }
        System.out.println("\n");

        fb.isActorLoser();

        System.out.println("Фильмы, где больше всего актеров: " );
        for (Film f : fb.getTheBiggestFilm()) {
            System.out.println(f.getMovieTitle());
        }

        for (Actor a : listOfActors) {
            System.out.print(a.getName() + " | ");
        }
    }
}
