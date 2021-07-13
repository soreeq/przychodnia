package pl.wsiz.iid6.patient.dto;

import java.util.Date;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String miejscowość;
    private String kod;
    private String ulica;
    private String pesel;
    private Date dataUrodzenia;
    private String mail;
    private String nrTelefonu;
    private String plec;

    public Osoba(String imie, String nazwisko, String miejscowość, String pesel, String nrTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowość = miejscowość;
        this.pesel = pesel;
        this.nrTelefonu = nrTelefonu;
    }

    public Osoba(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba() {

    }

    public int getWiek(){
        // wyznczamy wiek Rok obecny - rok urodzenia
        int wiek =20;
        return wiek;
    }

    public boolean checkEmail(){
        // czy poprwany, czy zawiera @
        return true;
    }

    public boolean checkPesel(){
        // 12.05.01 -> 01 05 31.....
        //             01 05+20 31
        return true;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiejscowość() {
        return miejscowość;
    }

    public void setMiejscowość(String miejscowość) {
        this.miejscowość = miejscowość;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
}
