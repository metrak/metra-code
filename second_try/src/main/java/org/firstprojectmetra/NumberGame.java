package org.firstprojectmetra;

import java.util.*;

public class NumberGame {
    private static Scanner userInput = new Scanner(System.in);

    private static void game_startup() {

        List<Integer> generatedNumbers = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            if (i >= 0) {
                generatedNumbers.add(i);
            }
        }

        System.out.println("*****************************************");
        System.out.println("********Welcome to my Number Game********");
        System.out.println("*****************************************");
        System.out.println();
        System.out.print("Enter a number between 0 & 1000 >>> ");
        String numberInput = userInput.nextLine();
        Integer guessedNumber = Integer.valueOf(numberInput);

        Random random = new Random();
        Integer randomElement = generatedNumbers.get(random.nextInt(generatedNumbers.size()));


        boolean moreThenOneGuess = false;
        int counter = 1;


        while (!guessedNumber.equals(randomElement)) {
            if (guessedNumber > randomElement) {
                System.out.print("Lower... Try again >>>");
                String nextGuess = userInput.nextLine();
                Integer intGuess = 0;
                intGuess = Integer.parseInt(nextGuess);
                guessedNumber = intGuess;
                moreThenOneGuess = true;
                counter++;
            } else if (guessedNumber < randomElement) {
                System.out.print("Higher...Try again >>>");
                Integer intGuess = 0;
                String nextGuess = userInput.nextLine();
                intGuess = Integer.parseInt(nextGuess);
                guessedNumber = intGuess;
                moreThenOneGuess = true;
                counter++;
            }
        }
        if (guessedNumber.equals(randomElement) && !moreThenOneGuess) {
            System.out.println("Lucky first guess! Awesome!");
            System.exit(0);
        } else if (guessedNumber.equals(randomElement) && moreThenOneGuess) {
            System.out.println("You got it in " + counter + " tries, good job!");
            System.exit(0);
        }

    }


    public static void main(String[] args) {
        game_startup();

    }
}