import java.util.Random;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] argc) {
<<<<<<< HEAD
        int randomNumber;
        int enteredNumber; 
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        randomNumber = random.nextInt(100);

        System.out.print("Enter num");
        enteredNumber = scanner.nextInt();

        if (enteredNumber > randomNumber) {
            System.out.print("The number you entered is greater than what the computer intended");
        } 
        else if (enteredNumber < randomNumber) {
            System.out.print("The number you entered is less than what the computer");
        } 
        else if(enteredNumber == randomNumber){
=======
        int randNum;
        int enterNum; Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        randNum = random.nextInt(100);

        System.out.print("Enter num");
        enterNum = scanner.nextInt();
        if (enterNum > randNum) {
            System.out.print("The number you entered is greater than what the computer intended");
        } else if (enterNum < randNum) {
            System.out.print("The number you entered is less than what the computer");
        } else if(enterNum == randNum){
>>>>>>> 9629596cc2bd5d7fc54e3e7e35d5af51a7a2f38a
            System.out.print("You guessed!");
        }

    }
}