package pl.wsiz.iid6.patient.dto;

import java.util.List;

public class Pacjent extends Osoba {
    private int nrUbezpieczenia;
    private Osoba lekarzRodzinny;// albo string
    private List<Skierowanie> listaSkierowan;
    private List<Badanie> listaBadan;
    private Stan stanZdrowia;
    private List<String> leki;
    private List<Recepta> recepty;

    public Pacjent(){
        super();

    }
    public Pacjent(String imie, String nazwisko, String miejscowość, String pesel, String nrTelefonu, int nrUbezpieczenia) {
        super(imie, nazwisko, miejscowość, pesel, nrTelefonu);
        this.nrUbezpieczenia = nrUbezpieczenia;
    }

    public Pacjent(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    public Pacjent(String imie, String nazwisko, String pesel) {
        super(imie, nazwisko, pesel);
    }
    public Pacjent(String imie, String nazwisko, String pesel, int nrUbezpieczenia) {
        super(imie, nazwisko, pesel);
        this.nrUbezpieczenia = nrUbezpieczenia;
    }

    public Pacjent(String imie, String nazwisko, String miejscowość, String pesel, String nrTelefonu, int nrUbezpieczenia, Osoba lekarzRodzinny, List<Skierowanie> listaSkierowan, List<Badanie> listaBadan, Stan stanZdrowia, List<String> leki, List<Recepta> recepty) {
        super(imie, nazwisko, miejscowość, pesel, nrTelefonu);
        this.nrUbezpieczenia = nrUbezpieczenia;
        this.lekarzRodzinny = lekarzRodzinny;
        this.listaSkierowan = listaSkierowan;
        this.listaBadan = listaBadan;
        this.stanZdrowia = stanZdrowia;
        this.leki = leki;
        this.recepty = recepty;
    }

    public Pacjent(String imie, String nazwisko, String pesel, int nrUbezpieczenia, Osoba lekarzRodzinny, List<Skierowanie> listaSkierowan, List<Badanie> listaBadan, Stan stanZdrowia, List<String> leki, List<Recepta> recepty) {
        super(imie, nazwisko, pesel);
        this.nrUbezpieczenia = nrUbezpieczenia;
        this.lekarzRodzinny = lekarzRodzinny;
        this.listaSkierowan = listaSkierowan;
        this.listaBadan = listaBadan;
        this.stanZdrowia = stanZdrowia;
        this.leki = leki;
        this.recepty = recepty;
    }

    public Pacjent(String imie, String nazwisko, int nrUbezpieczenia, Osoba lekarzRodzinny, List<Skierowanie> listaSkierowan, List<Badanie> listaBadan, Stan stanZdrowia, List<String> leki, List<Recepta> recepty) {
        super(imie, nazwisko);
        this.nrUbezpieczenia = nrUbezpieczenia;
        this.lekarzRodzinny = lekarzRodzinny;
        this.listaSkierowan = listaSkierowan;
        this.listaBadan = listaBadan;
        this.stanZdrowia = stanZdrowia;
        this.leki = leki;
        this.recepty = recepty;
    }

    @Override
    public String toString() {
        return "Pacjent: " +getImie()+" "+getNazwisko()+" "+ getPesel()+" "+
                "nrUbezpieczenia=" + nrUbezpieczenia +
                /*", lekarzRodzinny=" + lekarzRodzinny +
                ", listaSkierowan=" + listaSkierowan +
                ", listaBadan=" + listaBadan +
                ", stanZdrowia=" + stanZdrowia +
                ", leki=" + leki +
                ", recepty=" + recepty +*/
                '.';
    }

    public int getNrUbezpieczenia() {
        return nrUbezpieczenia;
    }

    public void setNrUbezpieczenia(int nrUbezpieczenia) {
        this.nrUbezpieczenia = nrUbezpieczenia;
    }

    public Osoba getLekarzRodzinny() {
        return lekarzRodzinny;
    }

    public void setLekarzRodzinny(Osoba lekarzRodzinny) {
        this.lekarzRodzinny = lekarzRodzinny;
    }

    public List<Skierowanie> getListaSkierowan() {
        return listaSkierowan;
    }

    public void setListaSkierowan(List<Skierowanie> listaSkierowan) {
        this.listaSkierowan = listaSkierowan;
    }

    public List<Badanie> getListaBadan() {
        return listaBadan;
    }

    public void setListaBadan(List<Badanie> listaBadan) {
        this.listaBadan = listaBadan;
    }

    public Stan getStanZdrowia() {
        return stanZdrowia;
    }

    public void setStanZdrowia(Stan stanZdrowia) {
        this.stanZdrowia = stanZdrowia;
    }

    public List<String> getLeki() {
        return leki;
    }

    public void setLeki(List<String> leki) {
        this.leki = leki;
    }

    public List<Recepta> getRecepty() {
        return recepty;
    }

    public void setRecepty(List<Recepta> recepty) {
        this.recepty = recepty;
    }
}
