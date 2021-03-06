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
        boolean gameEnd = false; //Creates the variable that will check if the game is going to end

        
        while (true){ 
            System.out.println("1. What is 5 + 30?"); // The first question is asked
            int ans1 = input.nextInt(); // The computer logs their answer as an integer 
            qnum++;
            if (ans1 == 35){ // Adds or subtracts to the score   
                score++;
            }
            else if(score != 0 && ans1 != 35){
                score = score-0.25;
                wrong++;
            }
            else{
                wrong++;
            }
            
            System.out.println("2. What is 6x9?");
            int ans2 = input.nextInt();
            qnum++;
            if (ans2 == 54){
                score++;
            }
            else if(score !=0 && ans2 != 54){
                score = score-0.25;
                wrong++;
            }
            else{
                wrong++;
            }

            System.out.println("3. What is 3 to the power of 3?");
            int ans3 = input.nextInt();
            qnum++;
            if (ans3 == 27){
                score++;
            }
            else if(score != 0 && ans3 != 27){
                score = score-0.25;
                wrong++;
            }
            else{
                wrong++;
            }

            System.out.println("4. What is 6 factorial? (6!)");
            int ans4 = input.nextInt();
            qnum++;
            int factorial = 6; // Setting up the answer for the factorial question to come
            for(int i=factorial-1; i>=1; i--){ // A for loop that calculates 6!
                factorial = factorial*i; 
            } 
            if (ans4 == factorial){
                score++;
            }
            else if(score != 0 && ans4 != factorial){
                score = score-0.25;
                wrong++;
            }
            else{
                wrong++;
            }

            System.out.println("5. What is the x-coordinate of the vertex of 3x^2 - 12x + 3?");
            int ans5 = input.nextInt();
            qnum++;
            if (ans5 == 2){
                score++;
            }
            else if(score != 0 && ans5 != 2){
                score = score-0.25;
                wrong++;
            }
            else{
                wrong++;}
            
            System.out.println("6. What is the derivative of 900x + 7000?");
            int ans6 = input.nextInt();
            qnum++;
            if(ans6 == 900){
                score++;
            }
            else if(score != 0 && ans6 != 900){
                score = score-0.25;
                wrong++;
            }
            else{
                wrong++;
            }

            System.out.println("7. The volume of a cube increases at rate 1.5 m^3/s. What is the rate the surface area changes when cube volume is 27 m^3?");
            int ans7 = input.nextInt();
            qnum++;
            if(ans7 == 36){
                score++;
            }
            else if(score != 0 && ans7 != 36){
                score = score-0.25;
                wrong++;
            }
            else{
                wrong++;
            }
            System.out.println("The game is over, would you like to play again? [Y/N]"); // Asks the user if they would like to play again
            char answer = input.next().charAt(0); // Collects a single character from the user
            String restart = Character.toString(answer); //Converts the input answer to a string under a new variable name that will be checked
            if (restart.equals("Y")|| restart.equals("y")){ // Evaluates whether the response was a "yes" and resets all necessary variables
                wrong = 0;
                score = 0;
                qnum = 0;
            }
            else if (restart.equals("N") || restart.equals("n")){ // Evaluates whether the response was a "no"
                showAnswers();
                gameEnd = true;
                break; // Ends the while loop and continues to the gameEnd if statements below
                }
        
        }
        
        if (gameEnd == true){
            System.out.println("Total points: " + score); // Displays total points accumulated
            System.out.println("Questions wrong: " + wrong); // Displays number of questions wrong
            double finalScore = (score/qnum)*100; // Makes the score into a percentage
            finalScore += 0.5;
            finalScore = (int)finalScore; // Rounds the percentage to a whole number using casting
            System.out.println("Percent correct: "+finalScore+"%"); // Displays final score 
            if (score == 0 || wrong >= 3){ // Decides and tells the user whether they lost or not
                System.out.println("I'm sorry but you have lost the game with 3 or more incorrect answers.");
                System.exit(0);
            }
            else {
                System.out.println("Congratulations on completing the game!");
                System.exit(0);
            }
    
        }
        

    }
    // creates a method with no return value that tells the user the answers
    static void showAnswers(){
        System.out.println("These are the answers:");
        System.out.println("1: 35");
        System.out.println("2: 54");
        System.out.println("3: 27");
        System.out.println("4: 720");
        System.out.println("5: 2");
        System.out.println("6: 900");
        System.out.println("7: 36");
    }
}

