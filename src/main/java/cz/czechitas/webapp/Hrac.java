package cz.czechitas.webapp;

public class Hrac {
    private String jmeno;
    private String prijmeni;
    private String email;
    private int pocetVyhranychTurnaju;
    private int pocetTurnajuCelkem;
    private double procentoUspesnosti;

    public Hrac(String jmeno, String prijmeni, String email, int pocetVyhranychTurnaju, int pocetTurnajuCelkem) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.email = email;
        this.pocetVyhranychTurnaju = pocetVyhranychTurnaju;
        this.pocetTurnajuCelkem = pocetTurnajuCelkem;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String newValue) {
        jmeno = newValue;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String newValue) {
        prijmeni = newValue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newValue) {
        email = newValue;
    }

    public int getPocetVyhranychTurnaju() {
        return pocetVyhranychTurnaju;
    }

    public void setPocetVyhranychTurnaju(int newValue) {
        pocetVyhranychTurnaju = newValue;
    }

    public int getPocetTurnajuCelkem() {
        return pocetTurnajuCelkem;
    }

    public void setPocetTurnajuCelkem(int newValue) {
        pocetTurnajuCelkem = newValue;
    }

    public double getProcentoUspesnosti() {
        procentoUspesnosti =100.0 * (double) pocetVyhranychTurnaju / (double) pocetTurnajuCelkem;
        procentoUspesnosti *= 100.0;
        procentoUspesnosti = (double) Math.round(procentoUspesnosti);
        procentoUspesnosti = (int) procentoUspesnosti;
        procentoUspesnosti = (double) procentoUspesnosti/100;
        return procentoUspesnosti;
    }

    public void setProcentoUspesnosti(double newValue) {
        procentoUspesnosti = newValue;
    }
}
