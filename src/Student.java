import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String Imie;
    private String Nazwisko;
    private int numerIndeksu;
    private int rokStudiow;
    private ArrayList<Przedmiot> Przedmioty = new ArrayList<>();

    public Student(String imie, String nazwisko, int numerIndeksu, int rokStudiow) {
        Imie = imie;
        Nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.rokStudiow = rokStudiow;
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public ArrayList<Przedmiot> getPrzedmioty() {
        return Przedmioty;
    }

    @Override
    public String toString() {
        return "Student: %s, %s Numer Indexu: %o Rok Studiów: %o " + Imie + Nazwisko + numerIndeksu + rokStudiow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numerIndeksu == student.numerIndeksu && rokStudiow == student.rokStudiow && Objects.equals(Imie, student.Imie) && Objects.equals(Nazwisko, student.Nazwisko) && Objects.equals(Przedmioty, student.Przedmioty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Imie, Nazwisko, numerIndeksu, rokStudiow, Przedmioty);
    }

    public DodajDoListy(Przedmioty p){
        for (Przedmiot p: Przedmioty)
            Przedmioty.add(new Przedmiot());
        return Przedmioty;
    }
}
