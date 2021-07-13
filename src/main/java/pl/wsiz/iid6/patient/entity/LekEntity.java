package pl.wsiz.iid6.patient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "leki")//domyślnie jest jak klasa!
public class LekEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nazwa;
    private String producent;
    private int ilosc;

    protected LekEntity() {
    }

    public LekEntity(String nazwa, String producent, int ilosc) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.ilosc = ilosc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }
    @Override
    public String toString() {
        return String.format(
                "Lek[nazwa='%s', producent='%s', ilosc]",
                id, nazwa, producent, ilosc);

    }
}