package Models;

public class Chambre {

    private int idChambre;
    private int numeroChambre;
    private String typeChambre;
    private int numeroEtage;
    private int etatChambre;

    public Chambre(int idChambre, int numeroChambre, int etatChambre, int numeroEtage, String typeChambre) {
        this.idChambre = idChambre;
        this.numeroChambre = numeroChambre;
        this.typeChambre = typeChambre;
        this.numeroEtage = numeroEtage;
        this.etatChambre = etatChambre;
    }
    // public Chambre(int idChambre, int numeroEtage, int etatChambre, String typeChambre, int numeroChambre) {
    //     this.idChambre = idChambre;
    //     this.numeroEtage = numeroEtage;
    //     this.etatChambre = etatChambre;
    //     this.typeChambre = typeChambre;
    //     this.numeroChambre = numeroChambre;
    // }
    public int getIdChambre() {
        return idChambre;
    }
    public void setIdChambre(int idChambre) {
        this.idChambre = idChambre;
    }
    public int getNumeroChambre() {
        return numeroChambre;
    }
    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    public String getTypeChambre() {
        return typeChambre;
    }
    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }
    public int getNumeroEtage() {
        return numeroEtage;
    }
    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }
    public int getEtatChambre() {
        return etatChambre;
    }
    public void setEtatChambre(int etatChambre) {
        this.etatChambre = etatChambre;
    }
    @Override
    public String toString() {
        return "Chambre [etatChambre=" + etatChambre + ", idChambre=" + idChambre + ", numeroChambre=" + numeroChambre
                + ", numeroEtage=" + numeroEtage + ", typeChambre=" + typeChambre + "]";
    }
}
