package task.bean;

public class MusicalSound {

    private String tembre;

    public MusicalSound(String tembre) {
        this.tembre = tembre;
    }

    public MusicalSound(){
        super();
    }

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

        MusicalSound that = (MusicalSound) o;

        return tembre != null ? tembre.equals(that.tembre) : that.tembre == null;
    }

    @Override
    public int hashCode() {
        return tembre != null ? tembre.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MusicalSound{" +
                "tembre='" + tembre + '\'' +
                '}';
    }
}
