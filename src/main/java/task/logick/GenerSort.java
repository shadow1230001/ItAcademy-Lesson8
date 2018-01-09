package task.logick;

import task.bean.Music;
import task.bean.MusicalSound;

import java.util.Comparator;

public class GenerSort implements Comparator<MusicalSound> {

    @Override
    public int compare(MusicalSound o1, MusicalSound o2) {
        Music music1 = null;
        Music music2 = null;
        if (o2 instanceof Music) {
            music2 = (Music) o2;
        }
        if (o1 instanceof Music) {
            music1 = (Music) o1;
        }
        return music1.getGener().compareTo(music2.getGener());
    }
}
