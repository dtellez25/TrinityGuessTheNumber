package edu.trinity;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    Random random = new Random();

    int lowerBound = 1;
    int upperBound = 100;
    int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

    String correct = "correct";
    String wrong = "wrong";

    public String guess(int arg){
        if(arg == randomNumber){
            return correct;
        }else{
            return wrong;
        }
    }

}
