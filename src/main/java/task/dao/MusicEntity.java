package task.dao;

import javax.persistence.*;

@Entity
@Table(name = "music", schema = "coursetask")
public class MusicEntity {
    private int idmusic;
    private String title;
    private String author;
    private String gener;
    private String duration;

    @Id
    @Column(name = "idmusic", nullable = false)
    public int getIdmusic() {
        return idmusic;
    }

    public void setIdmusic(int idmusic) {
        this.idmusic = idmusic;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "author", nullable = false, length = 100)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "gener", nullable = false, length = 100)
    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    @Basic
    @Column(name = "duration", nullable = false, length = 100)
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicEntity that = (MusicEntity) o;

        if (idmusic != that.idmusic) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (gener != null ? !gener.equals(that.gener) : that.gener != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idmusic;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (gener != null ? gener.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        return result;
    }
}
