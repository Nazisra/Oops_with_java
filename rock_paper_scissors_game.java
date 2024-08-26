
/**
 * rock_paper_scissors
author : nazmul Rahad
Daffodil international  university

 */

import java.util.Scanner;               //  header file for input from keyboard
import java.util.Random;                // header file for genarate random value; 

public class rock_paper_scissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to rock paper scissors game");
        while (true) {                                                               //  A while  true condition loop in any case match may get draw 
            System.out.print("press 0 for rock\npress 1 for paper\npress 2 for scissors\nplease put your option : ");

            int player = input.nextInt();

            if (player == 0) {
                System.out.println("you have chosen rock");
            } else if (player == 1) {
                System.out.println("you have chosen paper");
            } else {
                System.out.println("you have chosen scissors");
            }

            Random raninput = new Random();              // object for random 

            int computer = raninput.nextInt(3);            //  genarting random value from(0 - 2) 

            if (computer == 0) {
                System.out.println("computer has chosen rock");
            } else if (computer == 1) {
                System.out.println("computer has chosen paper");
            } else {
                System.out.println("computer has chosen scissors");
            }

            if (computer == player) {
                System.out.println("\nmatch draw ");
                System.out.println("\nrematch ");
            }

            else if ((player == 0 && computer == 2) || (player == 1 && computer == 0)              
                    || (player == 2 && computer == 1)) {
                System.out.println("\nCongratulation you have Win the match");
                break;
            } else {
                System.out.println("\nSorry you have lost the match");
                break;
            }
        }

    }
}







