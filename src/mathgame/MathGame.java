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
import javax.sound.sampled.*;
import java.io.*;




public class MathGame {
    
    Random rand = new Random(); //create new random number generator
    
    
    //declare field variables
    int num1, num2;
    
    
    //constructor
    public MathGame (){
        
        
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
    
    
    //method to play sound clip
    public void soundClip(File soundFile){
        
        //Clip clip = null;
        //InputStream in;
        //InputStream path = getClass().getResource("/Audio/applause.wav");
        try{
            //in = new FileInputStream(new File("//Audio//applause.wav"));
            //AudioStream audios = new AudioStream(in);
            //AudioPlayer.player.start(audios);
            //URL url = this.getClass().getResource("audio/applause.wav");
            //AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getResource("/Audio/applause.wav"));
            //AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            
            AudioInputStream audio = AudioSystem.getAudioInputStream(soundFile); //open an audio input stream
            Clip clip = AudioSystem.getClip(); //get a sound clip resource
            clip.open(audio); //open audio clip and load samples from the audio input stream
            clip.start(); //plays sound clip
        }catch(UnsupportedAudioFileException uae){
            System.out.println(uae);
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
        catch(LineUnavailableException lua){
            System.out.println(lua);
        }  
        //return clip;
    }
    
    
    //method to calculate an addition problem
    public int addition(int num1, int num2){
        
        //pass integers from method parameters to field variables
        this.num1 = num1;
        this.num2 = num2;
        
        int sum = num1 + num2; //calculate sum of 2 numbers
        
        return sum; 
    }


    //method to calculate a subtraction problem
    public int subtraction(int num1, int num2){
        
        //pass integers from method parameters to field variables
        this.num1 = num1;
        this.num2 = num2;
        
        int difference = num1 - num2; //calculate difference of 2 numbers
        
        return difference;
    }


    //method to calculate a multiplication problem
    public int multiply (int num1, int num2){
        
        //pass integers from method parameters to field variables
        this.num1 = num1;
        this.num2 = num2;
        
        int product = num1 * num2; //calculate product of 2 numbers
        
        return product;
    }
    

    //method to calculate a division problem
    public int division(int num1, int num2){
        
        //pass integers from method parameters to field variable
        this.num1 = num1;
        this.num2 = num1 * num2;
        
        int quotient = (this.num2 / num1); //calculate quotient of 2 numbers
        
        return quotient;
    }


    //method to determine response to user's correct answer
    public String correctAnswer(){

	//initialize local variables
        String rightAnswer = "";
	int answer = 1 + rand.nextInt(4); //create random number

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
        return rightAnswer;
    }


    //method to determine response to user's incorrect answer
    public String incorrectAnswer(){

	//initialize local variables
        String wrongAnswer = "";
	int answer = 1 + rand.nextInt(4); //create random number

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
        return wrongAnswer;
    } 
}