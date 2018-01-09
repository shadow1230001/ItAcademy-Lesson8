package task.logick;

import task.bean.Music;
import task.bean.MusicalSound;

import java.util.List;

public class Worker {

    public static MusicalSound searchMusicForDuration(List<MusicalSound> musicalSounds, double duration) {
        Music music = null;
        for (int i = 0; i < musicalSounds.size(); i++) {
            if (musicalSounds.get(i) instanceof Music) {
                music = (Music) musicalSounds.get(i);
                if (music.getDuration() == duration) {
                    return (MusicalSound) music;
                }
            }
        }
        return music;
    }

}
