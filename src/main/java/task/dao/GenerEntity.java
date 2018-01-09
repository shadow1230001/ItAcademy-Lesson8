package task.dao;

import javax.persistence.*;

@Entity
@Table(name = "gener", schema = "coursetask")
public class GenerEntity {
    private int idgener;
    private String name;

    @Id
    @Column(name = "idgener", nullable = false)
    public int getIdgener() {
        return idgener;
    }

    public void setIdgener(int idgener) {
        this.idgener = idgener;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenerEntity that = (GenerEntity) o;

        if (idgener != that.idgener) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idgener;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
