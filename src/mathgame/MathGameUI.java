/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathgame;


/**
 * @author: Mike Plucker, Billy Lam, Xavier Porter
 * Class: CSCI 2001-51
 * Due Date: 02/25/14
 * 
 * Version: final
 * 
 * 
 * Generates the GUI for the MathGame
 */


//import classes
import java.util.Random;
import java.io.*;


public class MathGameUI extends javax.swing.JFrame {
    
    //create MathGame object
    MathGame mathGame = new MathGame();
    
    //declare/instantiate field variables
    private int answer, guess, attempt = 0, correct = 0, incorrect = 0, totalAttempts, percentage;
    
    private final Random rand = new Random(); //create new random number generator
    
    //create sound files
    private final File cheer = new File("KidsCheer.wav");
    private final File boing = new File("boing.wav");
    private final File losingHorns = new File("losinghorns.wav");
    private final File finalScorePing = new File("finalscoreping.wav");
    
    
    /**
     * Creates new form ImageDisplay
     */
    public MathGameUI() {
        initComponents();
        userInputTextField.setText("Pick A Problem"); //set TextField telling user to select a problem
        userInputTextField.setEditable(false); //user cannot use TextField until selecting a problem
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        randomButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        feedbackLabel = new javax.swing.JLabel();
        userInputTextField = new javax.swing.JTextField();
        feedbackLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        correctLabel = new javax.swing.JLabel();
        incorrectLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        incorrectCountLabel = new javax.swing.JLabel();
        correctCountLabel = new javax.swing.JLabel();
        totalScoreLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Elementary Math Game");
        setMaximumSize(new java.awt.Dimension(710, 375));
        setMinimumSize(new java.awt.Dimension(710, 375));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Problem:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(205, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(205, 255, 255));

        addButton.setBackground(new java.awt.Color(51, 255, 0));
        addButton.setText("Addition");
        addButton.setMaximumSize(new java.awt.Dimension(73, 23));
        addButton.setMinimumSize(new java.awt.Dimension(73, 23));
        addButton.setPreferredSize(new java.awt.Dimension(73, 23));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        multiplyButton.setBackground(new java.awt.Color(0, 255, 255));
        multiplyButton.setText("Multiplication");
        multiplyButton.setMaximumSize(new java.awt.Dimension(73, 23));
        multiplyButton.setMinimumSize(new java.awt.Dimension(73, 23));
        multiplyButton.setPreferredSize(new java.awt.Dimension(73, 23));
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        divideButton.setBackground(new java.awt.Color(255, 255, 0));
        divideButton.setText("Division");
        divideButton.setMaximumSize(new java.awt.Dimension(73, 23));
        divideButton.setMinimumSize(new java.awt.Dimension(73, 23));
        divideButton.setPreferredSize(new java.awt.Dimension(73, 23));
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        subtractButton.setBackground(new java.awt.Color(255, 204, 0));
        subtractButton.setText("Subtraction");
        subtractButton.setMaximumSize(new java.awt.Dimension(73, 23));
        subtractButton.setMinimumSize(new java.awt.Dimension(73, 23));
        subtractButton.setPreferredSize(new java.awt.Dimension(73, 23));
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        randomButton.setBackground(new java.awt.Color(255, 255, 255));
        randomButton.setText("Random");
        randomButton.setMaximumSize(new java.awt.Dimension(73, 23));
        randomButton.setMinimumSize(new java.awt.Dimension(73, 23));
        randomButton.setPreferredSize(new java.awt.Dimension(73, 23));
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
            .addComponent(subtractButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(multiplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(divideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(randomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(multiplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(randomButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 110, 140, 180);
        jPanel2.getAccessibleContext().setAccessibleName("Select Problem :");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solve:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(205, 255, 255))); // NOI18N

        questionLabel.setBackground(new java.awt.Color(255, 255, 255));
        questionLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(questionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(200, 110, 210, 60);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Answer:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(205, 255, 255))); // NOI18N

        feedbackLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        feedbackLabel.setForeground(new java.awt.Color(79, 213, 214));
        feedbackLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feedbackLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        userInputTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputTextFieldActionPerformed(evt);
            }
        });

        feedbackLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        feedbackLabel2.setForeground(new java.awt.Color(79, 213, 214));
        feedbackLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feedbackLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(feedbackLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(userInputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(feedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(userInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feedbackLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(feedbackLabel2))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(190, 220, 230, 100);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Score:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(205, 255, 255))); // NOI18N

        correctLabel.setForeground(new java.awt.Color(0, 255, 255));
        correctLabel.setText("Correct");

        incorrectLabel.setForeground(new java.awt.Color(0, 255, 255));
        incorrectLabel.setText("Incorrect");

        imageLabel.setForeground(new java.awt.Color(255, 255, 255));
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageDisplay/math1.gif"))); // NOI18N

        incorrectCountLabel.setForeground(new java.awt.Color(255, 255, 255));

        correctCountLabel.setForeground(new java.awt.Color(255, 255, 255));

        totalScoreLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        totalScoreLabel.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(incorrectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(incorrectCountLabel)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(correctLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(correctCountLabel))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(totalScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(totalScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correctLabel)
                    .addComponent(correctCountLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incorrectLabel)
                    .addComponent(incorrectCountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(460, 110, 210, 210);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageDisplay/Math Game 4.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(694, 330));
        background.setMinimumSize(new java.awt.Dimension(694, 330));
        background.setOpaque(true);
        background.setPreferredSize(new java.awt.Dimension(700, 340));
        getContentPane().add(background);
        background.setBounds(0, -10, 710, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        setUpButton(); //call method to set-up button
        
        //create 2 random integers(from 1 to 9), then pass them through the addition method
        answer = mathGame.addition((1 + rand.nextInt(9)),(1 + rand.nextInt(9)));
        
        //set label to ask an addition question
        questionLabel.setText("What is " + mathGame.getNum1() + " plus " + mathGame.getNum2() + "? ");
        
        setUpComponents(); //call method to set up components after eath question
    }//GEN-LAST:event_addButtonActionPerformed

    private void userInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputTextFieldActionPerformed
        
        //calculate total attempts
        totalAttempts = correct + incorrect;
        
        guess = Integer.parseInt(userInputTextField.getText()); //read string input from user, convert to integer and assign to variable
        
        //if user's guess is incorrect
        if(guess != answer){
            if(attempt != 1){ //if first incorrect answer
                firstWrongAnswer(); //call firstWrongAnswer method
            }
            else{ //if second incorrect answer
                finalWrongAnswer(); //call finalWrongAnswer method            
            }
        }
        else{ //if user enters correct answer
            rightAnswer(); //call rightAnswer method
        }
    }//GEN-LAST:event_userInputTextFieldActionPerformed
    
    //method to take actions when first wrong answer is input
    private void firstWrongAnswer(){
        
        //set labels
        feedbackLabel.setText(mathGame.incorrectAnswer()); //call method to pick random incorrect answer phrase
        feedbackLabel2.setText("Please try again! "); //prompt user to guess again
        mathGame.soundClip(boing); //play sound clip
                
        guess = Integer.parseInt(userInputTextField.getText()); //read string input from user, convert to integer and assign to variable
        userInputTextField.selectAll(); //highlights TextField
        attempt++; //increment variable
    }
    
    //method to take actions when final wrong answer is input
    private void finalWrongAnswer(){
        
        //display correct answer after 2 failed attempts.
        feedbackLabel.setText("You are incorrect.");
        feedbackLabel2.setText("The Correct answer is " + answer);
        
        mathGame.soundClip(losingHorns);//play sound clip
        questionLabel.setText(""); //clear question label
        incorrect++; //increment variable
        incorrectCountLabel.setText("" + incorrect); //display # of questions answered incorrectly
        newProblem(); //call method that directs user to pick a new problem
        checkAttempts(); //call method that checks if user has answered 10 questions
    }
    
    //method to take actions when answer is correct
    private void rightAnswer(){       
        feedbackLabel.setText(mathGame.correctAnswer()); //call method to pick random correct answer phrase
        mathGame.soundClip(cheer); //play sound clip
        correct++; //increment variable
        correctCountLabel.setText("" + correct); //display # of questions answered correctly
        feedbackLabel2.setText(""); //clear feedbackLabel2
        newProblem(); //call method that directs user to pick a new problem
        checkAttempts(); //call method that checks if user has answered 10 questions
    }
    
    //method to set-up TextField that directs user to pick a new problem
    private void newProblem(){
        userInputTextField.setText("Pick A New Problem"); //Clear TextField for user to solve a new problem
        userInputTextField.setEditable(false); //Text in TextField cannot be deleted
    }
    
    //method that checks if user has answered 10 questions
    private void checkAttempts(){
        
        //if user answers 10 questions
        if(totalAttempts == 9){
            percentCorrect(); //call method to calculate percentage
        }
    }
    
    //method to calculate score percentage
    private void percentCorrect(){
        percentage = correct * 10; //calculate percentage
        totalScoreLabel.setText("Final Score = " + percentage + "%"); //display final score percentage
        questionLabel.setText("Please Play Again!"); //set label text to tell user game is over
        mathGame.soundClip(finalScorePing); //play sound clip
        
        clearFeedbackLabel(); //call method to clear feedback labels       
        correct = 0; //reset counter
        incorrect = 0; //reset counter
        correctCountLabel.setText(""); //clear label
        incorrectCountLabel.setText(""); //clear label
    }
    
    //method to clear Feedback Labels
    private void clearFeedbackLabel(){
        //set labels to null when button is pressed (clear feedback labels)
        feedbackLabel.setText("");
        feedbackLabel2.setText("");
    }
    
    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        setUpButton(); //call method to set-up button
        
        //create 2 random integers(from 1 to 9), then pass them through the multiply method
        answer = mathGame.multiply((1 + rand.nextInt(9)),(1 + rand.nextInt(9)));
        
        //set label to ask a multiplication question
        questionLabel.setText("What is " + mathGame.getNum1() + " times " + mathGame.getNum2() + "? ");
        
        setUpComponents(); //call method to set up components after eath question
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        setUpButton(); //call method to set-up button
        
        //create 2 random integers(from 1 to 9), then pass them through the subtraction method
        answer = mathGame.subtraction((1 + rand.nextInt(9)),(1 + rand.nextInt(9)));
        
        //If less than 0, ensure it's a positive answer
        if(answer <= 0){
            answer *= (-1); //makes answer positive
            questionLabel.setText("What is " + mathGame.getNum2() + " minus " + mathGame.getNum1() + "? "); //set label to ask a subtraction question
        }
        else{
            questionLabel.setText("What is " + mathGame.getNum1() + " minus " + mathGame.getNum2() + "? "); //set label to ask a subtraction question
        } 
        
        setUpComponents(); //call method to set up components after eath question
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        setUpButton(); //call method to set-up button
        
        //create 2 random integers(from 1 to 9), then pass them through the division method
        answer = mathGame.division((1 + rand.nextInt(9)),(1 + rand.nextInt(9)));
        
        //set label to ask a division question
        questionLabel.setText("What is " + mathGame.getNum2() + " divided by " + mathGame.getNum1() + "? ");
        
        setUpComponents(); //call method to set up components after eath question
    }//GEN-LAST:event_divideButtonActionPerformed

    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomButtonActionPerformed
        setUpButton(); //call method to set-up button
        
        //create random number(from 1 to 4)
        int random = 1 + rand.nextInt(4);
        
        //randomly generate math questions
        switch(random)
        {
        case 1:
            //create 2 random integers(from 1 to 9), then pass them through the addition method
            answer = mathGame.addition((1 + rand.nextInt(9)),(1 + rand.nextInt(9)));
            
            //set label to ask an addition question
            questionLabel.setText("What is " + mathGame.getNum1() + " plus " + mathGame.getNum2() + "? ");
            break;
        case 2:
            //create 2 random integers(from 1 to 9), then pass them through the subtraction method
            answer = mathGame.subtraction((1 + rand.nextInt(9)),(1 + rand.nextInt(9)));
        
            //If less than 0, ensure it's a positive answer
            if(answer <= 0){
                answer *= (-1); //makes answer positive
                questionLabel.setText("What is " + mathGame.getNum2() + " minus " + mathGame.getNum1() + "? "); //set label to ask a subtraction question
            }
            else{
                questionLabel.setText("What is " + mathGame.getNum1() + " minus " + mathGame.getNum2() + "? "); //set label to ask a subtraction question
            }
            break;
        case 3:
            //create 2 random integers(from 1 to 9), then pass them through the multiply method
            answer = mathGame.multiply((1 + rand.nextInt(9)),(1 + rand.nextInt(9)));
        
            //set label to ask a multiplication question
            questionLabel.setText("What is " + mathGame.getNum1() + " times " + mathGame.getNum2() + "? ");
            break;
        case 4:
            //create 2 random integers(from 1 to 9), then pass them through the division method
            answer = mathGame.division((1 + rand.nextInt(9)),(1 + rand.nextInt(9)));
        
            //set label to ask a division question
            questionLabel.setText("What is " + mathGame.getNum2() + " divided by " + mathGame.getNum1() + "? ");
            break; 
        }
        
        setUpComponents(); //call method to set up components after eath question
    }//GEN-LAST:event_randomButtonActionPerformed
    
    //method to set-up button
    private void setUpButton(){
        attempt = 0; //reset attempt to 0
        totalScoreLabel.setText(""); //clear label
    }
    
    //method to set up components after each question
    private void setUpComponents(){
        
        clearFeedbackLabel(); //call method to clear feedback labels
        
        userInputTextField.requestFocus(); //focus back on the textField after clicking button
        userInputTextField.setText(""); //Clear TextField for user to solve a new problem
        userInputTextField.setEditable(true); //Text in TextField can be edited
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MathGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MathGameUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel correctCountLabel;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JButton divideButton;
    private javax.swing.JLabel feedbackLabel;
    private javax.swing.JLabel feedbackLabel2;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel incorrectCountLabel;
    private javax.swing.JLabel incorrectLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton multiplyButton;
    public javax.swing.JLabel questionLabel;
    private javax.swing.JButton randomButton;
    private javax.swing.JButton subtractButton;
    private javax.swing.JLabel totalScoreLabel;
    private javax.swing.JTextField userInputTextField;
    // End of variables declaration//GEN-END:variables
}
