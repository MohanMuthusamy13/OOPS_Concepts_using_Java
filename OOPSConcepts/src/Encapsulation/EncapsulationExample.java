package Encapsulation;


// GUESSING GAME

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class guessingGameDotCom {
    private int matrixSize = 5;
    private boolean[][] matrix = new boolean[matrixSize][matrixSize];
    private int m, n;
    private int score = 0, guess, getGuessesTaken = 0, guesses = 0;

    public int getRandomValue() {
        return ThreadLocalRandom.current().nextInt(0, 5);
    }
    public void buildBlankMatrix() {
        for (int i = 0;i < matrixSize;i++) {
            for (int j = 0;j < matrixSize;j++) {
                matrix[i][j] = false;
            }
        }
    }
    public boolean[][] fillBlanks() {
        for (int i = 0;i < matrixSize;i++) {
            m = getRandomValue();
            n = getRandomValue();
            matrix[m][n] = true;
        }
        return matrix;
    }

    public void startGame() {
        buildBlankMatrix();
        matrix = fillBlanks();

        for (int i = 0;i < matrixSize;i++) {
            for (int j = 0;j < matrixSize;j++) {
                System.out.printf("%b  %d%d   ", matrix[i][j], i, j);
            }
            System.out.println("\n");
        }

        System.out.println("\n\nEnter your guessing : [ 3 times ]");
        int x = 0;
        while (guesses < 3) {
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            int tempr = guess / 10;
            int tempc = guess % 10;
            if (matrix[tempr][tempc] == true) {
                score++;
            }
            guesses++;

        }

        if (score == 0) {
            System.out.println("Sry..! Score = 0.. \nTry Again :)");
        }
        else {
            System.out.println("Congrats..and Your score is " + score);
        }

//        System.out.println("You have taken " + guessesTaken + " guesses to reach score 3");

    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        guessingGameDotCom game = new guessingGameDotCom();
        game.startGame();
    }
}



// GUESSING GAME IN ARRAY

/*

import java.util.Scanner;

class gameHitter {
    private int size;
    private boolean[] array;
    private int strikingParts;
    private int guess, score = 0, guessLimits = 3;

    public void setStrikingParts(int num) {
        strikingParts = num;
    }
    public void startGame() {
        size = 5;
        int p = 0, k;
        array = new boolean[size];
        for (int i = 0;i < size;i++) {
            array[i] = false;
        }

        while(p < strikingParts) {
            k = (int)(Math.random() * 5);
            array[k] = true;
            p++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("User guess : \n");
        for (int i = 0;i < guessLimits;i++) {
            guess = sc.nextInt();
            if (array[guess]) {
                score++;
            }
        }

        for (int i = 0;i < size;i++) {
            System.out.printf("%b ", array[i]);
        }
        System.out.println("\n\n\nScore  -- >  " + score);
    }
}

public class Main {
    public static void main(String[] args) {
        gameHitter game = new gameHitter();
        game.setStrikingParts(3);
        game.startGame();
    }
}

 */
