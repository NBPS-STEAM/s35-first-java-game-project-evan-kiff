import java.util.Scanner;
public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Introduction
        System.out.println("Hello! Today we are going to play a math game!");
        System.out.println("The questions start easy, but get harder as you go along.");
        System.out.println("Correct answers give you 1 point each, but incorrect answers make you lose 0.25 points.");
        System.out.println("Be extra careful, though, as 3 wrong answers and you lose the game!");
        System.out.println("So let's get started!");
        double score = 0; // Starts the score at 0
        int wrong = 0; // Creates variable for the amount of questions wrong
        int qnum = 0; // Creates variable for the number of questions asked

        int factorial = 6; // Setting up the answer for the factorial question to come
        for(int i=factorial-1; i>=1; i--){
            factorial = factorial*i; // We have just calculated what 6! is 
        }
        System.out.println(factorial);

        while (wrong < 3){
            System.out.println("1. What is 5 + 30?"); // The first question is asked
            int ans1 = input.nextInt(); // The computer logs their answer as an integer 
            qnum++;
            if (ans1 == 35){ // Adds or subtracts to the score
                score++;
            }
            else if(score != 0){
                score = score-0.25;
            }
            
            System.out.println("2. What is 6x9?");
            int ans2 = input.nextInt();
            qnum++;
            if (ans2 == 54){
                score++;
            }
            else if(score !=0){
                score = score-0.25;
            }

            System.out.println("What is 3 to the power of 3?");
            int ans3 = input.nextInt();
            qnum++;
            if (ans3 == 27){
                score++;
            }
            else if(score != 0){
                score = score-0.25;
            }

            System.out.println("What is 6 factorial? (6!)");
            int ans4 = input.nextInt();
            qnum++;
            if (ans4 == factorial){
                score++;
            }
            else if(score != 0){
                score = score-0.25;
            }

        }

        

    }

}
