package Basics_02;

class Computer {

    public void playMusic() {
        System.out.print("Music Playing ... \n");
    }

    public String getMePen(int cost) {
        return "Pen";
    }

    public int add(int n1, int n2) {
        System.err.println(n1 + n2);
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);

        return n1 + n2 + n3;
    }

    public double add(double n1, double n2) {
        System.out.println(n1 + n2);

        return n1 + n2;
    }

    // these are called the method overloading : -

    // same name of the methods but the behaviour of the methods will be the
    // diffrent : - like may be the return type of the method will ben the diffrent
    // : or may be the diffrent type of the para

}

public class Methods {

    public static void main(String as[]) {
        Computer ComputerObject = new Computer();
        ComputerObject.playMusic();
        ComputerObject.add(12, 45);
        ComputerObject.add(12, 45, 34);
        ComputerObject.add(12.5, 4.5);
    }

}