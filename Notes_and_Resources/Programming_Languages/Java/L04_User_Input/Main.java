package Notes_and_Resources.Programming_Languages.Java.L04_User_Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("WHat is your name? ");
        String name = scanner.nextLine(); //Cristiano\n -> 
        System.out.println("How old are you? ");
        int age = scanner.nextInt(); //e.g. 18\n -> \n
        scanner.nextLine(); //clear \n
        System.out.println("What is your favourite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);

        scanner.close();
    }
}
