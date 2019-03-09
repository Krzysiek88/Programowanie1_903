package _0_ex._00_calc;

public class Calculator {
    double calculate (double x, double y, Operation operation){
        return operation.execute(x,y);
    }
}
