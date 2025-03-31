public class Loop {
    public static void main(String as[]) {

        String statement = "Java is the easy language";
        int j = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {

                System.out.println(i);
            }
        }

        while (j < 86) {
            System.out.println("Decode : " + j);
            j++;
        }

        do {
            System.out.println("this is the do  while loop");
        } while (j < 4);
    }
}
