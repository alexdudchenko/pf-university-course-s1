package com.company;
import java.util.TreeSet;

public class TaskTest {

    public static void main(String[] args) {
        FilmComparator fc = new FilmComparator();
        TreeSet<Actor> listOfActors = new TreeSet<>();
        TreeSet<Film> listOfFilms = new TreeSet<>(fc);

        Actor a1 = new Actor("Billie");
        Actor a2 = new Actor("Johnny Sins");
        Actor a3 = new Actor("Undertaker");
        Actor a4 = new Actor("Johnny Depp");


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

        System.out.println("\n\n\n\n\n");



        for (Actor actor: listOfActors) {
            System.out.println(actor.getName());
        }
        System.out.println("\n\n\n\n\n");

        for (Film film: listOfFilms) {
            System.out.println(film.getMovieTitle());
        }
    }
}
