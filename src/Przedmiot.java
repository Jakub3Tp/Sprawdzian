import java.util.Objects;

import static java.lang.String.format;

public class Przedmiot {
    private String nazwaPrzedmiotu;
    private Float liczbaPunktowECTS;

    public Przedmiot(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }
    public Przedmiot(){

    }
    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public Float getLiczbaPunktowECTS() {
        return liczbaPunktowECTS;
    }

    public void setLiczbaPunktowECTS(Float liczbaPunktowECTS) {
        this.liczbaPunktowECTS = liczbaPunktowECTS;
    }

    @Override
    public String toString() {
       return format("Przedmiot: %s, Liczba punktów: %o" + nazwaPrzedmiotu + liczbaPunktowECTS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot = (Przedmiot) o;
        return Objects.equals(nazwaPrzedmiotu, przedmiot.nazwaPrzedmiotu) && Objects.equals(liczbaPunktowECTS, przedmiot.liczbaPunktowECTS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaPrzedmiotu, liczbaPunktowECTS);
    }
}
