package Notes_and_Resources.Programming_Languages.Java.L03_Swap_two_Variables;

public class Main {
    public static void main(String[] args) {
        String x = "water";
        String y = "orange";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
