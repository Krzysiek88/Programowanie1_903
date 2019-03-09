package _4_Zad4_Predicate;


import java.time.LocalDate;
import java.util.function.Predicate;

public class ZweryfikujUrlop implements Predicate <Urlop>  {

    private LocalDate data;


    public ZweryfikujUrlop(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean test(Urlop urlop) {



        return data != null
                && !data.isBefore(urlop.getDataOd())
                && !data.isAfter(urlop.getDatado());
    }

    @Override
    public Predicate<Urlop> and(Predicate<? super Urlop> other) {
        return null;
    }

    @Override
    public Predicate<Urlop> negate() {
        return null;
    }

    @Override
    public Predicate<Urlop> or(Predicate<? super Urlop> other) {
        return null;
    }
}

