package Assignment;
import java.util.Scanner;
public class GuessApp2{
    public static void main(String[] args) {
        int number = 45;
        int count = 1;

        while(count > 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the guess number: ");
            int guessNumber = input.nextInt();

            if(guessNumber > number){
                System.out.println("Too high, try again");
            }
            if(guessNumber < number){
                System.out.println("Too low, try again");
            }
            if(guessNumber == number){
                System.out.println("Correct");
                break;
            }
            count +=1;

        }
    }
}