class calculator {
    public int add(int n1, int n2) {

        return n1 + n2;
    }

}

class Demo {

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;

        // create a object by using new keybord
        calculator calc = new calculator();

        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}