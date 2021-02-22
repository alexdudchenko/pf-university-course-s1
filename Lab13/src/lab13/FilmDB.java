package lab13;

import java.util.HashMap;
import java.util.HashSet;

public class FilmDB {

    private final HashSet<Actor> listOfActors;
    private final HashSet<Film> listOfFilms;

    FilmDB(HashSet<Actor> listOfActors, HashSet<Film> listOfFilms) {
        this.listOfActors = listOfActors;
        this.listOfFilms = listOfFilms;
    }

    void isActorLoser() {
        boolean isLoser = false;
        for (Actor listOfActor : listOfActors) {
            if (listOfActor.getListOfFilms().isEmpty()) {
                isLoser = true;
                break;
            }
        }
        if (isLoser) {
            System.out.println("Есть актеры, не сыгравшие ни в одном фильме" + "\n");
        } else {
            System.out.println("Нет актеров, не сыгравших ни в одном фильме" + "\n");
        }
    }

    HashMap<Actor, HashSet<Actor>> getColleagueList() {
        HashMap<Actor, HashSet<Actor>> map = new HashMap<>();

        for (Actor actor : listOfActors) {
            HashSet<Actor> colleagueList = new HashSet<>();
            for (Film film: actor.getListOfFilms()) {
                colleagueList.addAll(film.getListOfActors());
            }
            colleagueList.remove(actor);
            map.put(actor, colleagueList);
        }
        return map;
    }

    HashSet<Actor> getColleaguesOf(Actor actor) throws NoColleaguesException {
        HashMap<Actor, HashSet<Actor>> map = this.getColleagueList();
        HashSet<Actor> set = map.get(actor);

        if (set.isEmpty()) {
            throw new NoColleaguesException("Нет коллег");
        }

        return set;
    }


    Film[] getTheBiggestFilm() throws NoFilmsException {
        int countOfActors = 0;
        int sizeOfArray = 0;

        if (listOfFilms.size() == 0)
        	throw new NoFilmsException("I'm sorry... There are no films!");
        
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

        Film[] film = new Film[sizeOfArray];
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

