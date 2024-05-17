// Method Oveloading -> when we have same name of method with diffrent parameter or diffrent type parameter 

class Calculator {
    public int num = 5;

    public int add(int n1, int n2) {

        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }

}

public class method_overloading {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;

        // create a object by using new keybord
        Calculator calc = new Calculator();

        int result1 = calc.add(num1, num2);
        int result2 = calc.add(num1, num2, 7);
        double result3 = calc.add(4.8, num2);
        // System.out.println(result1);

        // when be create two or more objecy of using same class and change the update
        // the value of any one object it will not reflect in other object

        Calculator calc1 = new Calculator();

        calc.num = 8;
        // System.out.println(calc.num);
        // System.out.println(calc1.num);

    }
}
