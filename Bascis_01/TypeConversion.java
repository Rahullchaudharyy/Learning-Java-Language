public class TypeConversion {

    public static void main(String as[]) {
        int a = 28;
        byte Val = 70;

        Val = (byte) a; // Syntax = "=" assign , (byte,int,float) On which type you want to convert
        a = Val;

        System.out.println(Val);

    }
}
