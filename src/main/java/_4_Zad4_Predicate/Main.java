package _4_Zad4_Predicate;

import _1_Zad1.Czlowiek;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /**Predicate <String> isNotNull = s -> s !=null;//sprawdzamy tylko referencje a nie zawartość Strnga dlatego !=
        Predicate <String> isNotnull1ref = Objects::nonNull; //metoda z referencja

       // System.out.println(isNotNull.test("safdsad"));
       // System.out.println(isNotNull.test(null));
       // System.out.println(isNotNull.test("asfdsdgfdsf"));
      //  System.out.println(isNotnull1ref.test("dsfdsfsdfdsf"));
      //  System.out.println(isNotnull1ref.test("dfdsfdsfsdf"));
       // System.out.println(isNotnull1ref.test(null));
       // System.out.println(isNotnull1ref.test(""));




        Predicate<String>isStringEmpty = ciagZnakow -> ciagZnakow.isEmpty();    //metoda z lambdą
        Predicate<String>isStringEmptyRef = String::isEmpty;                    //metoda z referencja
       // System.out.println(isStringEmpty.test("dfssdfsdf"));
       // System.out.println(isStringEmpty.test(""));
       // System.out.println(isStringEmptyRef.test(""));
       // System.out.println(isStringEmptyRef.test("safdsdfsd"));


        Predicate <String> and = isNotnull1ref.and(isStringEmptyRef);
        System.out.println(and.test("sdgfdsf"));
        System.out.println(and.test(""));
        System.out.println(and.test(null));         //tu nie wyrzuci nullpointer bo jesli pierwsze sprawdzenie daje falsz to przy ""and dalej nie sprawdza


        Predicate <String>or = isNotNull.or(isStringEmpty);
        System.out.println(or.test("sdfsdfdsf"));
        System.out.println(or.test(""));
        System.out.println(or.test(null));      //tu będzie nullPointer bo zawsze musi sprawdzić czy "or" czy drugi jest prawdą
*/
        Function<String, Czlowiek> nameToHuman = name -> new Czlowiek(name);
        Function<String, Czlowiek> nameToHumanRef = Czlowiek::new;
        System.out.println(nameToHuman.apply("Janek"));
        System.out.println(nameToHumanRef.apply("Monika"));


    }
}

