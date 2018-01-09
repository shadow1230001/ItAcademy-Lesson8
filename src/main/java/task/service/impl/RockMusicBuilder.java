package task.service.impl;

import task.bean.Gener;
import task.bean.Music;
import task.service.Builder;

public class RockMusicBuilder implements Builder {

    @Override
    public Music getMusic(String tembre, String title, String author, double duration) {
        return new Music(tembre,title, author, Gener.ROCK, duration);
    }
}
