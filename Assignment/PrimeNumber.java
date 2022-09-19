package Assignment;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean primeNumber = false;
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for(int counter = 2; counter < number; counter++){
            if(number % counter == 0){
                primeNumber = false;
                break;
            }
            else{
                primeNumber = true;
            }
        }
        if(primeNumber == true){
            System.out.println("It is a prime number");
                    }
        else{
            System.out.println("It is not a prime number");
        }

    }
}
