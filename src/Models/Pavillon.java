package Models;

public class Pavillon {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private int nombreEtage;

    public int getNombreEtage() {
        return nombreEtage;
    }
    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }
    private int numeroPavillon;

    public Pavillon(int id, int nombreEtage, int numeroPavillon) {
        this.id = id;
        this.nombreEtage = nombreEtage;
        this.numeroPavillon = numeroPavillon;
    }
    public int getNumeroPavillon() {
        return numeroPavillon;
    }
    public void setNumeroPavillon(int numeroPavillon) {
        this.numeroPavillon = numeroPavillon;
    }
    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nombreEtage=" + nombreEtage + ", numeroPavillon=" + numeroPavillon + "]";
    }
}
