package me;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int points = 0;
    public static void main(String[] args) throws InterruptedException {

        while(true) {


            String[] questions = new String[5];
            questions[0] = "What is the capital of Sweden?";
            questions[1] = "How much states does the USA have?";
            questions[2] = "When the First World War has began? (year)";
            questions[3] = "Who rules Ukraine?";
            questions[4] = "How is the direction of sunrise called?";

            String[] answers = new String[5];
            answers[0] = "Stockholm";
            answers[1] = "50";
            answers[2] = "1914";
            answers[3] = "Zelenskyi";
            answers[4] = "East";


            String[] result = new String[6];
            result[0] = "Wow! You answered all of the questions right! You are awesome!";
            result[1] = "You done great!";
            result[2] = "Good, but you could do better.";
            result[3] = "Not well, but you can try again.";
            result[4] = "You done bad.";
            result[5] = "You are awful. Don't even look at me. Oh wait, you can't.";


            for (int i = 0; i < 5; i++) {
                petroOlexiyovuch(questions[i], answers[i]);
            }


            switch (points) {
                case 5 -> System.out.println(result[0]);
                case 4 -> System.out.println(result[1]);
                case 3 -> System.out.println(result[2]);
                case 2 -> System.out.println(result[3]);
                case 1 -> System.out.println(result[4]);
                default -> {
                    System.out.println(result[5]);
                    FinalResult(points);
                    TimeUnit.SECONDS.sleep(2);
                }
            }


            Scanner again = new Scanner(System.in);
            System.out.println("Do you want to try again?");
            if (again.next().equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;



            }
        }
    }
    public static void petroOlexiyovuch(String question, String rightAnswer) throws InterruptedException {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        if (answer.equals(rightAnswer)) {
            points++;
            System.out.println("Well done!");
        } else {
            System.out.println("Wrong. Right answer was: " +rightAnswer);
        }
        YourPoints(points);
        TimeUnit.SECONDS.sleep(1);
    }
    public static void YourPoints(int points) {
        System.out.println("Your current points: " + points + "/5");
    }
    public static void FinalResult(int points) {
        System.out.println("Your final score: " + points + "/5");
    }

}

