package _4_Zad4_Predicate;

public class Pracownik {
    private String name;
    private String lastname;
    private Urlop urlop;

    public Pracownik(String name, String lastname, Urlop urlop) {
        this.name = name;
        this.lastname = lastname;
        this.urlop = urlop;
    }

    public Pracownik(String jan, String kowalski) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Urlop getUrlop() {
        return urlop;
    }

    public void setUrlop(Urlop urlop) {
        this.urlop = urlop;
    }
}
