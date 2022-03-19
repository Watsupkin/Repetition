import java.util.Scanner;

public class AgeVerify {


    public AgeVerify ageVerify() {

        Scanner in = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = in.nextInt();
        String answer = age >= 18 ? "You're average" : "You're underage";
        System.out.println(answer);

       /* Scanner in = new Scanner(System.in);
        System.out.println("How old are you? Enter your age:");
        int age = in.nextInt();
        if (age < 18 && age > 0) {
            System.out.println("You are underage");
        }
        else if (age <= 0) {
            System.out.println("You have not born yet");
        }
        else {
            System.out.println("You are average");
        }*/
        return null;
    }

    public AgeVerify() {
    }
}
