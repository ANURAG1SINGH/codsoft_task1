package CODSOFT;
import java.util.*;

public class guess_game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = r.nextInt(100);
        char a = 'y';
        int score = 0;

        while (a == 'y') {

            for (int i = 0; i < 3; i++) {
                System.out.println("guess the number:");
                int guess = sc.nextInt();

                if (n == guess) {
                    System.out.println("good guess");
                    score++;
                    return;

                } else {
                    System.out.println("you entered the incorrect number");
                    if (guess > n) {
                        System.out.println("too high[try a smaller number]");
                    } else {
                        System.out.println("too low [try a larger number]");
                    }

                }

            }

            System.out.println("press y to continue:");
            a = sc.next().charAt(0);// way to take input as char
        }
        System.out.println("final score:" + score);
        sc.close();
    }

}
