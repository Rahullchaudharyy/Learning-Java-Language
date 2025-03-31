class Calculator { // Creating the Object Class

    int VariableA;

    // Methods
    public int add(int num1, int num2) {
        System.out.println("in Add");

        return num1 + num2;

    }
}

public class Objects {

    public static void main(String as[]) {
        Calculator calc = new Calculator(); // Craeting an instence of the objecct :

        int Res = calc.add(23, 21);
        System.err.println(Res);
    }
};
