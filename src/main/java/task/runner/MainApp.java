package task.runner;

import task.bean.Gener;
import task.bean.Music;
import task.bean.MusicalSound;
import task.logick.GenerSort;
import task.logick.ManagerBuilder;
import task.logick.Worker;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
//        try {
//            HibernateFactory.initialize();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Music classicMusic = ManagerBuilder.getMusic("1", "A", "Dima",
                Gener.CLASSIC, 1);
        Music hipHopMusic = ManagerBuilder.getMusic("4", "B", "Masha",
                Gener.HIPHOP, 2);
        Music rockMusic = ManagerBuilder.getMusic("3", "C", "Vova", Gener.ROCK,
                3);
        Music popMusic = ManagerBuilder.getMusic("2", "D", "Misha", Gener.POP,
                4);

        List<MusicalSound> list = new LinkedList<MusicalSound>();

        list.add(classicMusic);
        list.add(hipHopMusic);
        list.add(rockMusic);
        list.add(popMusic);

        Collections.sort(list, new GenerSort());
        System.out.println(Worker.searchMusicForDuration(list, 1));

        for (MusicalSound music : list) {
            System.out.println(music);
        }
    }
}

