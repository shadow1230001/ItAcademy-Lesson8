package task.bean;

public class Music extends MusicalSound {
    private String title;
    private String author;
    private Gener gener;
    private double duration;

    public Music(String tembre, String title, String author, Gener gener, double duration) {
        super(tembre);
        this.title = title;
        this.author = author;
        this.gener = gener;
        this.duration = duration;
    }

    public Music() {
        super();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Gener getGener() {
        return gener;
    }

    public void setGener(Gener gener) {
        this.gener = gener;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Music music = (Music) o;

        if (Double.compare(music.duration, duration) != 0) return false;
        if (title != null ? !title.equals(music.title) : music.title != null) return false;
        if (author != null ? !author.equals(music.author) : music.author != null) return false;
        return gener == music.gener;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (gener != null ? gener.hashCode() : 0);
        temp = Double.doubleToLongBits(duration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", gener=" + gener +
                ", duration=" + duration +
                '}';
    }
}
