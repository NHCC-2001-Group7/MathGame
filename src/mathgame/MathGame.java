/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathgame;

/**
 * @authors: Mike Plucker, Billy Lam, Xavier Porter
 * @Class: CSCI 2001-51
 * @Due Date: 02/25/14
 * 
 * @Version 1.00
 * 
 * Objective: Write a program that will help an elementary school student learn arithmetic. (Exercises 6.35, 6.36, 6.39)
 *  -The program asks the student basic addition, subtraction, multiplication and division problems
 *      and then checks their answer and tells them if they were right or wrong.
 * 
 * Requirements:
 *  -Use a Random object to produce two positive one-digit integers
 *  -A separate method should be used to generate each new question.
 *      -This method should be called once when the application begins execution and each time the user
 *          answers the question correctly.
 * -Vary the computer's responses to hold the user's attention. (6.36)
 *      -Use random-number generator to choose a number from 1 to 4 that will be used to select one of the four
 *          appropriate responses to each correct or incorrect answer.
 *      -Use a switch statement to issue the responses.
 *  -Allow the user to pick the type of arithmetic to study. (6.39)
 *      -Students can pick from addition, subtraction, multiplication, division, or randomly from those four.
 *          -Use a string variable in the switch statement to allow the user to type in "addition", "subtraction", etc.
 *              without having to worry about the capitalization of the strings.
 *  -User will be allowed two chances to answer each question correctly.
 *      -After typing 2 incorrect answers, the program will display the correct answer.
 *  -Make a good GUI for the program. It should be fun looking with colors, images and sounds.
 *  -Properly document your code using javadoc.
 * 
 */


//import classes
import java.util.Random;
import java.util.Scanner;


public class MathGame {
    
    Random rand = new Random(); //create new random number generator
    Scanner scan = new Scanner(System.in); //create new scanner

    
    //declare instance variables
    String response, input;
    //String rightAnswer, wrongAnswer;
    
    int num1, num2;
    
    MathGameUI ui = new MathGameUI();


    //constructor
    public MathGame (){
        
        
    }


    //method to start game
    public void startGame (){

	//loops questions until user types no
	do{
            System.out.printf("\nWhat type of math question would you like?\nAddition\nSubtraction\nMultiplication\nDivision\nRandom\n\n"); //prompt user
            pickQuestion(); //call method to have user pick which type of question to answer

            //see if user wants to play again
            System.out.printf("\nWould you like to try another question? Yes or No\n"); //prompt user
            response = scan.next(); //read input from user and assign to variable
            validateResponse(); //validate response
        }while(!response.equalsIgnoreCase("no")); //keeps looping until user types no
        
        System.out.printf("Okay, Have a nice day!"); //farewell message
    }
    
    
    //method to validate user's response
    public void validateResponse(){
        
        //if response is not yes or no
        while(!(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no"))){
            System.out.println("Invalid input!"); //chastise user
            System.out.print("\nWould you like to try another question? Yes or No\n"); //prompt user again
            response = scan.next(); //read input and assign to variable
        }
    }

    
    //method to allow user to choose which type of question to ask
    public void pickQuestion(){
        
	input = scan.next(); //read input from user and assign to variable

	//selects which type of question to ask
	switch(input.toLowerCase())
	{
	case "addition":
            //addition(); 
            break;
        case "subtraction":
            //subtraction();
            break;
	case "multiplication":
            //multiply();
            break;
	case "division":
            //division();
            break;
	case "random":
            //randomQuestion();
            break;
	}
    }
    
    
    //method to retrieve num1
    public int getNum1() {
        return num1;
    }
    
    
    //method to set num1
    public void setNum1(int num1) {
	this.num1 = num1;
    }
    
    
    //method to retrieve num2
    public int getNum2() {
        return num2;
    }
    
    
    //method to set num2
    public void setNum2(int num2) {
	this.num2 = num2;
    }
    

    //method to calculate an addition problem
    public int addition(int num1, int num2){
        
        this.num1 = num1;
        this.num2 = num2;
        
        int sum = num1 + num2; //calculate sum of 2 numbers
        
	//declare local variables
	//int num1 = 1 + rand.nextInt(9); //random number between 1 and 9
	//int num2 = 1 + rand.nextInt(9); //random number between 1 and 9
	
	//int guess = 0;
        //int attempt = 1; //counter
        
	//System.out.printf("\nHow much is %d plus %d? ", num1, num2); //prompt user to answer question
	//guess = scan.nextInt(); //read input from user and assign to variable

        //if user's guess is incorrect
        //if(guess != sum){
            //while(attempt < 2){ //loop 2 times to give the user 2 chances to answer correctly
                //incorrectAnswer(); //call method to pick condemning response
                
                //have user guess again
                //System.out.printf("\nWhat is the correct answer? "); //prompt user
                //guess = scan.nextInt(); //read input from user and assign to variable
            
                //attempt++; //increment counter
            //}
            //display correct answer after 2 failed attempts.
            //System.out.printf("You are incorrect.\nThe Correct answer is: %d\n", sum);
        //}
        //else{
            //user guessed correctly
            //correctAnswer(); //call method to pick affirming response
        //}
        
        return sum;
    }


    //method to calculate a subtraction problem
    public int subtraction(int num1, int num2){
        
        this.num1 = num1;
        this.num2 = num2;
        
        int difference = num1 - num2; //calculate difference of 2 numbers
        
	//declare local variables
	//int num1 = 1 + rand.nextInt(9); //random number between 1 and 9
	//int num2 = 1 + rand.nextInt(9); //random number between 1 and 9
	//int difference = num1 - num2; //calculate difference of 2 numbers
	//int guess = 0;
	//int attempt = 1; //counter
        
        //If less than 0, ensure it's a positive answer 
        //if(difference <= 0){
            //difference = num2 - num1;
            //System.out.printf("\nHow much is %d minus %d? ", num2, num1); //prompt user to answer question
        //}
        //else{
            //System.out.printf("\nHow much is %d minus %d? ", num1, num2); //prompt user to answer question
        //}
 
	//guess = scan.nextInt(); //read input from user and assign to variable
        
        //if user's guess is incorrect
        //if(guess != difference){
            //while(attempt < 2){ //loop 2 times to give the user 2 chances to answer correctly
                //incorrectAnswer(); //call method to pick condemning response
                
                //have user guess again
                //System.out.printf("\nWhat is the correct answer? "); //prompt user
                //guess = scan.nextInt(); //read input from user and assign to variable
 
                //attempt++; //increment counter
            //}
            //display correct answer after 2 failed attempts.
            //System.out.printf("You are incorrect.\nThe Correct answer is: %d\n", difference);
        //}
        //else{
            //user guessed correctly
            //correctAnswer(); //call method to pick affirming response
        //}
        
        return difference;
    }


    //method to calculate a multiplication problem
    public int multiply (int num1, int num2){

        this.num1 = num1;
        this.num2 = num2;
        
        int product = num1 * num2; //calculate product of 2 numbers
        
	//declare local variables
	//int num1 = 1 + rand.nextInt(9); //random number between 1 and 9
	//int num2 = 1 + rand.nextInt(9); //random number between 1 and 9
	//int product = num1 * num2; //calculate product of 2 numbers
	//int guess = 0;
        //int attempt = 1; //counter
        
	//System.out.printf("\nHow much is %d times %d? ", num1, num2); //prompt user to answer question
	//guess = scan.nextInt(); //read input from user and assign to variable
            
	//if user's guess is incorrect
	//if(guess != product){
            //while(attempt < 2){ //loop 2 times to give the user 2 chances to answer correctly
                //incorrectAnswer(); //call method to pick condemning response
            
                //have user guess again
                //System.out.printf("\nWhat is the correct answer? "); //prompt user
                //guess = scan.nextInt(); //read input from user and assign to variable
            
                //attempt++; //increment counter
            //}
            //display correct answer after 2 failed attempts.
            //System.out.printf("You are incorrect.\nThe Correct answer is: %d\n", product);
	//}
	//else{
            //user guessed correctly
            //correctAnswer(); //call method to pick affirming response
        //}
        
        return product;
    }
    

    //method to calculate a division problem
    public int division(int num1, int num2){
        
       // this.num1 = num1;
        //this.num2 = num1 * num2;
        
        //int quotient = (this.num2 / num1); //calculate quotient of 2 numbers
        
	//declare local variables
	//int num1 = 1 + rand.nextInt(9); //random number between 1 and 9
	//int num2 = num1*(1 + rand.nextInt(9)); //random number between 1 and 9
	//int quotient = (num2 / num1); //calculate quotient of 2 numbers
	//int guess;
        //int attempt = 1; //counter
        

	//System.out.printf("\nHow much is %d divided by %d? ", num2, num1); //prompt user to answer question
	//guess = scan.nextInt(); //read input from user and assign to variable

	//if user's guess is incorrect
	//if(guess != quotient){
            //while(attempt < 2){ //loop 2 times to give the user 2 chances to answer correctly
                //incorrectAnswer(); //call method to pick condemning response

                //have user guess again
                //System.out.printf("\nWhat is the correct answer? "); //prompt user
                //guess = scan.nextInt(); //read input from user and assign to variable
            
                //attempt++; //increment counter
            //}
            //display correct answer after 2 failed attempts.
           // System.out.printf("You are incorrect.\nThe Correct answer is: %d\n", quotient);
	//}	
	//else{
            //user guessed correctly
            //correctAnswer(); //call method to pick affirming response
        //}
        
        return quotient;
    }


    //method to ask a random math question
    public void randomQuestion(int num1, int num2){

	//declare local variables
	int answer = 1 + rand.nextInt(4);

	//randomly generate math questions
	switch(answer)
	{
	case 1:
            ui.questionLabel.setText("");
            break;
	case 2:
            //subtraction();
            break;
	case 3:
            //multiply();
            break;
	case 4:
            //division();
            break;
	}
    }


    //method to determine response to user's correct answer
    public String correctAnswer(){

	//initialize local variables
        String rightAnswer = "";
	int answer = 1 + rand.nextInt(4);

	//randomly generate response to user's answer
	switch(answer)
	{
	case 1:
            rightAnswer = "Very good!\n";
            break;
	case 2:
            rightAnswer = "Excellent!\n";
            break;
	case 3:
            rightAnswer = "Nice work!\n";
            break;
	case 4:
            rightAnswer = "Keep up the good work!\n";
            break;
	}

	//System.out.printf("%s", rightAnswer); //display affirming response
        return rightAnswer;
    }


    //method to determine response to user's incorrect answer
    public String incorrectAnswer(){

	//initialize local variables
        String wrongAnswer = "";
	int answer = 1 + rand.nextInt(4);

	//randomly generate response to user's answer
	switch(answer)
	{
	case 1:
            wrongAnswer = "No. Please try again.";
            break;
	case 2:
            wrongAnswer = "Wrong. Try once more.";
            break;
	case 3:
            wrongAnswer = "Don't give up!";
            break;
	case 4:
            wrongAnswer = "No. Keep trying.";
            break;
	}
        
	//System.out.printf("%s", wrongAnswer); //display condemning response
        return wrongAnswer;
    }
 
    
}