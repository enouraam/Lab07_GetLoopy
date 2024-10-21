import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args) {

        Random generator = new Random();

        Scanner in = new Scanner(System.in);

        boolean keepPlaying = true;

        String input = "";

        while(keepPlaying)  {
            System.out.print("Roll  Die1  Die2  Die3  Sum\n");

            System.out.print("---------------------------");

            int rollCount = 0;

            int dieSum = 0;


            do {
                int dieOne = generator.nextInt(6) + 1;

                int dieTwo = generator.nextInt(6) + 1;

                int dieThree = generator.nextInt(6) + 1;

                rollCount += 1;

                dieSum = dieOne + dieTwo + dieThree;

                System.out.printf("\n%d     %d     %d     %d     %d   ", rollCount, dieOne, dieTwo, dieThree, dieSum);

                if (dieOne == dieTwo && dieTwo == dieThree) {

                    break;

                }


            } while (true);

            System.out.print("\nWould you like to play again?(Y/N): ");

            input = in.next();

            if (!input.equalsIgnoreCase("y")) {  //if user inputs anything but y it will terminate program

                keepPlaying = false;
            }


        }
    }
}