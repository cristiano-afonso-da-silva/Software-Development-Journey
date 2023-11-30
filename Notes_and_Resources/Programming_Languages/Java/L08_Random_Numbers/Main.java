package Notes_and_Resources.Programming_Languages.Java.L08_Random_Numbers;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        Random random = new Random();

        // int x = random.nextInt(6)+1; //0-5 + 1, so 1-6
        // double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);
    }
    
}
