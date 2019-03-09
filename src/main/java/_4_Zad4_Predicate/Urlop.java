package _4_Zad4_Predicate;

import java.time.LocalDate;

public class Urlop {

    private LocalDate dataOd;
    private LocalDate dataDo;

    public Urlop(LocalDate dataOd, LocalDate datado) {
        this.dataOd = dataOd;
        this.dataDo = datado;
    }

    public LocalDate getDataOd() {
        return dataOd;
    }

    public void setDataOd(LocalDate dataOd) {
        this.dataOd = dataOd;
    }

    public LocalDate getDatado() {
        return dataDo;
    }

    public void setDatado(LocalDate datado) {
        this.dataDo = datado;
    }
}
