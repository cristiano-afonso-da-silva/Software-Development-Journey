package Notes_and_Resources.Programming_Languages.Java.L07_Math_Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double x = 3.14;
        double y = -10;

        double z = Math.max(x,y); //Math.max, min, abs, sqrt, round, etc

        System.out.println(z);

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter side y: ");
        b = scanner.nextDouble();

        c = Math.sqrt(a*a+b*b);

        System.out.println("The Hypotenuse is: "+c);

        scanner.close();


    }
}
