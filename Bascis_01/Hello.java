public class Hello {
    public static void main(String a[]) {
        int num1 = 30;
        int num2 = 40;
        int result = num1 + num2;
        float marks = 9.5f;

        System.out.println(marks + " Out of 10.0");

        System.out.println(4 + 3);
        System.out.println("This is the number :- " + num1);
        System.out.println("Addition of the numbers is :- " + result);
        long longNumber = 3423L; // 8 Bytes = Can store -2^63 to 2^63 - 1 ; = -9,223,372,036,854,775,808 to
        // 9,223,372,036,854,775,807
        int integer = 1010101; // 4 Bytes = Can store -2^31 to 2^31 - 1 ; = -2,147,483,648 to 2,147,483,647
        short shortNumber = 233; // 2 Bytes = Can store -2^15 to 2^15 - 1 ; = -32,768 to 32,767
        byte byteNumber = 101; // 1 Byte = Can store -2^7 to 2^7 - 1 ; = -128 to 127;
        double doubleNumber = 3.14159265359; // 8 Bytes = Can store approximately ±(2^−1022) to (2^1023) with ~15
                                             // decimal precision
        char FirstLATTER = 'R';
        boolean IsEligible = true; // no 0 and 1 ;

        System.out.println("Long Value: " + longNumber);
        System.out.println("Integer Value: " + integer);
        System.out.println("Short Value: " + shortNumber);
        System.out.println("Byte Value: " + byteNumber);

    }

}
