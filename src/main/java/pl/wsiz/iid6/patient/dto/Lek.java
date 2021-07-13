package pl.wsiz.iid6.patient.dto;

public class Lek {
    private String nazwa;
    private String producent;

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    private int ilosc;
    public String getProducent() {
        return producent;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Lek(String nazwa, String producent) {
        this.nazwa = nazwa;
        this.producent = producent;
    }

    public Lek(String nazwa) {
        this.nazwa = nazwa;
    }
    @Override
    public String toString() {
        /*return String.format(
                "Lek[nazwa='%s', producent='%s', ]",
                nazwa, producent) + ilosc;*/
    return nazwa+" producent: "+producent+" "+ " ilosc: "+ilosc;
    }
}
