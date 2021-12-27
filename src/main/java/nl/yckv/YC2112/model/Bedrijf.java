package nl.yckv.YC2112.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Bedrijf {

    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String naam;
    String adres;
    String rekeningNummer;
    boolean actief;
    int omzet;
    LocalDateTime datumVanOprichting;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getRekeningNummer() {
        return rekeningNummer;
    }

    public void setRekeningNummer(String rekeningNummer) {
        this.rekeningNummer = rekeningNummer;
    }

    public boolean isActief() {
        return actief;
    }

    public void setActief(boolean actief) {
        this.actief = actief;
    }

    public int getOmzet() {
        return omzet;
    }

    public void setOmzet(int omzet) {
        this.omzet = omzet;
    }

    public LocalDateTime getDatumVanOprichting() {
        return datumVanOprichting;
    }

    public void setDatumVanOprichting(LocalDateTime datumVanOprichting) {
        this.datumVanOprichting = datumVanOprichting;
    }
}
