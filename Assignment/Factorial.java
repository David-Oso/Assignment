package Assignment;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        int number = 1;
        while(number <=5){
            factorial *= number;
            number +=1;
        }
        System.out.printf("The factorial of the number is: %d%n", factorial);
    }
}
