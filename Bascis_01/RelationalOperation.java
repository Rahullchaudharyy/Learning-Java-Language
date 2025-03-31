public class RelationalOperation {
    public static void main(String as[]) {
        int one = 1;
        int two = 2;

        System.out.println(one == two);

        int age = 19;
        char GRADE = 'A';
        char result;

        if (age > 18 && GRADE == 'A') {
            System.out.println("He Is Eligible to get admission : )");
        }

        result = age > 12 ? 'B' : 'A';

        System.out.println(result);

    }
}