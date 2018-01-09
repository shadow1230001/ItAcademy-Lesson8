package task.dao;

import javax.persistence.*;

@Entity
@Table(name = "musicsound", schema = "coursetask")
public class MusicsoundEntity {
    private int idmusicSound;
    private String tembre;

    @Id
    @Column(name = "idmusicSound", nullable = false)
    public int getIdmusicSound() {
        return idmusicSound;
    }

    public void setIdmusicSound(int idmusicSound) {
        this.idmusicSound = idmusicSound;
    }

    @Basic
    @Column(name = "tembre", nullable = false, length = 500)
    public String getTembre() {
        return tembre;
    }

    public void setTembre(String tembre) {
        this.tembre = tembre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicsoundEntity that = (MusicsoundEntity) o;

        if (idmusicSound != that.idmusicSound) return false;
        if (tembre != null ? !tembre.equals(that.tembre) : that.tembre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idmusicSound;
        result = 31 * result + (tembre != null ? tembre.hashCode() : 0);
        return result;
    }
}
