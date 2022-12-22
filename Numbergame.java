import  java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());
        int K = 5;
        int i,guess;
        int c=0;
        int d=0;
        System.out.println(number);
        System.out.println("A number is chosen between 1 to 100.");
        System.out.println("Guess the number within 5 trials.");
        for (i = 0; i < K; i++) {
            System.out.println("Guess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.");
                d++;
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is greater than " + guess);
                c++;
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is less than " + guess);
                c++;
            }
        }
        c=5-c;
        c*=10;
        if(d==1){
            System.out.println("You have earned "+c+"/50"+" points");
        }
        if (i == K) {
            System.out.println("You have exhausted the trials.");
            System.out.println("The number was " + number);
        }
    }
}