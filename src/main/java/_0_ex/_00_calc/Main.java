package _0_ex._00_calc;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        AddOparation oparation = new AddOparation();


        calculator.calculate(2,3,oparation);

        calculator.calculate(2,3,  (x,y) -> x+y );
        calculator.calculate(2,5, (x,y) -> x*y);



    }
}
