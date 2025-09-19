package com.neotech.lesson05;

public class NestedElseIf {

    // Write a Java program to check if a student has done the Quiz.
    // If the student did the Quiz, then check the score and give the
    // following evaluations:
    // ◆ If the score is 90 or greater, print “A, Great job!”.
    // ◆ If the score is 80 or greater but less than 90, print “B, Well done!”.
    // ◆ If the score is 70 or greater but less than 80, print “C, You passed!”.
    // ◆ Otherwise, print “F, You failed”
    // If the student did not do the Quiz, print "You did not do the quiz,
    // so you failed!"
    public static void main(String[] args) {

        boolean isQuizTaken = true;
        byte score = 125;

        if (isQuizTaken) {

            // here check for the student score since the quiz is taken
            if (score >= 90) {
                System.out.println("A, Great job!");
            } else if (score >= 80) {
                System.out.println("B, Well done!");
            } else if (score >= 70) {
                System.out.println("C, You passed!");
            } else {
                System.out.println("F, You failed");
            }

        } else { // quiz is NOT taken
            System.out.println("You did not do the quiz, so you failed!");
        }

    }

}